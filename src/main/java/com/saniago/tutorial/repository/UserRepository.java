package com.saniago.tutorial.repository;

import com.saniago.tutorial.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Long> {
    /*Boolean existsByUsername(String username);
    Boolean existsByEmail( String Email);*/
}
