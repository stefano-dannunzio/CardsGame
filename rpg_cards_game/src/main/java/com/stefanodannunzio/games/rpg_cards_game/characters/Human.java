package com.stefanodannunzio.games.rpg_cards_game.characters;

import com.stefanodannunzio.games.rpg_cards_game.utils.BirthDate;

public class Human extends BaseChar {

    public Human(String name, String alias, BirthDate birthDate) {
        super(name, alias, birthDate);
        health = 100;
        speed = 15;
        dexterity = 15;
        strength = 10;
        armor = 8;


    }
    
}
