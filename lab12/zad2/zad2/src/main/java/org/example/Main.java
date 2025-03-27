package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Иван", "Иванов");
        Tester tester2 = new Tester("Анна", "Сидорова", 5);
        Tester tester3 = new Tester("Петр", "Петров", 3, "Intermediate", 1200.50);

        tester1.showInfo();
        tester2.showInfo("Java");
        tester3.showInfo(true);

        Tester.companyPolicy();
    }
}

