import weka.core.FastVector;
import weka.core.Attribute;
import java.util.Vector;
class WekaInterface
{

	public Vector<Attribute> createAttributes(Vector<String> attributes)
	{
		FastVector valeurs = new FastVector(2);
		valeurs.addElement("oui");
		valeurs.addElement("non");
		Vector<Attribute> res=new Vector<Attribute>();
		for(String elem : attributes)
		{
			res.add(new Attribute(elem,valeurs));
		}
		return res;
	}
}
