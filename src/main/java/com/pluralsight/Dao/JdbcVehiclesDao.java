package com.pluralsight.Dao;

import com.pluralsight.models.Vehicle;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcVehiclesDao implements VehicleDao{
    private DataSource dataSource;
    @Autowired
    public JdbcVehiclesDao(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> allVehicles = new ArrayList<>();
        return allVehicles;
    }

    @Override
    public List<Vehicle> getVehicleByPriceRange(double minPrice, double maxPrice) {
        List<Vehicle> vehicleListByPrice = new ArrayList<>();

        String sql = "SELECT * FROM vehicles v\n" +
                "JOIN sales_contracts s ON v.VIN = s.VIN\n" +
                "WHERE sale_price BETWEEN ? AND ?;";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2,maxPrice);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int vehicleId = resultSet.getInt("vehicle_id");
                int year = resultSet.getInt("year");
                int mileage = resultSet.getInt("mileage");
                int sold = resultSet.getInt("SOLD");

                String VIN = resultSet.getString("VIN");
                String make = resultSet.getString("make");
                String model = resultSet.getString("model");
                String color = resultSet.getString("Color");
                String fuelType = resultSet.getString("fuel_type");
                String transmissionType = resultSet.getString("transmission_type");

                Vehicle vehicle = new Vehicle(vehicleId,year,  mileage,  sold,  VIN,  make,  model,  color,  fuelType,  transmissionType);
                vehicleListByPrice.add(vehicle);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicleListByPrice;

    }

    @Override
    public List<Vehicle> getVehicleByMakeModel(String inputMake, String inputModel) {
        List<Vehicle> vehicleListByMakeModel = new ArrayList<>();

        String sql = "SELECT * FROM vehicles \n" +
                "WHERE make = ? AND model = ?;";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1,inputMake);
            preparedStatement.setString(2,inputModel);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int vehicleId = resultSet.getInt("vehicle_id");
                int year = resultSet.getInt("year");
                int mileage = resultSet.getInt("mileage");
                int sold = resultSet.getInt("SOLD");

                String VIN = resultSet.getString("VIN");
                String make = resultSet.getString("make");
                String model = resultSet.getString("model");
                String color = resultSet.getString("Color");
                String fuelType = resultSet.getString("fuel_type");
                String transmissionType = resultSet.getString("transmission_type");

                Vehicle vehicle = new Vehicle(vehicleId,year,  mileage,  sold,  VIN,  make,  model,  color,  fuelType,  transmissionType);
                vehicleListByMakeModel.add(vehicle);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicleListByMakeModel;
    }

    @Override
    public List<Vehicle> getVehicleByYearRange(int minYear, int maxYear) {
        List<Vehicle> vehicleListByYear = new ArrayList<>();

        String sql = "SELECT * FROM vehicles v\n" +
                "WHERE year BETWEEN ? AND ?;";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1,minYear);
            preparedStatement.setInt(2,maxYear);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int vehicleId = resultSet.getInt("vehicle_id");
                int year = resultSet.getInt("year");
                int mileage = resultSet.getInt("mileage");
                int sold = resultSet.getInt("SOLD");

                String VIN = resultSet.getString("VIN");
                String make = resultSet.getString("make");
                String model = resultSet.getString("model");
                String color = resultSet.getString("Color");
                String fuelType = resultSet.getString("fuel_type");
                String transmissionType = resultSet.getString("transmission_type");

                Vehicle vehicle = new Vehicle(vehicleId,year,  mileage,  sold,  VIN,  make,  model,  color,  fuelType,  transmissionType);
                vehicleListByYear.add(vehicle);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicleListByYear;

    }

    @Override
    public List<Vehicle> getVehicleByColor(String inputColor) {
        List<Vehicle> vehicleListByColor = new ArrayList<>();

        String sql = "SELECT * FROM vehicles \n" +
                "WHERE Color = ?;";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1,inputColor);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int vehicleId = resultSet.getInt("vehicle_id");
                int year = resultSet.getInt("year");
                int mileage = resultSet.getInt("mileage");
                int sold = resultSet.getInt("SOLD");

                String VIN = resultSet.getString("VIN");
                String make = resultSet.getString("make");
                String model = resultSet.getString("model");
                String color = resultSet.getString("Color");
                String fuelType = resultSet.getString("fuel_type");
                String transmissionType = resultSet.getString("transmission_type");

                Vehicle vehicle = new Vehicle(vehicleId,year,  mileage,  sold,  VIN,  make,  model,  color,  fuelType,  transmissionType);
                vehicleListByColor.add(vehicle);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicleListByColor;
    }

    @Override
    public List<Vehicle> getVehicleByType(String inputType) {
        List<Vehicle> vehicleListByColor = new ArrayList<>();

        String sql = "SELECT * FROM vehicles \n" +
                "WHERE Color = ?;";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1,inputType);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int vehicleId = resultSet.getInt("vehicle_id");
                int year = resultSet.getInt("year");
                int mileage = resultSet.getInt("mileage");
                int sold = resultSet.getInt("SOLD");

                String VIN = resultSet.getString("VIN");
                String make = resultSet.getString("make");
                String model = resultSet.getString("model");
                String color = resultSet.getString("Color");
                String fuelType = resultSet.getString("fuel_type");
                String transmissionType = resultSet.getString("transmission_type");

                Vehicle vehicle = new Vehicle(vehicleId,year,  mileage,  sold,  VIN,  make,  model,  color,  fuelType,  transmissionType);
                vehicleListByColor.add(vehicle);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehicleListByColor;
    }

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public Vehicle removeVehicle(Vehicle vehicle) {
        return null;
    }
}
