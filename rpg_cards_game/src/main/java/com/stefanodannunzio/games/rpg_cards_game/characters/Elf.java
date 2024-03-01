package com.stefanodannunzio.games.rpg_cards_game.characters;

import com.stefanodannunzio.games.rpg_cards_game.utils.BirthDate;

public class Elf extends Char {

    public Elf(String name, String alias, BirthDate birthDate) {
        super(name, alias, birthDate);
        health = 80;
        speed = 20;
        dexterity = 17;
        strength = 10;
        armor = 7;
    }
    
}
