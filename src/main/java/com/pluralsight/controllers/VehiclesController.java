package com.pluralsight.controllers;

import com.pluralsight.Dao.VehicleDao;
import com.pluralsight.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class VehiclesController {
    @Autowired
    private VehicleDao DAO;
    @RequestMapping(path ="/vehicles", method = RequestMethod.GET)
    public List<Vehicle> getAllVehicles() throws SQLException{
        return DAO.getAllVehicles();
    }
    @RequestMapping(path = "/vehicles/price/{minPrice}/{maxPrice}", method = RequestMethod.GET)
    public List<Vehicle> getVehicleByPrice(
            @PathVariable double minPrice,
            @PathVariable double maxPrice
    ) throws SQLException {
        return DAO.getVehicleByPriceRange(minPrice, maxPrice);
    }
    @RequestMapping(path = "/vehicles/make_model/{make}/{model}", method = RequestMethod.GET)
    public List<Vehicle> getVehicleByPrice(
            @PathVariable String make,
            @PathVariable String model
    ) throws SQLException {
        return DAO.getVehicleByMakeModel(make, model);
    }
    @RequestMapping(path = "/vehicles/year/{minYear}/{maxYear}", method = RequestMethod.GET)
    public List<Vehicle> getVehicleByYear(
            @PathVariable int minYear,
            @PathVariable int maxYear
    ) throws SQLException {
        return DAO.getVehicleByYearRange(minYear, maxYear);
    }
    @RequestMapping(path = "/vehicles/color/{color}", method = RequestMethod.GET)
    public List<Vehicle> getVehicleByColor(
            @PathVariable String color
    ) throws SQLException {
        return DAO.getVehicleByColor(color);
    }

}
