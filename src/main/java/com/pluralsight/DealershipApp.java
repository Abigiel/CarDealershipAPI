package com.pluralsight;

import com.pluralsight.Dao.VehicleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DealershipApp implements CommandLineRunner {
    private VehicleDao DAO;
    @Autowired
    public DealershipApp(VehicleDao DAO) {
        this.DAO = DAO;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
