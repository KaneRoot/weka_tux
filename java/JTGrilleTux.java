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
	JPanel jp_bas;
	JButton jb_ok_nb_tux;
	int nb_colonnes = 7;
	Vector<Image_tux> buttonList;
	
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
		
		this.jl_nb_tux = new JLabel("Nombre de tux : ");
		this.jtf_nb_tux = new JTextField("", 5);
		this.jb_ok_nb_tux = new JButton("OK");

		this.jp_haut = new JPanel();
		this.jp_bas = new JPanel();

		this.add(jp_haut,BorderLayout.NORTH);
		this.jp_haut.add(jl_nb_tux);
		this.jp_haut.add(jtf_nb_tux);
		this.jp_haut.add(jb_ok_nb_tux);
		this.jb_ok_nb_tux.addActionListener(new JButtonListener(this));

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
		this.jp_bas.removeAll();

		Vector<Tux> listTux = TuxList.genList(nb);

		this.add(this.jp_bas, BorderLayout.CENTER);
		this.jp_bas.setLayout(new GridLayout(nb_lignes, this.nb_colonnes));

		for(Tux tux: listTux)
		{
			Image_tux it = new Image_tux(tux, this.image, this.image_palmes, this.image_lunettes,this.image_chapeau,	this.image_gun,this.image_montre, this.image_couettes);
			this.buttonList.add(it);
			this.jp_bas.add(it);
		}

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
}
