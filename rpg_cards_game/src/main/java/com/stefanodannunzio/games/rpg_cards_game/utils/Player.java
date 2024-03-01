package com.stefanodannunzio.games.rpg_cards_game.utils;

import java.util.ArrayList;
import java.util.List;

import com.stefanodannunzio.games.rpg_cards_game.characters.Char;
import com.stefanodannunzio.games.rpg_cards_game.characters.Elf;
import com.stefanodannunzio.games.rpg_cards_game.characters.Human;
import com.stefanodannunzio.games.rpg_cards_game.characters.Orc;

public class Player {
    private String name;
    private List<Char> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            generateChar();
        }

    }

    public void generateChar() {
        String[] names = {"Legolas", "Gimli", "Aragorn", "Frodo", "Gandalf", "Saruman", "Bilbo", "Sam", "Merry", "Pippin", "Boromir", "Gollum", "Sauron", "Galadriel", "Elrond", "Arwen", "Eowyn", "Faramir", "Theoden", "Grima", "Saruman", "Bilbo", "Sam", "Merry", "Pippin", "Boromir", "Gollum", "Sauron", "Galadriel", "Elrond", "Arwen", "Eowyn", "Faramir", "Theoden", "Grima"};
        String[] aliases = {"Alias1", "Alias2", "Alias3"};
        String[] classes = {"Elf", "Orc", "Human"};
        String name = names[(int) (Math.random() * names.length)];
        String alias = aliases[(int) (Math.random() * aliases.length)];
        String charClass = classes[(int) (Math.random() * classes.length)];
        BirthDate birthDate = new BirthDate((int) (Math.random() * 1000), (int) (Math.random() * 12), (int) (Math.random() * 30));
        Char character = null;
        switch (charClass) {
            case "Elf":
                character = new Elf(name, alias, birthDate);
                break;
            case "Orc":
                character = new Orc(name, alias, birthDate);
                break;
            case "Human":
                character = new Human(name, alias, birthDate);
                break;
        }
        hand.add(character);
    }

    public List<Char> getHand() {
        return hand;
    }
    
}
