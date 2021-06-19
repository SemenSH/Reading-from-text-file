package ru.sber.bootcamp.dto;

import lombok.Data;

import java.util.List;

@Data
public class City {
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    private List<City> cityList;


    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }
}
