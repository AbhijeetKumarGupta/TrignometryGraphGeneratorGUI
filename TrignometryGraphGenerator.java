import java.awt.*;

import javax.swing.*;

public class TrignometryGraphGenerator extends JFrame {

	int x,y,a;
	
	public TrignometryGraphGenerator() {
		
		setTitle("GRAPH");
		setSize(1365,740);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 0;
		y = 300;
		a=0;
	}
	
	public void paint(Graphics g) {
		
		g.drawLine(687, 0, 687, 740);
		g.drawLine(0, 373, 1365, 373);
		if(a == 0) {
			g.setColor(Color.YELLOW);
		}else if(a == 1) {
			g.setColor(Color.GRAY);
		}else if(a == 2) {
			g.setColor(Color.GREEN);
		}else if(a == 3) {
			g.setColor(Color.RED);
		}else if(a == 4) {
			g.setColor(Color.BLACK);
		}else if(a == 5) {
			g.setColor(Color.BLUE);
		}
		g.fillOval(x,y,5,5);
		run();
		repaint();
		
	}
	
	public void run() {
		try {
			
			Thread.sleep(5);
			int ax,by;
			
			ax = x-685;
			by = y-373;
			
			if(a == 0) {
			by = (int) (150*Math.sin(0.2*ax/5));
			}else if(a == 1) {
			by = (int) (150*Math.cos(0.2*ax/5));
			}else if(a == 2) {
			by = (int) (150*Math.tan(0.2*ax/10));
			}else if(a == 3) {
			by = (int) (150*(1/Math.sin(0.2*ax/5)));	
			}else if(a == 4) {
			by = (int) (150*(1/Math.cos(0.2*ax/5)));	
			}else if(a == 5) {
			by = (int) (150*(1/Math.tan(0.2*ax/10)));	
			}
			
			x = ax+685;
			y = 373-by;
			
			if(x == 1365 && a < 5) {
				a++;
				x = 0;
				y = 300;
			}
			
			do {
			x++;
			}while(x > 1365);
			
		}catch(Exception e) {
			
			System.out.println("Error!");
			
		}
	}
	
	public static void main(String[] args) {
	
		new TrignometryGraphGenerator();
		
	}

}
