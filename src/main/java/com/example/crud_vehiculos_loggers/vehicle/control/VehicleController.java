package com.example.crud_vehiculos_loggers.vehicle.control;
import com.example.crud_vehiculos_loggers.vehicle.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/all")
    public List<Vehicle> getAllVehicle() {
        return vehicleService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Vehicle> getVehicletById(@PathVariable Long id) {
        return vehicleService.findById(id);
    }

    @PostMapping("/save")
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @PutMapping("/update")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.update(vehicle);
    }

    @DeleteMapping("/{id}")
    public boolean deleteVehicle(@PathVariable Long id) {
        return vehicleService.deleteById(id);
    }
}
