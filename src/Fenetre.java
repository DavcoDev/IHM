import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class Fenetre extends JFrame
{
	
	private JPanel panneau = new JPanel();
	private JPanel panneau2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	private JButton bout1 = new JButton("Mon Bouton");
	private JCheckBox case1 = new JCheckBox("choix1");
	private JCheckBox case2 = new JCheckBox("choix2");
	
	private ButtonGroup group1 = new ButtonGroup();
	private JRadioButton rad1 = new JRadioButton("oui");
	private JRadioButton rad2 = new JRadioButton("non");
	
	private JLabel lab1 = new JLabel("Mon etiquette");
	private JTextPane text1 = new JTextPane();
	private JComboBox<String> list1 = new JComboBox<String>();
	
	private String [] tab1 = {"Dav","Mig","Kev"};
	private JComboBox list2 = new JComboBox(tab1);
	private JLabel lab2 = new JLabel("Formulaire");
	
	
	
	public Fenetre()
	{
		//Définit un titre pour notre fenêtre
//		this.setTitle("Ma première fenetre" );
		//Définit sa taille : 400 pixels de large et 100 pixels de haut
//		this.setSize(600, 600);
		//Nous demandons maintenant à notre objet de se positionner au centre
//		this.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		this.setBackground(Color.BLACK);
//		this.getContentPane().setBackground(Color.BLUE);
//		this.getContentPane().setVisible(true);
		
		
//		panneau.setBackground(Color.green);
//		this.setContentPane(panneau);
//		panneau.add(bout1);
//		panneau.add(case1);
//		panneau.add(case2);
//		
//		group1.add(rad1);
//		group1.add(rad2);
//		panneau.add(rad1);
//		panneau.add(rad2);
//		
//		panneau.add(lab1);
//		
//		panneau.add(text1);
//		
//		panneau.setLayout(new FlowLayout());
//		panneau.add(list1);
//		list1.addItem("rouge");
//		list1.addItem("bleu");
//		list1.addItem("jaune");
//		
//		
		
//		this.setContentPane(panneau2);
//		panneau2.setBackground(Color.gray);
//		panneau2.add(lab2);
//		panneau2.add(list2);
//		
//		Container contenu = new JPanel();
//		
//		contenu.add(panneau);
//		contenu.add(panneau2);
//		this.setContentPane(contenu);
//		this.getContentPane().add(contenu);
		
		calculatrice();
		
		//Et enfin, la rendre visible 
		this.setVisible(true);
	}

	//BorderLayout
	public void miseEnForme()
	{
		this.setContentPane(pan3);
		
		
		
		JButton bout2 = new JButton("Centre");
		JButton bout3 = new JButton("Nord");
		JButton bout4 = new JButton("Sud");
		JButton bout5 = new JButton("Est");
		JButton bout6 = new JButton("Ouest");
		
		pan3.setLayout(new BorderLayout());
		
		pan3.add(bout2,BorderLayout.CENTER);
		pan3.add(bout3, BorderLayout.NORTH);
		pan3.add(bout4, BorderLayout.SOUTH);
		pan3.add(bout5, BorderLayout.EAST);
		pan3.add(bout6, BorderLayout.WEST);
		bout2.setBackground(Color.cyan);
	}
	
	//GridLayout
	public void miseEnForme2()
	{
		
		
		this.setContentPane(pan3);
		
		JButton bout2 = new JButton("1");
		JButton bout3 = new JButton("2");
		JButton bout4 = new JButton("3");
		JButton bout5 = new JButton("4");
		JButton bout6 = new JButton("5");
		
		pan3.setLayout(new GridLayout(3, 3));
		
		pan3.add(bout2);
		pan3.add(bout3);
		pan3.add(bout4);
		pan3.add(bout5);
		pan3.add(bout6);
	}
	
	//CardLayout
	public void miseEnForme3()
	{
		

		this.setContentPane(pan3);

		JButton bout2 = new JButton("1");
		JButton bout3 = new JButton("2");
		JButton bout4 = new JButton("3");
		JButton bout5 = new JButton("4");
		JButton bout6 = new JButton("5");

		pan3.setLayout(new CardLayout());

		pan3.add(bout2);
		pan3.add(bout3);
		pan3.add(bout4);
		pan3.add(bout5);
		pan3.add(bout6);
	}
	
	//BoxLayout
	public void miseEnForme4()
	{
		this.setContentPane(pan3);
		this.getContentPane().setBackground(Color.cyan);

		JButton bout2 = new JButton("1");
		JButton bout3 = new JButton("2");
		JButton bout4 = new JButton("3");
		JButton bout5 = new JButton("4");
		JButton bout6 = new JButton("5");

//		pan3.setLayout(new BoxLayout(pan3, BoxLayout.LINE_AXIS));
		pan3.setLayout(new BoxLayout(pan3, BoxLayout.PAGE_AXIS));

		pan3.add(bout2);
		pan3.add(bout3);
		pan3.add(bout4);
		pan3.add(bout5);
		pan3.add(bout6);
	}
	
	public void miseEnForme5()
	{
		this.setContentPane(new JPanel());

		JButton bout2 = new JButton("1");
		JButton bout3 = new JButton("2");
		JButton bout4 = new JButton("3");
		JButton bout5 = new JButton("4");
		JButton bout6 = new JButton("5");
		
		getContentPane().setLayout(new FlowLayout());
		
		pan3.setLayout(new BoxLayout(pan3, BoxLayout.PAGE_AXIS));
		pan3.setPreferredSize(new Dimension(1000, 1000));
		pan3.add(new JButton("1"));
		pan3.add(bout3);
		
		
		panneau2.setLayout(new GridLayout(1, 3));
		panneau2.add(bout4);
		panneau2.add(bout5);
		panneau2.add(bout6);
		
		pan3.setBackground(Color.blue);
		panneau2.setBackground(Color.CYAN);
		
		pan3.add(panneau2);
		getContentPane().add(pan3);
		
	}
	
	
	public void exoGraphique()
	{
		
		this.setContentPane(new Panneau());
		
		
	}
	
	public void calculatrice()
	{
		
	}
	
}
