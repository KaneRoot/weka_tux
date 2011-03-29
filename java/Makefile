all: WekaInterface.class affichage.class Image_tux.class JButtonListener.class JBLValidation.class JBLAnnulation.class JBLQuitter.class JTFEnter.class
clean:
	rm *.class
start:
	java -cp ./weka.jar:./ affichage
Tux.class:Tux.java
	javac Tux.java
TuxList.class:Tux.class TuxList.java
	javac TuxList.java
WekaInterface.class: TuxList.class WekaInterface.java ./weka.jar
	javac -cp ./weka.jar:./ WekaInterface.java
affichage.class: affichage.java JTGrilleTux.class
	javac affichage.java
JTGrilleTux.class:JTGrilleTux.java JButtonListener.class
	javac -cp ./weka.jar:./ JTGrilleTux.java

JTFEnter.class: JTFEnter.java
	javac -cp ./weka.jar:./ JTFEnter.java
JButtonListener.class: JButtonListener.java
	javac -cp ./weka.jar:./ JButtonListener.java
JBLQuitter.class: JBLQuitter.java
	javac JBLQuitter.java
JBLValidation.class: JBLValidation.java
	javac -cp ./weka.jar:./ JBLValidation.java
JBLAnnulation.class: JBLAnnulation.java
	javac JBLAnnulation.java
Image_tux.class: Image_tux.java Tux.class
	javac Image_tux.java
