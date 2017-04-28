package at.ac.tuwien.ss2017.swme.game;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.ac.tuwien.ss2017.swme.enums.Color;
import at.ac.tuwien.ss2017.swme.util.ColorUtil;
import at.ac.tuwien.ss2017.swme.util.Translator;
import at.ac.tuwien.ss2017.swme.util.Util;

public class ColorGuessingGame {
	
	private static final Logger log = LoggerFactory.getLogger(ColorGuessingGame.class);
	
	private List<Color> tip =null;
	private List<Color> code=null;
	int hits = 0,hitsOtherPosition=0;

	public void startGame() throws Exception{
		int colorsSize = 4;
		code = ColorUtil.generateRandomColorArray(colorsSize);
		while(true){
			String answer = readUserInput();
			if (answer==null || answer.isEmpty())
				return;
			tip=Translator.translate(answer,colorsSize);
			if(Util.compareArraysAndSum(tip, code)==colorsSize){
				log.info("Congratulations! End of Game!");
				return;
			}
			checkUserEvaluation();
			
		}
	}
	
	public String readUserInput(){
		log.info("Your Options:");
		log.info(Arrays.deepToString(Color.allColors.toArray()));
		log.info("Tip ?");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public void checkUserEvaluation() {
		int hitsOverall = 0;
		hits = Util.compareArraysAndSum(tip,code);
		for (Color color: Color.allColors) {
			int firstComp =  Util.searchObjInArrays(tip, color);
			int secondComp = Util.searchObjInArrays(code, color);
			hitsOverall += Math.min(firstComp, secondComp);
		}
		hitsOtherPosition = hitsOverall - hits;
		log.info("Hits:" + hits);
		log.info("Hits Other Position:" + hitsOtherPosition);
		log.info("TRY AGAIN!!!!");
	}
	
}
