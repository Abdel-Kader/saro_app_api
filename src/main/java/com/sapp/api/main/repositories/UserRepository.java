package com.sapp.api.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapp.api.main.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
