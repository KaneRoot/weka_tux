import java.util.Vector;
class Tux
{
	private boolean chapeau;
	private boolean couettes;
	private boolean gun;
	private boolean palmes;
	private boolean lunettes;
	private boolean montre;
	private int determinant;
	boolean selected;
	
	public Tux(boolean chapeau,boolean couettes,boolean gun, boolean palmes, boolean lunettes,boolean montre)
	{
		this.chapeau=chapeau;
		this.couettes=couettes;
		this.gun=gun;
		this.palmes=palmes;
		this.lunettes=lunettes;
		this.montre=montre;
		this.selected=false;
	}
	public Tux(int determinant)
	{
		this.chapeau=(determinant%2)==1;
		this.couettes=((determinant/2)%2)==1;
		this.gun=((determinant/4)%2)==1;
		this.palmes=((determinant/8)%2)==1;
		this.lunettes=((determinant/16)%2)==1;
		this.montre=((determinant/32)%2)==1;
		this.determinant=determinant;
		this.selected=false;
	}
	public static Vector<String> listAttributes()
	{
		Vector<String> list = new Vector<String>();
		list.add("Chapeau");
		list.add("Couettes");
		list.add("Gun");
		list.add("Palmes");
		list.add("Lunettes");
		list.add("Montre");
		return list;
	}
	public static int maxPermutations()
	{
		int nattributes=Tux.listAttributes().size();
		int max=2;
		for(int i=1;i<nattributes;i++)
		{
			max=max*2;
		}
		return max;
	}
	public boolean aUnChapeau()
	{
		return this.chapeau;
	}
	public boolean aDesCouettes()
	{
		return this.couettes;
	}
	public boolean aDesPalmes()
	{
		return this.palmes;
	}
	public boolean aUneMontre()
	{
		return this.montre;
	}
	public boolean lunettes()
	{
		return this.lunettes;
	}
	public boolean isSelected()
	{
		return this.selected;
	}
	public void select()
	{
		this.selected=true;
	}
	public void deselect()
	{
		this.selected=false;
	}
	@Override
	public String toString()
	{
		String res="Tux ";
		res=res+this.determinant+" ";
		if(this.chapeau)
		{
			res=res+"Chapeau ";
		}
		if(this.couettes)
		{
			res=res+"Couettes ";
		}
		if(this.gun)
		{
			res=res+"Gun ";
		}
		if(this.palmes)
		{
			res=res+"Palmes ";
		}
		if(this.lunettes)
		{
			res=res+"Lunettes ";
		}
		if(this.montre)
		{
			res=res+"Montre ";
		}
		return res;
	}
	public String toBinaryForm()
	{
		String res="Tux ";
		res=res+this.determinant+" ";
		if(this.montre)
		{
			res=res+"1";
		}
		else
		{
			res=res+"0";
		}
		if(this.lunettes)
		{
			res=res+"1";
		}
		else
		{
			res=res+"0";
		}
		if(this.palmes)
		{
			res=res+"1";
		}
		else
		{
			res=res+"0";
		}
		if(this.gun)
		{
			res=res+"1";
		}
		else
		{
			res=res+"0";
		}
		if(this.couettes)
		{
			res=res+"1";
		}
		else
		{
			res=res+"0";
		}
		if(this.chapeau)
		{
			res=res+"1";
		}
		else
		{
			res=res+"0";
		}
		return res;
	}
		
}

