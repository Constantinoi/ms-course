package com.devsup.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsup.work.entites.User;

public interface WorkerRepository extends JpaRepository<User, Long> {

}
