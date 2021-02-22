package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repositories.AnimalRepository;
import com.lambdaschool.zoos.repositories.ZooRepository;
import com.lambdaschool.zoos.views.CountAnimalInZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "zooService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalrepos;


    @Override
    public ArrayList<CountAnimalInZoo> getCountAnimalInZoo()
    {
        ArrayList<CountAnimalInZoo> list = new ArrayList<>();
        animalrepos.findAll();
        return list;
    }

}
