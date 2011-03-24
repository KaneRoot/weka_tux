import java.awt.Event;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
import weka.gui.treevisualizer.TreeVisualizer;
public class JBLValidation implements ActionListener
{
	JTGrilleTux jgt;
	public JBLValidation(JTGrilleTux jgt)
	{
		this.jgt = jgt;
	}
	public void actionPerformed(ActionEvent e)
	{
		// FAIRE QUELQUE CHOSE
		Vector<Tux> listTux=this.jgt.getTux();
		JPanel np= WekaInterface.parseTux(listTux);
		JFrame window=new JFrame("Arbre de décision");
		window.add(np);
		window.pack();
		window.setSize(800,600);
		window.setVisible(true);
		((TreeVisualizer)np).fitToScreen();
	}
}
