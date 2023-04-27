package com.jvmeneses.hrworker.services;

import com.jvmeneses.hrworker.dto.WorkerDTO;
import com.jvmeneses.hrworker.entities.Worker;
import com.jvmeneses.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Transactional
    public Page<WorkerDTO> findAll(Pageable pageble){
       Page<Worker> result = workerRepository.findAll(pageble);
       return result.map(x -> new WorkerDTO(x));
    }

    @Transactional
    public WorkerDTO findById(Long id){
        Worker entity = workerRepository.findById(id).get();
        return new WorkerDTO(entity);
    }

}
