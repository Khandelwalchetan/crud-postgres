package com.example.crudpostgres.service.implementation;

import com.example.crudpostgres.model.Animal;
import com.example.crudpostgres.repository.AnimalRepository;
import com.example.crudpostgres.service.abstraction.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @Override
    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal findAnimalById(Long id) {
        return animalRepository.findAnimalById(id);
    }

    @Override
    public void deleteAnimalByID(Animal animal) {
        animalRepository.delete(animal);
    }
}
