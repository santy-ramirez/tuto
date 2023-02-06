package com.saniago.tutorial.repository;

import com.saniago.tutorial.domain.ERole;
import com.saniago.tutorial.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole eRole);
}
