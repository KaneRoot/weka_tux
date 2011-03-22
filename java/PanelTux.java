import java.awt.*;
import javax.swing.*;
public class PanelTux extends JPanel 
{
		private Image_tux image_tux;
		public void setImageTux(Image_tux image_tux)
		{
			this.image_tux=image_tux;
		}
		public void paint(Graphics g) {

				g.drawImage(image_tux.image, 0, 0, 180, 200, null);
			
				if(image_tux.aDesPalmes)
				{
					g.drawImage(image_tux.image_palmes, -67, 126, 320, 140, null);						
				}
				if(image_tux.aDesCouettes)
				{
					g.drawImage(image_tux.image_couettes, -62, -10, 300, 160, null);						
				}			
				if(image_tux.aDesLunettes)
				{
					g.drawImage(image_tux.image_lunettes, 30, 5, 130, 100, null);						
				}
				if(image_tux.aUnChapeau)
				{
					g.drawImage(image_tux.image_chapeau, 20, -40, 160, 120, null);						
				}						
				if(image_tux.aUnGun)
				{
					g.drawImage(image_tux.image_gun, 74, -15, 200, 200, null);						
				}
				if(image_tux.aUneMontre)
				{
					g.drawImage(image_tux.image_montre, 60, 96, 60, 60, null);						
				}																			
			};
}
