import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class randCircles extends GraphicsProgram {
	private static final int TOTAL_CIRCLES = 10;
	RandomGenerator k = new RandomGenerator();

	public void run() {
		for (int i = 0; i < TOTAL_CIRCLES; i++) {
			Color rColor = k.nextColor();
			double r = k.nextDouble(5, 50);
			double x = k.nextDouble(0, getWidth() - r);
			double y = k.nextDouble(0, getHeight() - r);
			GOval bob = new GOval(x, y, r, r);
			bob.setFilled(true);
			bob.setFillColor(rColor);
			add(bob);
		}
	}
}