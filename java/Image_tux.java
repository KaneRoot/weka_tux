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
	private ImageIcon ic;
	
	public Image tuxi;
	
	public BufferedImage image_f;
	
	
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
		this.bouton = new JButton();
		this.couleur = Color.CYAN;
		this.setBackground(couleur);
	
		this.image_f = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
		crea_image(image_f.createGraphics());
	
		this.ic = new ImageIcon(this.image_f);


		this.bouton.setIcon(ic);
		this.bouton.setOpaque(true);
		
		this.setLayout(new BorderLayout());
		this.add(bouton,BorderLayout.CENTER);
		this.bouton.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent a)
	{
		if(this.t.isSelected())
		{
			this.t.deselect();
			this.couleur = Color.RED;
			this.bouton.setBackground(couleur);
		}
		else
		{
			this.couleur = Color.GREEN;
			this.t.select();
			this.bouton.setBackground(couleur);
		}
	}
	
	    
	public void crea_image(Graphics2D g) {

				g.drawImage(this.image, 0, 0, 180, 200, null);
			
				if(aDesPalmes)
				{
					g.drawImage(this.image_palmes, -67, 126, 320, 140, null);						
				}
				if(aDesCouettes)
				{
					g.drawImage(this.image_couettes, -62, -10, 300, 160, null);						
				}			
				if(aDesLunettes)
				{
					g.drawImage(this.image_lunettes, 30, 5, 130, 100, null);						
				}
				if(aUnChapeau)
				{
					g.drawImage(this.image_chapeau, 20, -40, 160, 120, null);						
				}						
				if(aUnGun)
				{
					g.drawImage(this.image_gun, 74, -15, 200, 200, null);						
				}
				if(aUneMontre)
				{
					g.drawImage(this.image_montre, 60, 96, 60, 60, null);
				}
	}


}
