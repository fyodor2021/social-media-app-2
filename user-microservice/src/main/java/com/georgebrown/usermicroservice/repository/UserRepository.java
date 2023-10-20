package com.georgebrown.usermicroservice.repository;

import com.georgebrown.usermicroservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
