package br.com.alura.cardbuy.methods;

import java.util.Scanner;

public class PrintOptions {

    public int options;

    public void setOptions(int options) {
        this.options = options;
    }

    public int getOptions() {
        return options;
    }

    Scanner scanner = new Scanner(System.in);
    public void setOptions() {

        System.out.println("\nType 0 to exit or 1 to continue");
        this.options = scanner.nextInt();

    }

    public void closeScanner() {
        scanner.close();
    }

}