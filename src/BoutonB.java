import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoutonB extends Button implements ActionListener 
{

	private String text;
	private Color color = Color.green;
	
	public BoutonB(String text)
	{
		super(text);
		this.text = text;
		this.setBackground(color);
		
		addActionListener(this);
//		this.setLabel("=");
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(getLabel().equals("centre"))
		
			this.setLabel("clic");
		
		else
			this.setLabel("centre");
		
	}

}
