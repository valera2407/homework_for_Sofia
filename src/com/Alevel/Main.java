package com.Alevel;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        HashMap <ID, Car> ourCars = new HashMap<>();

        ID id1 = new ID(); ID id2 = new ID(); ID id3 = new ID(); ID id4 = new ID(); ID id5 = new ID();

        id1.setID(7); id2.setID(8); id3.setID(4); id4.setID(9); id5.setID(12);

        Car car1 = new Car(); Car car2 = new Car(); Car car3 = new Car(); Car car4 = new Car(); Car car5 = new Car();

        car1.setCompany("BMW"); car1.setSeries("M3"); car1.setColor("Blue");

        car2.setCompany("BMW"); car2.setSeries("M5"); car2.setColor("Red");

        car3.setCompany("Audi"); car3.setSeries("Q5"); car3.setColor("Black");

        car4.setCompany("Audi"); car4.setSeries("R7"); car4.setColor("Silwer");

        car5.setCompany("Mersedes"); car5.setSeries("GLA"); car5.setColor("Black");

        ourCars.put(id1, car1);
        ourCars.put(id2, car2);
        ourCars.put(id3, car3);
        ourCars.put(id4, car4);
        ourCars.put(id5, car5);

        for (Map.Entry<ID, Car> alone : ourCars.entrySet()){
            System.out.println(alone);
        }

        System.out.println("================================");

        /*List <Car> mapValues = new ArrayList<>(ourCars.values());


        for (int i = 0; i < mapValues.size() - 1; i++) {
            int j = i + 1;
            Car carSort;
            Car carSort1 = mapValues.get(i);
            Car carSort2 = mapValues.get(j);
            if (carSort1.compareTo(carSort2) > 0
                    && carSort1 != carSort2) {
                carSort = carSort1;

                carSort1.setCompany(carSort2.getCompany());
                carSort1.setSeries(carSort2.getSeries());
                carSort1.setColor(carSort2.getColor());

                carSort2.setCompany(carSort.getCompany());
                carSort2.setSeries(carSort.getSeries());
                carSort2.setColor(carSort.getColor());
            } else if (carSort1.compareTo(carSort2) < 0
                    && carSort1 != carSort2) {
                carSort = carSort1;

                carSort1.setCompany(carSort2.getCompany());
                carSort1.setSeries(carSort2.getSeries());
                carSort1.setColor(carSort2.getColor());

                carSort2.setCompany(carSort.getCompany());
                carSort2.setSeries(carSort.getSeries());
                carSort2.setColor(carSort.getColor());
            } else {
                return;
            }
        }*/

        System.out.println("================================");

        Map<ID, Car> result = ourCars.entrySet()
                .stream()
                .sorted((c1, c2) -> c1.getValue().compareTo(c2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for (Map.Entry<ID, Car> alone : result.entrySet()){
            System.out.println(alone);
        }
    }
}
