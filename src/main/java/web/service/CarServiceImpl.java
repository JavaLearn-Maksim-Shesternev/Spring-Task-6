package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Land Rover", "Defender", "green"));
        cars.add(new Car("Nissan", "Patrol", "white"));
        cars.add(new Car("Lixiang", "Li 9", "silver"));
        cars.add(new Car("Zeekr", "001", "orange"));
        cars.add(new Car("Toyota", "Land Cruiser Prado", "black"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size() || count < 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}