package serveur.sauvegarde;

import serveur.construction.DDB;

import java.lang.NullPointerException;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.Writer;

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

		/* Créer un fichier de sauvegarde dans le répertoire 'saves'. */
		File saveFile = new File("saves",chemin);

		try
		{
			boolean ret = saveFile.createNewFile();

			if(!(ret))
				System.out.println("Fichier déjà existant.");

		}
		catch(NullPointerException | IOException x)
		{
			x.printStackTrace();
		}

		/* Écrire dans le fichier nomProjet_save.json le fichier de sauvegarde json. */
		FileWriter writerStream;

		try
		{
			writerStream = new FileWriter(saveFile);
			
			String content = "{ \n \t"
			       		+"\"DDB\""
				       	+": { \n \t\t"
				       	+"\"objetDDB\""
					+": "
					+"\""
					+aInitial
					+"\",\n\t\t"
					+"\"nomProjet\""
					+": "
					+"\""
					+nomProjet
					+"\",\n\t\t"
					+"\"etatDDB\""
					+": "
					+"\""
					+etatDDB
					+"\"\n\t}"
					+"\n}";

			/* Écrire la chaîne de caractères content. */
			writerStream.write(content);
			writerStream.flush();
			writerStream.close();
		}
		catch(IOException x)
		{
			x.printStackTrace();
		}
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
			x.printStackTrace();
		}
	}

	public void majSauvegarde(DDB nouveauDDB, String nomProjet, String nouvelEtat)
	{
		String chemin = nomProjet + "_save.json";

		File saveFile = new File("saves",chemin);

		/* Effacer le contenu du fichier original. */
		
		FileWriter writerStream;

		try
		{
			writerStream = new FileWriter(saveFile);
			String content = "";
			writerStream.write(content);
			writerStream.flush();

			content = 	"{ \n \t"
			       		+"\"DDB\""
				       	+": { \n \t\t"
				       	+"\"objetDDB\""
					+": "
					+"\""
					+nouveauDDB
					+"\",\n\t\t"
					+"\"nomProjet\""
					+": "
					+"\""
					+nomProjet
					+"\",\n\t\t"
					+"\"etatDDB\""
					+": "
					+"\""
					+nouvelEtat
					+"\"\n\t}"
					+"\n}";

			/* Écrire la chaîne de caractères content. */
			writerStream.write(content);
			writerStream.flush();
			writerStream.close();
		}
		catch(IOException x)
		{
			x.printStackTrace();
		}
	}

	public void restaurerSauvegarde(String nomProjet)
	{
		String path = "saves/" + nomProjet + "_save.json";
		
		try
		{
			FileReader readFile = new FileReader(path);	
		}
		catch(FileNotFoundException x)
		{
			x.printStackTrace();
		}

		char[] buffer = new char[128];
		int i = 0;

		while(buffer[i] != '}')
		{
			try
			{
				buffer[i] = readFile.read();
			}
			catch(IOException eOF)
			{
				eOF.printStackTrace();
			}
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
		}
		catch(NoSuchFileException x)
		{
			x.printStackTrace();
		}
		catch(DirectoryNotEmptyException x)
		{
			x.printStackTrace();
		}
		catch (IOException x)
		{
			x.printStackTrace();
		}
	}
}
