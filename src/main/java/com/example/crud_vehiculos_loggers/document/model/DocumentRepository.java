package com.example.crud_vehiculos_loggers.document.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
