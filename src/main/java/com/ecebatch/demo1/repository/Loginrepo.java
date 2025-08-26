package com.ecebatch.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecebatch.demo1.domain.User;

@Repository
public interface Loginrepo extends JpaRepository<User,String> {
User findByUsernameAndPassword(String username, String password);

}
