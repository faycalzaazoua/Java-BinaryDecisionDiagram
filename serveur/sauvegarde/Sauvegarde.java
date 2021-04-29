package serveur.sauvegarde;

import serveur.construction.DDB;

import java.io.IOException;
import java.lang.NullPointerException;
import java.io.File;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Sauvegarde
{

	public DDB objetDDB;
	public String nomProjet;
	public String etatDDB;

	public Sauvegarde(DDB aInitial, String nomProjet, String etatDDB)
	{
		this.objetDDB = aInitial;
		this.nomProjet = nomProjet;
		this.etatDDB = etatDDB;

		/* Initialisation du nom de fichier final. */
		String chemin = nomProjet + "_save.json";

		try
		{
			/* Créer un fichier de sauvegarde dans le répertoire 'saves'. */
			File saveFile = new File("saves",chemin);
			boolean ret = saveFile.createNewFile();

			if(!(ret))
				System.out.println("Fichier déjà existant.");

		}catch(NullPointerException | IOException x)
		{
			System.err.println("Erreur, nom de fichier de sauvegarde nul ou déplacement vers un dossier inexistant.");
		}
		//write into json the DDB state

	}

	public Sauvegarde(String nomProjet)
	{
		this.nomProjet = nomProjet;
		String chemin = nomProjet + "_save.json";

		try
		{
			File saveFile = new File("saves",chemin);
			boolean ret = saveFile.createNewFile();

			if(!(ret))
				System.out.println("Fichier déjà existant.");

		}catch(NullPointerException | IOException x)
		{
			System.err.println("Erreur, nom de fichier de sauvegarde nul ou déplacement vers un dossier inexistant.");
		}
	}

	public void supprimerSauvegarde(String nomProjet)
	{
		if (nomProjet == null)
		{
			System.out.println("Erreur, nom de projet à supprimer vide.");
			return;
		}

		String chemin = nomProjet + "_save.json";

		/* Supression d'un fichier de sauvegarde nommé nomProjet_save.json. */
		try
		{
			Files.delete(Path.of("./saves"+"/"+chemin));
		}catch(NoSuchFileException x)
		{
			System.err.format("%s: no such" + " file or directory%n", Path.of("./saves"+"/"+chemin));
		}catch(DirectoryNotEmptyException x)
		{
			System.err.format("%s not empty%n", Path.of("./saves"+"/"+chemin));
		}catch (IOException x)
		{
			System.err.println(x);
		}
	}
}
