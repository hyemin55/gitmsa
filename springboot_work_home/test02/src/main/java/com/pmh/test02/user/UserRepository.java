package com.pmh.test02.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

//    Optional로 user객체를 감싸고 자동으로 오른쪽 구문이 만들어진다. -> select * from where email = ?
    Optional<User> findByEmail(String email);
}
