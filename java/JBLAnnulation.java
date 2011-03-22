import java.awt.Event;
import java.awt.event.*;

public class JBLAnnulation implements ActionListener
{
	JTGrilleTux jgt;
	public JBLAnnulation(JTGrilleTux jgt)
	{
		this.jgt = jgt;
	}
	public void actionPerformed(ActionEvent e)
	{
		this.jgt.creation_boutons();
	}
}
