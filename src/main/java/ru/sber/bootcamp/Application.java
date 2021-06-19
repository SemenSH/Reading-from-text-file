package ru.sber.bootcamp;
import ru.sber.bootcamp.dto.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        List<City> listCities = new ArrayList<>();
        String separator = File.separator;
        String path = separator+"Users"+separator+"79041"+separator+"Desktop"+separator+"cities.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] words = line.split(";");
            listCities.add(new City(words[0], words[1], words[2], Integer.parseInt(words[3]), words[4]));
        }
        for (City city : listCities)
        System.out.println(city);
        System.out.println("===============================");


        Comparator<City> comparator = Comparator.comparing(City::getName);
        listCities.sort(comparator.reversed() );
        for (City city : listCities)
        System.out.println(city);
        scanner.close();


    }
}
