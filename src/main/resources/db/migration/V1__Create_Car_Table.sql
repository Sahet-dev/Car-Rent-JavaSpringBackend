CREATE TABLE cars (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      brand VARCHAR(255),
                      model VARCHAR(255),
                      year INT,
                      license_plate VARCHAR(255),
                      daily_rate DOUBLE,
                      available BOOLEAN,
                      image VARCHAR(255)
);

INSERT INTO cars (brand, model, year, license_plate, daily_rate, available, image) VALUES
                                                                                       ('Toyota', 'Corolla', 2020, 'ABC123', 50.0, TRUE, 'path/to/car1.jpg'),
                                                                                       ('Honda', 'Civic', 2021, 'DEF456', 55.0, TRUE, 'path/to/car3.jpg'),
                                                                                       ('Hyundai', 'Elantra', 2019, 'GHI789', 52.0, TRUE, 'path/to/car4.jpg'),
                                                                                       ('Nissan', 'Altima', 2018, 'JKL012', 60.0, FALSE, 'path/to/car5.jpg'),
                                                                                       ('Toyota', 'RAV4', 2021, 'MNO345', 70.0, TRUE, 'path/to/car6.jpg'),
                                                                                       ('Ford', 'Explorer', 2020, 'PQR678', 80.0, TRUE, 'path/to/car7.jpg'),
                                                                                       ('Honda', 'CR-V', 2019, 'STU901', 75.0, FALSE, 'path/to/car8.jpg'),
                                                                                       ('Jeep', 'Wrangler', 2021, 'VWX234', 85.0, TRUE, 'path/to/car9.jpg'),
                                                                                       ('Ford', 'Mustang', 2020, 'YZA567', 120.0, FALSE, 'path/to/car2.jpg'),
                                                                                       ('Chevrolet', 'Corvette', 2021, 'BCD890', 150.0, TRUE, 'path/to/car10.jpg'),
                                                                                       ('Porsche', '911', 2020, 'EFG123', 180.0, TRUE, 'path/to/car11.jpg'),
                                                                                       ('Lamborghini', 'Huracán', 2021, 'HIJ456', 300.0, FALSE, 'path/to/car12.jpg'),
                                                                                       ('Ford', 'F-150', 2020, 'KLM789', 90.0, TRUE, 'path/to/car13.jpg'),
                                                                                       ('Chevrolet', 'Silverado', 2021, 'NOP012', 95.0, TRUE, 'path/to/car14.jpg'),
                                                                                       ('Ram', '1500', 2019, 'QRS345', 100.0, FALSE, 'path/to/car15.jpg'),
                                                                                       ('Toyota', 'Tundra', 2021, 'TUV678', 92.0, TRUE, 'path/to/car16.jpg');
