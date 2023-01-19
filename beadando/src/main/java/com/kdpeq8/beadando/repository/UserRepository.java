package com.kdpeq8.beadando.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdpeq8.beadando.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findUserByEmail(String email);
}
