import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {

//	private int i = 0;
	
	public void paintComponent(Graphics g) 
	{
		//	System.out.println("Execution numéro : " + (i++));
		int seg = Math.min(this.getHeight()/2, this.getWidth()/2);
		
		
		Image img;
		try {
			img = ImageIO.read(new File("metal-war.jpg"));
//			g.drawImage(img, 555, 555, this);
			g.drawImage(img,(this.getWidth()/2+(this.getWidth()-seg))/2, (this.getHeight()/2+(this.getHeight()-seg))/2, seg, seg, null);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.setColor(Color.blue);
//		g.fillRect(this.getWidth()/2, 0, seg, seg);
		g.fillRect((this.getWidth()/2+(this.getWidth()-seg))/2, (this.getHeight()/2-seg)/2, seg, seg);
		
		g.setColor(Color.green);
//		g.fillPolygon(new int[] {0, this.getWidth()/4,this.getWidth()/2}, new int[] {this.getHeight()/2, 0, this.getHeight()/2}, 3);
//		g.fillPolygon(new int[] {0, seg/2,seg}, new int[] {seg, 0, seg}, 3);
		g.fillPolygon(new int[] {0, seg/2 ,seg}, new int[] {seg, this.getHeight()/2, seg}, 3);

//		if(this.getWidth()<this.getHeight())
//		{
//			g.setColor(Color.yellow);
//			g.fillOval(0,this.getHeight()/2, this.getWidth()/2, this.getWidth()/2);
//		}
//		else 
//		{
//			g.setColor(Color.yellow);
//			g.fillOval(0,this.getHeight()/2, this.getHeight()/2, this.getHeight()/2);
//		}
		
		g.setColor(Color.yellow);
//		g.fillOval(0,this.getHeight()/2, Math.min(this.getHeight()/2, this.getWidth()/2),Math.min(this.getHeight()/2, this.getWidth()/2));
//		g.fillOval(0,this.getHeight()/2, seg,seg);
		g.fillOval((this.getWidth()/2-seg)/2,this.getHeight()/2, seg,seg);
	}

	




}
