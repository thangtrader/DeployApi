package com.example.demo.Repository;

import com.example.demo.Models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
}
