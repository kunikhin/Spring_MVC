package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    private List<Car> cars;
    private static int ID_INCR = 0;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++ID_INCR, "Audi", "white"));
        cars.add(new Car(++ID_INCR, "BMW", "blue"));
        cars.add(new Car(++ID_INCR, "Mercedes", "black"));
        cars.add(new Car(++ID_INCR, "VW", "yellow"));
        cars.add(new Car(++ID_INCR, "Opel", "green"));
    }


    public List<Car> getCars(int count) {
        return cars.stream().filter(car -> car.getId() <= count).collect(Collectors.toList());
    }
}

