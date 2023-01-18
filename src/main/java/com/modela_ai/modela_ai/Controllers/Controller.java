package com.modela_ai.modela_ai.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modela_ai.modela_ai.dto.CarDto;
import com.modela_ai.modela_ai.model.Car;
import com.modela_ai.modela_ai.repository.CarRepository;

@RestController
@RequestMapping("/")

public class Controller {
    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public void postCar(@RequestBody CarDto req) {
        repository.save(new Car(req));
    }
}
