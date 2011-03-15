import javax.swing.*;
import java.awt.*;

public class affichage
{
	public static void main(String[] args)
	{
		JTGrilleTux grilleTux = new JTGrilleTux("Tri");
		grilleTux.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grilleTux.pack();
		grilleTux.setSize(800,600);
		grilleTux.setVisible(true);
	}
}

