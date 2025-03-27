package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "None", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "None", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println(name + " " + surname + " имеет " + experienceInYears + " лет опыта.");
    }

    public void showInfo(String language) {
        System.out.println(name + " знает " + language + " на уровне " + englishLevel + ".");
    }

    public void showInfo(boolean isFull) {
        if (isFull) {
            System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + experienceInYears + " лет, Уровень английского: " + englishLevel +  ", Зарплата: " + salary);
        } else {
            showInfo();
        }
    }

    public static void companyPolicy() {
        System.out.println("Все тестировщики должны иметь хотя бы 1 год опыта.");
    }
}

