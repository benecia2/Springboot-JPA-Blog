package com.cos.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

// User는 테이블이 관리하는 레파지토리 그리고 User 테이블의 기본키는 Integer(숫자)야
// DAO
// 자동으로 bean 등록이 된다.
//@Repository // 생략 가능하다.
public interface UserRepository extends JpaRepository<User, Integer>{
	// SELECT * FROM user WHERE username =1?;
	Optional<User> findByUsername(String username);
}


// JPA Naming 쿼리
// SELECT * FROM user WHERE username = ?1 AND password = ?2;
//User findByUsernameAndPassword(String username, String password);

//@Query(value = "SELECT * FROM user WHERE username = ?1 AND password = ?2", nativeQuery = true)
//User login(String username, String password);