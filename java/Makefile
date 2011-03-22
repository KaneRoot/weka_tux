all: WekaInterface.class affichage.class Image_tux.class JButtonListener.class JBLValidation.class JBLAnnulation.class JBLQuitter.class
clean:
	rm *.class
Tux.class:Tux.java
	javac Tux.java
TuxList.class:Tux.class TuxList.java
	javac TuxList.java
WekaInterface.class: TuxList.class WekaInterface.java ../weka/weka.jar
	javac WekaInterface.java -cp ../weka/weka.jar:./
affichage.class: affichage.java JTGrilleTux.class
	javac affichage.java
JTGrilleTux.class:JTGrilleTux.java JButtonListener.class
	javac JTGrilleTux.java
JButtonListener.class: JButtonListener.java
	javac JButtonListener.java
JBLQuitter.class: JBLQuitter.java
	javac JBLQuitter.java
JBLValidation.class: JBLValidation.java
	javac JBLValidation.java
JBLAnnulation.class: JBLAnnulation.java
	javac JBLAnnulation.java
Image_tux.class: Image_tux.java Tux.class
	javac Image_tux.java
