package com.example.crud_vehiculos_loggers.vehicle.control;
import com.example.crud_vehiculos_loggers.vehicle.model.Vehicle;
import com.example.crud_vehiculos_loggers.vehicle.model.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Transactional(readOnly = true)
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Vehicle> findById(Long id) {
        return vehicleRepository.findById(id);
    }

    @Transactional(rollbackFor = {SQLException.class})
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Transactional(rollbackFor = {SQLException.class})
    public Vehicle update(Vehicle vehicle) {
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(vehicle.getId());
        if (vehicleOptional.isPresent()) {
            Vehicle vehicleNew = vehicleOptional.get();
            vehicleNew.setName(vehicle.getName());
            vehicleNew.setDescription(vehicle.getDescription());
            vehicleNew.setBrand(vehicle.getBrand());
            return vehicleRepository.save(vehicleNew);
        }
        return null;
    }
    @Transactional(rollbackFor = {SQLException.class})
    public boolean deleteById(Long id) {
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(id);
        if (vehicleOptional.isPresent()) {
            vehicleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
