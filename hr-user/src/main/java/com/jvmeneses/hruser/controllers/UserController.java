package com.jvmeneses.hruser.controllers;

import com.jvmeneses.hruser.dto.UserDTO;
import com.jvmeneses.hruser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping(value = "/search")
    public ResponseEntity<UserDTO> findById(@RequestParam String email){
        return ResponseEntity.ok(userService.findByEmail(email));
    }

}

