import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculatrice extends JFrame implements MouseListener
{
	private JPanel pan1 = new JPanel();
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	private JPanel pan4 = new JPanel();
	private JLabel text = new JLabel("0");
	
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
		pan2.setLayout(new GridLayout(4,3,5,5));
		pan3.setLayout(new GridLayout(5,0,5,5));
		
		
		pan1.add(pan4, BorderLayout.NORTH);
		text.setHorizontalAlignment(JLabel.RIGHT);
		text.setOpaque(true);
		pan4.setBackground(Color.DARK_GRAY);
		text.setBackground(Color.GRAY);
		text.setPreferredSize(new Dimension(this.getWidth()-30, 80));
		text.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,40));
		
		pan4.add(text);
		
		
		JButton bout1 = new JButton("1");
		JButton bout2 = new JButton("2");
		JButton bout3 = new JButton("3");
		JButton bout4 = new JButton("4");
		JButton bout5 = new JButton("5");
		JButton bout6 = new JButton("6");
		JButton bout7 = new JButton("7");
		JButton bout8 = new JButton("8");
		JButton bout9 = new JButton("9");
		JButton bout10 = new JButton("0");
		JButton bout11 = new JButton(".");
		JButton bout12 = new JButton("=");
		
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
		
		BoutonC bo1 = new BoutonC("C");
		JButton bo2 = new JButton("+");
		JButton bo3 = new JButton("-");
		JButton bo4 = new JButton("*");
		JButton bo5 = new JButton("/");

		pan3.add(bo1);
		pan3.add(bo2);
		pan3.add(bo3);
		pan3.add(bo4);
		pan3.add(bo5);
		
		
		pan1.add(pan3, BorderLayout.EAST);
		
		//la fenetre fait appel a son propre ecouteur d'evenements
		addMouseListener(this);
		
		this.setVisible(true);
		
		
	}
	
	//l'argument e de type MouseEvent correspond à l'objet evenement
	//genere dans la fenetre  lors d'un clic souris . On peut utiliser
	//les informations qui lui sont associées.
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		int x = e.getX();
		int y = e.getY();
		//coordonees du curseur au moment du clic
		System.out.println("clic au points : " + x + ", " + y);
		
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
	
}
