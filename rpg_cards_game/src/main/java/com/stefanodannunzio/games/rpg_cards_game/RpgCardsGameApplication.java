package com.stefanodannunzio.games.rpg_cards_game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stefanodannunzio.games.rpg_cards_game.utils.Menu;

@SpringBootApplication
public class RpgCardsGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgCardsGameApplication.class, args);
		Menu.main(args);
		
	}

}
