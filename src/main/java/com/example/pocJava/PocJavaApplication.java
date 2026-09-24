package com.example.pocJava;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	// Seus métodos de banco de dados ficam aqui

	List<Task> findByResponsibleContaininIgnoreCase(String responsible);
}
