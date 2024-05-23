package br.com.alura.cardbuy.modelos;

import java.util.Scanner;

public class Product {
    private String name;
    private double value;

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    Scanner scanner = new Scanner(System.in);
    public void setFields() {
        System.out.println("Type the name of product:");
        name = scanner.nextLine();

        System.out.println("Type the value of product:");
        value = scanner.nextDouble();
        scanner.nextLine();
    }

    public void closseScanner() {
        scanner.close();
    }

    @Override
    public String toString() {
        return this.name + " - " + this.value;
    }

}