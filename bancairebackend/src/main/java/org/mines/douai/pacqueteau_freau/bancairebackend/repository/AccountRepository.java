package org.mines.douai.pacqueteau_freau.bancairebackend.repository;

import org.mines.douai.pacqueteau_freau.bancairebackend.dto.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
