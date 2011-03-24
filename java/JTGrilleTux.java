import java.lang.String;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import javax.swing.table.*;
import javax.swing.text.*;
import javax.swing.event.*;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JTGrilleTux extends JFrame
{
	JLabel jl_nb_tux;
	JTextField jtf_nb_tux;
	JPanel jp_haut;
	JPanel jp_centre;
	JPanel jp_bas;
	JScrollPane jsp_centre;
	JButton jb_ok_nb_tux;
	JButton jb_validation, jb_annulation,jb_quitter;
	int nb_colonnes = 7;
	Vector<Image_tux> buttonList;
	private Vector<Tux> listTux;
	BufferedImage image;
	BufferedImage image_palmes;
	BufferedImage image_lunettes;
	BufferedImage image_chapeau;
	BufferedImage image_gun;
	BufferedImage image_montre;
	BufferedImage image_couettes;	
	
	public JTGrilleTux(String nom)
	{
		super(nom);
		
		chargement_image(); // charge les images.
		
		// Les JLabel
		this.jl_nb_tux = new JLabel("Nombre de tux : ");

		// Les JTextField
		this.jtf_nb_tux = new JTextField("", 5);

		// Les boutons
		this.jb_ok_nb_tux = new JButton("OK");
		this.jb_validation = new JButton("Valider");
		this.jb_annulation = new JButton("Annuler");
		this.jb_quitter = new JButton("Quitter");

		// Les JPanels
		this.jp_haut = new JPanel();
		this.jp_centre = new JPanel();
		this.jsp_centre = new JScrollPane(this.jp_centre);
		this.jp_bas = new JPanel();
		
		this.add(jp_haut,BorderLayout.NORTH);

		// Ajout des composants aux JPanels
		this.jp_haut.add(jl_nb_tux);
		this.jp_haut.add(jtf_nb_tux);
		this.jp_haut.add(jb_ok_nb_tux);

		this.jp_bas.add(this.jb_quitter);
		this.jp_bas.add(this.jb_annulation);
		this.jp_bas.add(this.jb_validation);
		//this.jsp_centre.add(this.jp_centre);
		
		// Ajout des actionListener
		this.jb_ok_nb_tux.addActionListener(new JButtonListener(this));
		this.jb_validation.addActionListener(new JBLValidation(this));
		this.jb_annulation.addActionListener(new JBLAnnulation(this));
		this.jb_quitter.addActionListener(new JBLQuitter(this));

		this.buttonList = new Vector<Image_tux>();
	}
	public void creation_boutons()
	{
		int nb = 0;
		nb = Integer.parseInt(jtf_nb_tux.getText());
		if(nb == 0) nb++;
		nb = nb % (Tux.maxPermutations() + 1);
		int nb_lignes = (nb / this.nb_colonnes) +1 ;

		try
		{
			this.buttonList.clear();
		}
		catch(Exception e)
		{
		}
		this.jp_centre.removeAll();

		this.listTux = TuxList.genList(nb);
		
		this.add(this.jsp_centre, BorderLayout.CENTER);
		this.jp_centre.setLayout(new GridLayout(nb_lignes, this.nb_colonnes));
		
		for(Tux tux: listTux)
		{
			Image_tux it = new Image_tux(tux, this.image, this.image_palmes, this.image_lunettes,this.image_chapeau,	this.image_gun,this.image_montre, this.image_couettes);
			this.buttonList.add(it);
			this.jp_centre.add(it);
		}

		this.add(this.jp_bas, BorderLayout.SOUTH);
		this.jp_bas.setLayout( new FlowLayout());

		this.pack();
	}
	
	public void chargement_image()
	{
		String chemin_image = "../images/background.png";
		String chemin_image_gun = "../images/gun.png";
		String chemin_image_palmes = "../images/palmes.png";
		String chemin_image_lunettes = "../images/lunettes.png";
		String chemin_image_montre = "../images/montre.png";
		String chemin_image_chapeau = "../images/chapeau.png";
		String chemin_image_couettes = "../images/couettes.png";		
	
		try 
		{
			this.image = ImageIO.read(new File(chemin_image));
			this.image_palmes = ImageIO.read(new File(chemin_image_palmes));	
			this.image_lunettes = ImageIO.read(new File(chemin_image_lunettes));
			this.image_chapeau = ImageIO.read(new File(chemin_image_chapeau));
			this.image_gun = ImageIO.read(new File(chemin_image_gun));
			this.image_montre = ImageIO.read(new File(chemin_image_montre));
			this.image_couettes = ImageIO.read(new File(chemin_image_couettes));			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public Vector<Tux> getTux()
	{
		return this.listTux;
	}
	public void quitter() 
	{
		this.setVisible(false);
		System.exit(0);
	}
}
