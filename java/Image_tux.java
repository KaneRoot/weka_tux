import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Vector;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Image_tux extends JPanel implements ActionListener
{
	private Container c;
	
	public Tux t;
	public Color couleur;
	public BufferedImage image;
	public BufferedImage image_palmes;	
	public BufferedImage image_lunettes;
	public BufferedImage image_chapeau;
	public BufferedImage image_gun;
	public BufferedImage image_montre;
	public BufferedImage image_couettes;
	public boolean aUnChapeau;
	public boolean aDesCouettes;
	public boolean aDesPalmes;
	public boolean aDesLunettes;
	public boolean aUnGun;
	public boolean aUneMontre;
	private JButton bouton;
	private PanelTux imagep;
	
	
	public Image_tux(Tux tux, BufferedImage image, BufferedImage image_palmes, BufferedImage image_lunettes, BufferedImage image_chapeau, BufferedImage image_gun, BufferedImage image_montre, BufferedImage image_couettes)
	{
		this.image=image;
		this.image_palmes = image_palmes;	
		this.image_lunettes = image_lunettes;
		this.image_chapeau = image_chapeau;
		this.image_gun = image_gun;
		this.image_montre = image_montre;
		this.image_couettes = image_couettes;		
	
		this.aUnChapeau = tux.aUnChapeau();	
		this.aDesCouettes = tux.aDesCouettes();	
		this.aDesPalmes = tux.aDesPalmes();	
		this.aDesLunettes = tux.aDesLunettes();	
		this.aUnGun = tux.aUnGun();	
		this.aUneMontre = tux.aUneMontre();		
		this.aUneMontre = tux.aUneMontre();
		this.t = tux;
		this.couleur = Color.CYAN;
		this.setBackground(couleur);
		
		this.imagep=new PanelTux();
		this.imagep.setImageTux(this);
		this.bouton=new JButton("X");

		//imagep.setSize(180,200);
		bouton.setSize(180,20);
		this.setLayout(new BorderLayout());
		//this.setSize(180,200);
		this.add(bouton,BorderLayout.SOUTH);
		this.add(imagep,BorderLayout.CENTER);
		bouton.addActionListener(this);
		
	}
	/*
	public static void main(String args[])
	{
		JFrame jframe=new JFrame("Armée de Tux");
		JPanel conteneur=new JPanel(new GridLayout(4,5));
		jframe.add(conteneur);
		Vector<Tux> listTux=TuxList.genList(20);
		for(Tux tux: listTux)
		{
			conteneur.add(new Image_tux(tux));
		}
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack();
		//c = getContentPane();
		jframe.setVisible(true);
	}
	*/
	public void actionPerformed(ActionEvent a)
	{
		if(this.t.isSelected())
		{
			this.t.deselect();
			this.couleur = Color.CYAN;
			this.setBackground(couleur);
		}
		else
		{
			this.couleur = Color.RED;
			this.t.select();
			this.setBackground(couleur);
		}
	}
}
