import java.util.Vector;
class Tux
{
	private boolean chapeau;
	private boolean couettes;
	private boolean gun;
	private boolean palmes;
	private boolean lunettes;
	private boolean montre;
	
	public Tux(boolean chapeau,boolean couettes,boolean gun, boolean palmes, boolean lunettes,boolean montre)
	{
		this.chapeau=chapeau;
		this.couettes=couettes;
		this.gun=gun;
		this.palmes=palmes;
		this.lunettes=lunettes;
		this.montre=montre;
	}
	public Tux(int determinant)
	{
		this.chapeau=(determinant%2)==0;
		this.couettes=((determinant/2)%2)==0;
		this.gun=((determinant/4)%2)==0;
		this.palmes=((determinant/8)%2)==0;
		this.lunettes=((determinant/16)%2)==0;
		this.montre=((determinant/32)%2)==0;
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
		return chapeau;
	}
	public boolean aDesCouettes()
	{
		return couettes;
	}
	public boolean aDesPalmes()
	{
		return palmes;
	}
	public boolean aUneMontre()
	{
		return this.montre;
	}
	public boolean lunettes()
	{
		return lunettes;
	}
	@Override
	public String toString()
	{
		String res="Tux ";
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
}

