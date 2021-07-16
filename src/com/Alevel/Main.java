package com.Alevel;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap <ID, Car> ourCars = new HashMap<>();

        ID id1 = new ID();
        ID id2 = new ID();
        ID id3 = new ID();
        ID id4 = new ID();
        ID id5 = new ID();

        id1.setID(7);
        id2.setID(8);
        id3.setID(4);
        id4.setID(5);
        id5.setID(12);

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setCompany("BMW");
        car1.setSeries("M3");
        car1.setColor("Blue");

        car2.setCompany("BMW");
        car2.setSeries("M5");
        car2.setColor("Red");

        car3.setCompany("Audi");
        car3.setSeries("Q5");
        car3.setColor("Black");

        car4.setCompany("Audi");
        car4.setSeries("R7");
        car4.setColor("Silwer");

        car5.setCompany("Mersedes");
        car5.setSeries("GLA");
        car5.setColor("Black");

        ourCars.put(id1, car1);
        ourCars.put(id2, car2);
        ourCars.put(id3, car3);
        ourCars.put(id4, car4);
        ourCars.put(id5, car5);

        for (Map.Entry<ID, Car> alone : ourCars.entrySet()){
            System.out.println(alone);
        }

        System.out.println(car1.compareTo(car2));

        List <Car> mapValues = new ArrayList<>(ourCars.values());

      /*  for (Car car : mapValues){
            System.out.println(car);
        }*/
        System.out.println("================================");
        Collections.sort(mapValues);


      /*  for (Car car : mapValues){
            System.out.println(car);
        }*/
        System.out.println("================================");

        /*for (Car car : ourCars.values()){
                Car carForSort;
                for (Car carS : ourCars.values()) {
                    if (car.compareTo(carS) > 0 && carS != car) {
                        carForSort = car;
                        car = carS;
                        carS = carForSort;
                    } else if (car.compareTo(carS) < 0) {
                        carForSort = car;
                        car = carS;
                        carS = carForSort;
                    } else {
                        return;
                    }
                }
            }*/

        for (Map.Entry<ID, Car> alone : ourCars.entrySet()){
            System.out.println(alone);
        }
    }
}
