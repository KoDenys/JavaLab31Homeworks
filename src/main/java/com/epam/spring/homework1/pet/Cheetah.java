package com.epam.spring.homework1.pet;

import org.springframework.stereotype.Component;

@Component
public class Cheetah implements Animal{
    public String getAnimal(){
        return this.getClass().getSimpleName();
    }
}
