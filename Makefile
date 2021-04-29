S := serveur/
C := client/
CN := construction/
SV := sauvegarde/
RN := reduction/

run: main 
	java Main

main: Main.java sauvegarde
	javac Main.java 

sauvegarde: $(S)$(SV)Sauvegarde.java DDB noeud racine sommet
	javac $(S)$(SV)Sauvegarde.java -d out/

DDB: $(S)$(CN)DDB.java
	javac $(S)$(CN)DDB.java -d out/

noeud: $(S)$(CN)Noeud.java
	javac $(S)$(CN)Noeud.java -d out/

racine: $(S)$(CN)Racine.java
	javac $(S)$(CN)Racine.java -d out/

sommet: $(S)$(CN)Sommet.java
	javac $(S)$(CN)Sommet.java -d out/

clean:
	rm -r out/
	rm Main.class
	rm $(S)$(CN)*.class
	rm $(S)$(SV)*.class
