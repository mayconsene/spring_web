package com.maycon.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maycon.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{	

}


