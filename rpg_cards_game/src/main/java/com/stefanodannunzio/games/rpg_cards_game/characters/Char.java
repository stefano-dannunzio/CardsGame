package com.stefanodannunzio.games.rpg_cards_game.characters;

import com.stefanodannunzio.games.rpg_cards_game.utils.BirthDate;

public abstract class Char {
    // Data
    private String name;
    private String alias;
    private BirthDate birthDate;
    private int age;

    // Attributes
    protected int health;
    protected int speed;
    protected int dexterity;
    protected int strength;
    protected int armor;
    protected int level;

    // Constructor
    public Char(String name, String alias, BirthDate birthDate) {
        this.name = name;
        this.alias = alias;
        this.birthDate = birthDate;
        this.age = 500 - birthDate.getYear();
        this.level = 1;
    }

    // Methods
    public int shootingPower() {
        return dexterity * strength * level;
    }

    public int shootingEffectiveness() {
        return (int) (Math.random() * 100);        
    }

    public int attackingPower() {
        return shootingPower() * (shootingEffectiveness()/100);
    }

    public int defendingPower() {
        return armor * speed;
    }

    public void levelUp() {
        level++;
    }

    public int updateHealth(int damage) {
        health -= damage;
        return health;
    }

    @Override
    public String toString() {
        return "--- Name: " + name + ", Alias: " + alias + ", Class: " + this.getClass().getSimpleName() +  ", Birth Date: " + birthDate + ", Age: " + age + ". ---\n";
    }

}
