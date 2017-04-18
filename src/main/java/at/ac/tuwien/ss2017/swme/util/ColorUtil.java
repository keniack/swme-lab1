package at.ac.tuwien.ss2017.swme.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.ac.tuwien.ss2017.swme.enums.Color;

public class ColorUtil {

	private static final Logger log = LoggerFactory.getLogger(ColorUtil.class);
	
	private static float number = 0;

	public static Color getRandomColor() {
		log.info("Number:" + number);
		if (number == 0)
			number = new java.util.Random(System.currentTimeMillis()).nextFloat();
		else
			number = new java.util.Random().nextFloat();
		log.info("new random number:" + number);
		int i = (int) (number * 6);
		log.info("Array Index:" + i);
		return Color.allColors.get(i);

	}
	public static List generateRandomColorArray(int arraySize){
		log.info("Get random color array. Size :"+arraySize);
		List list = new ArrayList<>();
		while(list.size()<arraySize){
			Color color = getRandomColor();
			if (!list.contains(color))
				list.add(color);
		}
		log.info("Random list generated...");
		return list;
	}

}
