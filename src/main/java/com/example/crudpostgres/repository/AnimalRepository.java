package com.example.crudpostgres.repository;

import com.example.crudpostgres.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {

    Animal findAnimalById(Long id);

}
