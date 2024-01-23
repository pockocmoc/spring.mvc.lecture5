package com.pockocmoc.spring.mvc.lecture5.repository;


import com.pockocmoc.spring.mvc.lecture5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
