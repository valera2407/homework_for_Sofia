package com.Alevel;

import java.util.HashMap;
import java.util.List;

public class Car implements Comparable {
    private String company;
    private String series;
    private String color;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Car: " +
                "company = '" + company + '\'' +
                ", series = '" + series + '\'' +
                ", color = '" + color + '\'' +
                ".";
    }

    public void setAll(Car car){
        setCompany(company);
        setSeries(series);
        setColor(color);
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;
        int answer = company.compareTo(car.company);
        int answer1 = series.compareTo(car.series);
        if (answer < 0) {
            return answer;
        } else if (answer > 0) {
            return answer;
        } else {
            if (answer1 < 0) {
                return answer1;
            } else if (answer1 > 0) {
                return answer1;
            } else {
                return answer1;
            }
        }
    }
}
