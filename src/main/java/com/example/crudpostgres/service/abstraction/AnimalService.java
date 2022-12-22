package com.example.crudpostgres.service.abstraction;

import com.example.crudpostgres.model.Animal;

import java.util.List;

public interface AnimalService {

    List<Animal> findAll();

    Animal save(Animal animal);
    Animal findAnimalById(Long id);

    void deleteAnimalByID(Animal animal);


}
