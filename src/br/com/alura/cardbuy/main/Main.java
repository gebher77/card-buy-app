package br.com.alura.cardbuy.main;

import br.com.alura.cardbuy.methods.PrintOptions;
import br.com.alura.cardbuy.modelos.Card;
import br.com.alura.cardbuy.modelos.Product;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Card card = new Card();
        card.setCardLimit();
        PrintOptions options = new PrintOptions();
        options.setOptions(1);

        List < Product > shoppingList = new ArrayList < > ();

        do {
            Product newProduct = new Product();
            newProduct.setFields();

            if(newProduct.getValue() <= card.getCardLimit()) {
                shoppingList.add(newProduct);
                card.buyCard(newProduct);
            }

            System.out.println("--------------------------");

            options.setOptions();
            if(options.getOptions() == 0) {
                card.closeScanner();
                newProduct.closeScanner();
                options.closeScanner();
            }

        } while(options.getOptions() != 0 && card.getCardLimit() != 0.0);

        System.out.println("--------------------------");

        shoppingList.sort(Comparator.comparing(Product::getValue));
        System.out.println("Transactions Completed:\n");
        for(Product i: shoppingList) {

            System.out.println(i);
        }
        System.out.println("--------------------------");
        System.out.printf("Card limit: %.2f", card.getCardLimit());

    }
}
