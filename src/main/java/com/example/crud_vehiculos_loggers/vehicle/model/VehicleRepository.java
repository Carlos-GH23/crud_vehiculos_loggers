package com.example.crud_vehiculos_loggers.vehicle.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VehicleRepository  extends JpaRepository<Vehicle, Long>{
    List<Vehicle> findAllByName(String name);
}
