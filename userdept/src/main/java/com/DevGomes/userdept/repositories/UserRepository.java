package com.DevGomes.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevGomes.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
