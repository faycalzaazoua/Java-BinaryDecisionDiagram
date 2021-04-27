run: main 
	java Main

main: Main.java
	javac Main.java 

sauvegarde: serveur/sauvegarde/Sauvegarde.java
	javac serveur/sauvegarde/Sauvegarde.java -d out/

clean:
	rm -r out/
	rm Main.class
