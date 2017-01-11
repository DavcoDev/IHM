import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoutonC extends Button implements MouseListener
{
	
	private String text;
	private Color color = Color.cyan;
//	private Font font = 
	
	public BoutonC(String text)
	{
		super(text);
		this.text = text;
		this.setBackground(color);
		
		addMouseListener(this);
		this.setLabel("C");
		
		
	}

	
	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		this.setBackground(Color.yellow);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.setBackground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.setBackground(Color.CYAN);
		this.setLabel(text);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.setLabel("Pressé");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.setLabel("Relaché");
		
	}

}
