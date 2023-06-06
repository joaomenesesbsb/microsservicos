package com.jvmeneses.hruser.services;

import com.jvmeneses.hruser.dto.UserDTO;
import com.jvmeneses.hruser.entities.User;
import com.jvmeneses.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    @Transactional
    public UserDTO findById(Long id){
        User entity = userRepository.findById(id).get();
        return new UserDTO(entity);
    }

    @Transactional
    public UserDTO findByEmail(String email){
        User entity = userRepository.findByEmail(email);
        return new UserDTO(entity);
    }
}
