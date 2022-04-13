package com.jra.pma.services.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.jra.pma.models.User;
import com.jra.pma.models.UserRole;
import com.jra.pma.repo.RoleRepository;
import com.jra.pma.repo.UserRepository;
import com.jra.pma.services.UserService;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository ;

    // Creating user
    @Override
    public User CreateUser(User user, Set<UserRole> userRoles) {

        User local = this.userRepository.findByUsername(user.getUsername());
        if(local!=null){
            System.out.println("User is already there !");
            try {
                throw new Exception("User already present !");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            // User created
            for(UserRole ur : userRoles){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local= this.userRepository.save(user);
        }


        return local;
    }
    // getting user by username
    @Override
    public User getUser(String username){
        return this.userRepository.findByUsername(username);
    }

    // deleting user by ID
    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }
}

