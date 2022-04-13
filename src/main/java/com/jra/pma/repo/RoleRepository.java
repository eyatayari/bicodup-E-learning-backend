package com.jra.pma.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jra.pma.models.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
