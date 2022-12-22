package com.example.crudpostgres.controller;


import com.example.crudpostgres.model.Animal;
import com.example.crudpostgres.repository.AnimalRepository;
import com.example.crudpostgres.service.abstraction.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animals")
    public List<Animal> getAllEmployees(){
        return animalService.findAll();
    }


    @PostMapping("/animals")
    public Animal createEmployee(@RequestBody Animal animal) {
        return animalService.save(animal);
    }


    @GetMapping("/animals/{id}")
    public ResponseEntity<Animal> getEmployeeById(@PathVariable Long id) {
        Animal animal = animalService.findAnimalById(id);
        return ResponseEntity.ok(animal);
    }


    @PostMapping("/animals/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Animal animal = animalService.findAnimalById(id);

         animalService.deleteAnimalByID(animal);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
