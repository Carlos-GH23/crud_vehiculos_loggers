package com.example.crud_vehiculos_loggers.vehicle.model;
import jakarta.persistence.*;

@Entity
@Table(name = "modelos")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",columnDefinition = "VARCHAR(50)")
    private String name;

    @Column(name = "description",columnDefinition = "VARCHAR(100)")
    private String description;

    @Column(name = "brand", columnDefinition = "VARCHAR(50)")
    private String brand;

    public Vehicle() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
