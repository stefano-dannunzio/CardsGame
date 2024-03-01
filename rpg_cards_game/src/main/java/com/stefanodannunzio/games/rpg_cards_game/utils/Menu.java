package com.stefanodannunzio.games.rpg_cards_game.utils;

import java.util.Scanner;

import com.stefanodannunzio.games.rpg_cards_game.characters.Char;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---- Main Menu ----");
            System.out.println("1. New Game");
            System.out.println("2. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    newGame();
                    break;
                case 2:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please, choose one from above.");
            }
        }
    }

    private static void newGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting a new game...");
        System.out.println("Player 1 name: ");
        String name1 = scanner.nextLine();
        System.out.println("Player 2 name: ");
        String name2 = scanner.nextLine();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        System.out.println("Player 1 characters generated: ");
        for (Char character : player1.getHand()) {
            System.out.println(character);
        }

        System.out.println("Player 2 characters generated: ");
        for (Char character : player2.getHand()) {
            System.out.println(character);
        }
        


    }
    
}
