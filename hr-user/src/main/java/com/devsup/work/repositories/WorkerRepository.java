package com.devsup.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsup.work.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
