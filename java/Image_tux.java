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
	
	private String chemin_image;
	private String chemin_image_gun = "../images/gun.png";
	private String chemin_image_palmes = "../images/palmes.png";
	private String chemin_image_lunettes = "../images/lunettes.png";
	private String chemin_image_montre = "../images/montre.png";
	private String chemin_image_chapeau = "../images/chapeau.png";	
		
	public Image_tux(Tux tux)//boolean aUnChapeau, boolean aDesCouettes, boolean aDesPalmes, boolean aDesLunettes, boolean aUnGun, boolean aUneMontre) 
	{	//super("Image de fond");
		this.chemin_image = "../images/background.png";
		this.aUnChapeau = tux.aUnChapeau();	
		this.aDesCouettes = tux.aDesCouettes();	
		this.aDesPalmes = tux.aDesPalmes();	
		this.aDesLunettes = tux.aDesLunettes();	
		this.aUnGun = tux.aUnGun();	
		this.aUneMontre = tux.aUneMontre();		
		this.t = tux;
		this.couleur = Color.CYAN;
		this.addActionListener(this);
	}
	public void paint(Graphics g) {
		try {
			BufferedImage image = ImageIO.read(new File(chemin_image));
			g.drawImage(image, 0, 0, 180, 200, null);
			
			if(aDesPalmes)
			{
				BufferedImage image_palmes = ImageIO.read(new File(chemin_image_palmes));
				g.drawImage(image_palmes, -67, 126, 320, 140, null);						
			}
			if(aDesLunettes)
			{
				BufferedImage image_lunettes = ImageIO.read(new File(chemin_image_lunettes));
				g.drawImage(image_lunettes, 30, 5, 130, 100, null);						
			}
			if(aUnChapeau)
			{
				BufferedImage image_chapeau = ImageIO.read(new File(chemin_image_chapeau));
				g.drawImage(image_chapeau, 20, -40, 160, 120, null);						
			}						
			if(aUnGun)
			{
				BufferedImage image_gun = ImageIO.read(new File(chemin_image_gun));
				g.drawImage(image_gun, 68, 0, 140, 140, null);						
			}
			if(aUneMontre)
			{
				BufferedImage image_montre = ImageIO.read(new File(chemin_image_montre));
				g.drawImage(image_montre, 60, 96, 60, 60, null);						
			}																			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
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
