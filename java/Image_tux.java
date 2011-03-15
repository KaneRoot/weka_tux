import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Image_tux extends JFrame
{
	private Container c;
	private JPanel imagePanel;
	
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
	{	super("Image de fond");
		this.chemin_image = "../images/tux.png";
		this.aUnChapeau = Tux.aUnChapeau;	
		this.aDesCouettes = Tux.aDesCouettes;	
		this.aDesPalmes = Tux.aDesPalmes;	
		this.aDesLunettes = Tux.aDesLunettes;	
		this.aUnGun = Tux.aUnGun;	
		this.aUneMontre = Tux.aUneMontre;		
		initialize();
	}

	private void initialize() {
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		
		imagePanel = new JPanel() {
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
		};
		
		imagePanel.setPreferredSize(new Dimension(640, 480));
		c.add(imagePanel);
	}

}
