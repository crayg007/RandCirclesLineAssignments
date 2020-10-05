import java.awt.event.*;
import acm.program.*;
import acm.graphics.*;

public class lineTool extends GraphicsProgram {
	public void init() {
		addMouseListeners();
	}
		public void mousePressed(MouseEvent p) {
			double x0 = p.getX();
			double y0 = p.getY();
			mustache = new GLine(x0, y0, x0, y0);
			add(mustache);
	}
		public void mouseDragged(MouseEvent d) {
			double x1 = d.getX();
			double y1 = d.getY();
			mustache.setEndPoint(x1, y1);		
	}	
		private GLine mustache;
}