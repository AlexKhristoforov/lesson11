package by.itacademy.reflection;

import by.itacademy.reflection.generator.Generate;

import java.util.Date;

public class Student {
    @Generate
    private String name;
    @Generate
    private int numberOfLessons;
    @Generate
    private Date birth;
    @Generate
    private boolean budget;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setBudget(boolean budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public Date getBirth() {
        return birth;
    }

    public boolean isBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numberOfLessons=" + numberOfLessons +
                ", birth=" + birth +
                ", budget=" + budget +
                '}';
    }
}