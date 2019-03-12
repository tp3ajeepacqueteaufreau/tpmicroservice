package org.mines.douai.pacqueteau_freau.bancairebackend.controller;

import org.mines.douai.pacqueteau_freau.bancairebackend.dto.Account;
import org.mines.douai.pacqueteau_freau.bancairebackend.dto.IbanRequestDto;
import org.mines.douai.pacqueteau_freau.bancairebackend.dto.TransactionBancaire;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.AccountService;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.IbanService;
import org.mines.douai.pacqueteau_freau.bancairebackend.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    
    Logger logger = LoggerFactory.getLogger(AccountController.class);
    
    @Autowired
    private AccountService accountService;
    
    @Autowired
    private IbanService ibanService;
    
    @Autowired
    private TransactionService transactionService;
    
    @CrossOrigin(origins = "*")
    @GetMapping("/account")
    public List<Account> getAllAccount() {
        return this.accountService.getAllAccount();
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/account/{id}")
    public Account getAnAccount(@PathVariable("id") Long id) {
        return this.accountService.getAccountById(id);
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/account/{id}/transaction")
    public List<TransactionBancaire> getAllTranscation(@PathVariable("id") Long id) {
        return this.transactionService.getAllTransacation(id);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/account")
    public Account addNewAccount(@RequestBody Account account) {
        logger.info("Ask for account creation");
        logger.info(account.getIban());
        if (this.ibanService.checkIban(new IbanRequestDto(account.getIban())).isOk()) {
            logger.info("IBAN is ok");
            this.accountService.saveOrUpdate(account);
            return account;
        } else {
            logger.info("IBAN is not ok");
            return null;
        }
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/transaction")
    public TransactionBancaire performTransaction(@RequestBody TransactionBancaire ordre) {
        Account from = this.accountService.getAccountById(ordre.getAccountFrom());
        Account to = this.accountService.getAccountById(ordre.getAccountTo());
        
        logger.info("From: " + from);
        logger.info("To: " + to);
        
        from.setAmount(from.getAmount().subtract(ordre.getMontant()));
        to.setAmount(to.getAmount().add(ordre.getMontant()));
        
        this.accountService.saveOrUpdate(from);
        this.accountService.saveOrUpdate(to);
        
        this.transactionService.saveOrUpdate(ordre);
        
        return ordre;
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/account/{id}")
    public void deleteAccount(@PathVariable("id") Long id) {
        this.accountService.delete(id);
    }
    
}
