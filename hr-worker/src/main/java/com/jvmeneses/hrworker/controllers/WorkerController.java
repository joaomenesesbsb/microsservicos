package com.jvmeneses.hrworker.controllers;

import com.jvmeneses.hrworker.dto.WorkerDTO;
import com.jvmeneses.hrworker.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping
    public ResponseEntity<Page<WorkerDTO>> findAll(Pageable pageable){
        return ResponseEntity.ok(workerService.findAll(pageable));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(workerService.findById(id));
    }

}
