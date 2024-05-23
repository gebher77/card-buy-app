package br.com.alura.cardbuy.modelos;

import java.util.Scanner;

public class Card {
    private double cardLimit;

    public double getCardLimit() {
        return cardLimit;
    }

    Scanner scanner = new Scanner(System.in);
    public void setCardLimit() {
        System.out.println("Type the limit of credit card:");
        this.cardLimit = scanner.nextDouble();

    }

    public void closeScanner() {
        scanner.close();
    }

    public void buyCard(Product product) {
        if(cardLimit >= product.getValue()) {
            System.out.println("Payment successfully!");
            cardLimit = cardLimit - product.getValue();
        } else {
            System.out.println("Insufficient limit");
        }
    }

}