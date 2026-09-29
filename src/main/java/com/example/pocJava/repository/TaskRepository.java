package com.example.pocJava.repository;

import com.example.pocJava.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task  ,Long> {
    List<Task> findByResponsibleContainingIgnoreCase(String responsible);

    List<Task> findByDateDelivery(LocalDate dateDelivery);

    List<Task> findByfinishedFalse();

    List<Task> findByfinishedFalseAndDateDeliveryContainingIgnoreCase(String responsible);
}
