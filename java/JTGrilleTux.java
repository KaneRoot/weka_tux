import java.lang.String;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import javax.swing.table.*;
import javax.swing.text.*;
import javax.swing.event.*;

public class JTGrilleTux extends JFrame
{
	JLabel jl_nb_tux;
	JTextField jtf_nb_tux;
	JPanel jp_haut;
	JPanel jp_bas;
	JButton jb_ok_nb_tux;

	public JTGrilleTux(String nom)
	{
		super(nom);

		this.jl_nb_tux = new JLabel("Nombre de tux : ");
		this.jtf_nb_tux = new JTextField("", 5);
		this.jb_ok_nb_tux = new JButton("OK");

		this.jp_haut = new JPanel();
		this.jp_bas = new JPanel();

		this.add(jp_haut,BorderLayout.NORTH);
		this.jp_haut.add(jl_nb_tux);
		this.jp_haut.add(jtf_nb_tux);
		this.jp_haut.add(jb_ok_nb_tux);
	}
	public void ajout_boutons()
	{
	}
}
