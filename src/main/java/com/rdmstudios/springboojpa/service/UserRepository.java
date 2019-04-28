package com.rdmstudios.springboojpa.service;

import com.rdmstudios.springboojpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
