all: WekaInterface.class
clean:
	rm *.class
Tux.class:Tux.java
	javac Tux.java
TuxList.class:Tux.class TuxList.java
	javac TuxList.java
WekaInterface.class: TuxList.class WekaInterface.java weka/weka.jar
	javac WekaInterface.java -cp weka/weka.jar

