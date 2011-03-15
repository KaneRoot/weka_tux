import java.awt.Event;
import java.awt.event.*;

public class JButtonListener implements ActionListener
{
	JTGrilleTux jgt;
	public JButtonListener(JTGrilleTux jgt)
	{
		this.jgt = jgt;
	}
	public void actionPerformed(ActionEvent e)
	{
		this.jgt.creation_boutons();
		this.jgt.setSize(1200,800);
	}
}
