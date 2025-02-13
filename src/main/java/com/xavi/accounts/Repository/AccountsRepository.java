package com.xavi.accounts.Repository;

import com.xavi.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository <Accounts, Long> {

}