package at.ac.tuwien.ss2017.swme.enums;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum Color {

	INVALID, RED, GREEN, WHITE, BLACK, PINK, YELLOW;

	public static final List<Color> allColors = new ArrayList<Color>(
			EnumSet.of(Color.RED, Color.GREEN, Color.WHITE, Color.BLACK, Color.PINK, Color.YELLOW));

	public static Color findColor(String value) {
		if (value == null || value.isEmpty())
			return INVALID;
		for (Color color : allColors) {
			if (color.toString().equalsIgnoreCase(value))
				return color;
		}
		return INVALID;
	}

}
