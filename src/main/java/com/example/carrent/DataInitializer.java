package com.example.carrent;

import com.example.carrent.model.Car;
import com.example.carrent.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        carRepository.saveAll(Arrays.asList(
                new Car(null, "Toyota", "Corolla", 2020, "ABC123", 50.0, true, "path/to/car1.jpg"),
                new Car(null, "Honda", "Civic", 2021, "DEF456", 55.0, true, "path/to/car3.jpg"),
                new Car(null, "Hyundai", "Elantra", 2019, "GHI789", 52.0, true, "path/to/car4.jpg"),
                new Car(null, "Nissan", "Altima", 2018, "JKL012", 60.0, false, "path/to/car5.jpg"),
                new Car(null, "Toyota", "RAV4", 2021, "MNO345", 70.0, true, "path/to/car6.jpg"),
                new Car(null, "Ford", "Explorer", 2020, "PQR678", 80.0, true, "path/to/car7.jpg"),
                new Car(null, "Honda", "CR-V", 2019, "STU901", 75.0, false, "path/to/car8.jpg"),
                new Car(null, "Jeep", "Wrangler", 2021, "VWX234", 85.0, true, "path/to/car9.jpg"),
                new Car(null, "Ford", "Mustang", 2020, "YZA567", 120.0, false, "path/to/car2.jpg"),
                new Car(null, "Chevrolet", "Corvette", 2021, "BCD890", 150.0, true, "path/to/car10.jpg"),
                new Car(null, "Porsche", "911", 2020, "EFG123", 180.0, true, "path/to/car11.jpg"),
                new Car(null, "Lamborghini", "Huracán", 2021, "HIJ456", 300.0, false, "path/to/car12.jpg"),
                new Car(null, "Ford", "F-150", 2020, "KLM789", 90.0, true, "path/to/car13.jpg"),
                new Car(null, "Chevrolet", "Silverado", 2021, "NOP012", 95.0, true, "path/to/car14.jpg"),
                new Car(null, "Ram", "1500", 2019, "QRS345", 100.0, false, "path/to/car15.jpg"),
                new Car(null, "Toyota", "Tundra", 2021, "TUV678", 92.0, true, "path/to/car16.jpg")
        ));
    }
}
