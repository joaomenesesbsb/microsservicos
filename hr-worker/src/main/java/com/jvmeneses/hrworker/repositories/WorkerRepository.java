package com.jvmeneses.hrworker.repositories;

import com.jvmeneses.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
