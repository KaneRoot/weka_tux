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

public class Image_tux extends JButton implements ActionListener
{
	private Container c;
	
	private Tux t;
	private Color couleur;
	private boolean aUnChapeau;
	private boolean aDesCouettes;
	private boolean aDesPalmes;
	private boolean aDesLunettes;
	private boolean aUnGun;
	private boolean aUneMontre;	
	
	public BufferedImage image;
	public BufferedImage image_palmes;	
	public BufferedImage image_lunettes;
	public BufferedImage image_chapeau;
	public BufferedImage image_gun;
	public BufferedImage image_montre;
	public BufferedImage image_couettes;
	
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
		this.addActionListener(this);
	}
	public void paint(Graphics g) {

			g.drawImage(image, 0, 0, 180, 200, null);
			
			if(aDesPalmes)
			{
				g.drawImage(image_palmes, -67, 126, 320, 140, null);						
			}
			if(aDesCouettes)
			{
				g.drawImage(image_couettes, -62, -10, 300, 160, null);						
			}			
			if(aDesLunettes)
			{
				g.drawImage(image_lunettes, 30, 5, 130, 100, null);						
			}
			if(aUnChapeau)
			{
				g.drawImage(image_chapeau, 20, -40, 160, 120, null);						
			}						
			if(aUnGun)
			{
				g.drawImage(image_gun, 74, -15, 200, 200, null);						
			}
			if(aUneMontre)
			{
				g.drawImage(image_montre, 60, 96, 60, 60, null);						
			}																			
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
		}
		else
		{
			this.t.select();
		}
	}

}
