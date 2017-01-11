import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Calculatrice extends JFrame implements ActionListener
{
	private JPanel pan1 = new JPanel();
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	private JPanel pan4 = new JPanel();
	private JLabel text = new JLabel();
	
	private JButton bout1;
	private JButton bout2;
	private JButton bout3;
	private JButton bout4;
	private JButton bout5;
	private JButton bout6;
	private JButton bout7;
	private JButton bout8;
	private JButton bout9;
	private JButton bout10;
	private JButton bout11;
	private JButton bout12;
	private JButton bo1;
	private JButton bo2;
	private JButton bo3;
	private JButton bo4;
	private JButton bo5;
	 
	private String affichage = "";
	
	public Calculatrice()
	{
		super("Une fenetre qui traite les clics souris");
		
		this.setTitle("Ma première Calculatrice" );
		//Définit sa taille : 600 pixels de large et 600 pixels de haut
		this.setSize(400, 600);
		//Nous demandons maintenant à notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(pan1);
//		pan1.setLayout(new FlowLayout());
		pan1.setLayout(new BorderLayout());
		pan1.setBorder(new EmptyBorder(5, 5, 5, 5));
		pan2.setLayout(new GridLayout(4,3,7,7));
		pan2.setBorder(new EmptyBorder(5, 5, 5, 5));
		pan3.setLayout(new GridLayout(5,1,7,7));
		pan3.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		pan1.add(pan4, BorderLayout.NORTH);
		text.setHorizontalAlignment(JLabel.RIGHT);
		text.setOpaque(true);
		pan4.setBackground(Color.DARK_GRAY);
		text.setBackground(Color.GRAY);
		text.setPreferredSize(new Dimension(this.getWidth()-30, 80));
		text.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,40));
		
		pan4.add(text);
		
		Font font = new Font(Font.SERIF, Font.BOLD, 30);
		
//		JButton bout1 = new JButton("1");
		bout1 = new JButton("1");
		bout1.setFont(font);
		bout1.addActionListener(this);
		bout2 = new JButton("2");
		bout2.setFont(font);
		bout2.addActionListener(this);
		bout3 = new JButton("3");
		bout3.setFont(font);
		bout3.addActionListener(this);
		bout4 = new JButton("4");
		bout4.setFont(font);
		bout4.addActionListener(this);
		bout5 = new JButton("5");
		bout5.setFont(font);
		bout5.addActionListener(this);
		bout6 = new JButton("6");
		bout6.setFont(font);
		bout6.addActionListener(this);
		bout7 = new JButton("7");
		bout7.setFont(font);
		bout7.addActionListener(this);
		bout8 = new JButton("8");
		bout8.setFont(font);
		bout8.addActionListener(this);
		bout9 = new JButton("9");
		bout9.setFont(font);
		bout9.addActionListener(this);
		bout10 = new JButton("0");
		bout10.setFont(font);
		bout10.addActionListener(this);
		bout11 = new JButton(".");
		bout11.setFont(font);
		bout11.addActionListener(this);
		bout12 = new JButton("=");
		bout12.setFont(font);
		bout12.addActionListener(this);
		
		pan2.add(bout1);
		pan2.add(bout2);
		pan2.add(bout3);
		pan2.add(bout4);
		pan2.add(bout5);
		pan2.add(bout6);
		pan2.add(bout7);
		pan2.add(bout8);
		pan2.add(bout9);
		pan2.add(bout10);
		pan2.add(bout11);
		pan2.add(bout12);
		
	
		pan1.add(pan2, BorderLayout.CENTER);
		
		bo1 = new JButton("C");
		bo1.setFont(font);
		bo1.addActionListener(this);
		bo2 = new JButton("+");
		bo2.setFont(font);
		bo2.addActionListener(this);
		bo3 = new JButton("-");
		bo3.setFont(font);
		bo3.addActionListener(this);
		bo4 = new JButton("*");
		bo4.setFont(font);
		bo4.addActionListener(this);
		bo5 = new JButton("/");
		bo5.setFont(font);
		bo5.addActionListener(this);
		pan3.setPreferredSize(new Dimension(100, 500));
		
		

		pan3.add(bo1);
		pan3.add(bo2);
		pan3.add(bo3);
		pan3.add(bo4);
		pan3.add(bo5);
		
		
	
		pan1.add(pan3, BorderLayout.EAST);
		
		//la fenetre fait appel a son propre ecouteur d'evenements
		//addMouseListener(this);
		
		
		
		this.setVisible(true);
		
		
	}
	//#### AVEC ACTIONLISTENER #####
	
	class EcouteChiffre implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
//		System.out.println("ok");
		if (e.getSource() == bout1)
		{
			text.setText("1");
			
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout2)
		{
			text.setText("2");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout3)
		{
			text.setText("3");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout4)
		{
			text.setText("4");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout5)
		{
			text.setText("5");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout6)
		{
			text.setText("6");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout7)
		{
			text.setText("7");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout8)
		{
			text.setText("8");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout9)
		{
			text.setText("9");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout10)
		{
			text.setText("0");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout11)
		{
			text.setText(".");
			affichage = affichage + text.getText();
			text.setText(affichage);
		}
		if (e.getSource() == bout12)
		{
			text.setText("=");
		}
		if (e.getSource() == bo1)
		{
			affichage = "0";
			text.setText("0");
		}
		if (e.getSource() == bo2)
		{
			text.setText("+");
			
		}
		if (e.getSource() == bo3)
		{
			text.setText("-");
		}
		if (e.getSource() == bo4)
		{
			text.setText("*");
		}
		if (e.getSource() == bo5)
		{
			text.setText("/");
		}

	}
	
	/*#### AVEC MOUSELISTENER ########
	 
	
	//l'argument e de type MouseEvent correspond à l'objet evenement
	//genere dans la fenetre  lors d'un clic souris . On peut utiliser
	//les informations qui lui sont associées.
	@Override
	public void mouseClicked(MouseEvent e) 
	{
//		int x = e.getX();
//		int y = e.getY();
//		//coordonees du curseur au moment du clic
//		System.out.println("clic au points : " + x + ", " + y);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	*/
	

}
