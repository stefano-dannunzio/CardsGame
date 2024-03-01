package com.stefanodannunzio.games.rpg_cards_game.characters;

import com.stefanodannunzio.games.rpg_cards_game.utils.BirthDate;

public class Orc extends Char {

    public Orc(String name, String alias, BirthDate birthDate) {
        super(name, alias, birthDate);
        health = 150;
        speed = 8;
        dexterity = 10;
        strength = 20;
        armor = 12;
    }
    
}
