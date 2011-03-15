import weka.core.FastVector;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.Instance;
import weka.classifiers.trees.J48;
import weka.classifiers.Classifier;
import java.util.Vector;
class WekaInterface
{
	public static void main(String args[])
	{
		System.out.println(createAttributes(Tux.listAttributes()));
	}
	public static FastVector createAttributes(Vector<String> attributes)
	{
		FastVector valeurs = new FastVector(2);
		valeurs.addElement("oui");
		valeurs.addElement("non");
		FastVector res=new FastVector(attributes.size());
		for(String elem : attributes)
		{
			res.addElement(new Attribute(elem,valeurs));
		}
		res.addElement(new Attribute("Sélectionné",valeurs));
		return res;
	}
	public static void getResults(Vector<Tux> listTux)
	{
		FastVector attributs=WekaInterface.createAttributes(Tux.listAttributes());
		 
		Instances isTrainingSet = new Instances("TuxList", attributs, listTux.size());
		isTrainingSet.setClassIndex(listTux.size()-1);
		
		for(Tux tux: listTux)
		{
			Instance elem=new Instance(attributs.size());
			elem.setValue((Attribute)attributs.elementAt(0), translateBoolean(tux.aUnChapeau()));      
 			elem.setValue((Attribute)attributs.elementAt(1), translateBoolean(tux.aDesCouettes()));      
 			elem.setValue((Attribute)attributs.elementAt(2), translateBoolean(tux.aUnGun()));
 			elem.setValue((Attribute)attributs.elementAt(3), translateBoolean(tux.aDesPalmes()));
 			elem.setValue((Attribute)attributs.elementAt(4), translateBoolean(tux.aDesLunettes()));
 			elem.setValue((Attribute)attributs.elementAt(5), translateBoolean(tux.aUneMontre()));
 			elem.setValue((Attribute)attributs.elementAt(6), translateBoolean(tux.isSelected()));
 			isTrainingSet.add(elem);
		}
		Classifier cModel=(Classifier) new J48();
		try
		{
			cModel.buildClassifier(isTrainingSet);
		}
		catch(java.lang.Exception oe)
		{
			System.out.println("Erreur lors de la construction du classifier");
		}
	}
	public static String translateBoolean(boolean val)
	{
		if(val)
		{
			return "oui";
		}
		else
		{
			return "non";
		}
	}
}
