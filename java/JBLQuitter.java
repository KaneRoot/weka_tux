import java.awt.Event;
import java.awt.event.*;

public class JBLQuitter implements ActionListener
{
	JTGrilleTux jgt;
	public JBLQuitter(JTGrilleTux jgt)
	{
		this.jgt = jgt;
	}
	public void actionPerformed(ActionEvent e)
	{
		this.jgt.quitter();
	}
}
