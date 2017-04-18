package at.ac.tuwien.ss2017.swme.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainGame {
	
	private static final Logger log = LoggerFactory.getLogger(ColorGuessingGame.class);

	public static void main(String[] args){
		try {
			ColorGuessingGame p = new ColorGuessingGame();
			p.startGame();
		} catch (Exception e) {
			log.error("Error starting the game!",e);
		}
	}
}
