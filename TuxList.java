import java.util.Vector;
import java.util.Random;
import java.lang.Math;
class TuxList
{
	private Vector<Tux> list;
	
	public Vector<Tux> get()
	{
		return this.list;
	}
	public Vector<Tux> getSelected()
	{
		Vector<Tux> listSelected=new Vector<Tux>();
		for(Tux tux : this.list)
		{
			if(tux.isSelected())
			{
				listSelected.add(tux);
			}
		}
		return listSelected;
	}
	public static Vector<Tux> genList(int n)
	{
		Vector<Integer> listenombre=new Vector<Integer>();
		Vector<Tux> listTux=new Vector<Tux>();
		Random rnd=new Random();
		int maxpossibilites=Tux.maxPermutations();
		for(int i=0;i<maxpossibilites;i++)
		{
			listenombre.add(i);
		}
		for(int i=0;i<n;i++)
		{
			int determinant=rnd.nextInt(listenombre.size());
			//int determinant=i;
			int determinant2=listenombre.remove(determinant);
			listTux.add(new Tux(determinant2));
		}
		//this.list=listTux();
		return listTux;
	}
	public static void main(String args[])
	{
		Vector<Tux> listTux=TuxList.genList(Tux.maxPermutations());
		System.out.println(listTux.size()+" éléments :");
		for(Tux tux : listTux)
		{
			System.out.println(tux);
		}
		//System.out.println(listTux);
	}
}
