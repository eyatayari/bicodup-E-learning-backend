package com.jra.pma.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jra.pma.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUsername(String username);
}
