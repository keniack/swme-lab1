package at.ac.tuwien.ss2017.swme.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import at.ac.tuwien.ss2017.swme.enums.Color;
import at.ac.tuwien.ss2017.swme.util.ColorUtil;
import at.ac.tuwien.ss2017.swme.util.Translator;

public class ColorGuessingGameTest {
	
	@Test
	public void getRandomColorTest() {
		Color color = ColorUtil.getRandomColor();
		assertNotNull(color);
	}
	
	@Test
	public void getRandomColorArrayTest() {
		int arraySize=4;
		List list = ColorUtil.generateRandomColorArray(arraySize);
		assertNotNull(list);
		assertEquals(list.size(), arraySize);
	}
	
	@Test
	public void translateTest() {
		int arraySize=4;
		String answer="red green black white";
		List list = Translator.translate(answer, arraySize);
		assertNotNull(list);
		assertEquals(list.size(), arraySize);
	}
}
