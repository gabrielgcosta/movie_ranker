package com.gabrielcosta.movie_ranker.modules.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.gabrielcosta.movie_ranker.modules.entities.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity, UUID>{

    UserDetails findByLogin(String login);
    
}
