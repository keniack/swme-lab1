package at.ac.tuwien.ss2017.swme.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.ac.tuwien.ss2017.swme.enums.Color;

public class Translator {

	private static final Logger log = LoggerFactory.getLogger(Translator.class);
	
	public static List translate(String answer, int colorSize) {
		List tip =new ArrayList<>();
		answer = answer.toLowerCase();

		String[] answers = answer.split("\\s");
		log.info("Answer Array:"+Arrays.deepToString(answers));
		log.info("Only first "+colorSize+" options considered ");
		for (int i = 0; i < colorSize && i<answers.length; i++) {
			tip.add(Color.findColor(answers[i]));
		}
		if (tip.contains(Color.INVALID)){
			log.info("Invalid Color!");
			log.info(Arrays.deepToString(tip.toArray()));
		}
		return tip;

	}

}
