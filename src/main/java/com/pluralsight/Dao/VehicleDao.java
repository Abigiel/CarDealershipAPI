package com.pluralsight.Dao;

import com.pluralsight.models.Vehicle;

import java.util.List;

public interface VehicleDao {



    public List<Vehicle> getAllVehicles();

    public List<Vehicle> getVehicleByPriceRange(double minPrice, double maxPrice);

    public List<Vehicle> getVehicleByMakeModel(String inputMake, String inputModel);

    public List<Vehicle> getVehicleByYearRange(int minYear, int maxYear);

    public List<Vehicle> getVehicleByColor(String inputColor);

    public List<Vehicle> getVehicleByType(String inputType);

    public Vehicle addVehicle(Vehicle vehicle);

    public Vehicle removeVehicle(Vehicle vehicle);



}
