package serveur.sauvegarde;

import serveur.construction.DDB;

import java.io.IOException;
import java.lang.NullPointerException;
import java.io.File;

public class Sauvegarde
{

	public DDB objetDDB;
	public String nomProjet;
	public String etatDDB;

	public Sauvegarde() {}

	public Sauvegarde(DDB aInitial, String nomProjet, String etatDDB)
	{
		this.objetDDB = aInitial;
		this.nomProjet = nomProjet;
		this.etatDDB = etatDDB;

		/* Initialisation du nom de fichier final. */
		String chemin = this.nomProjet + "_save.json";

		try
		{
			/* Créer un fichier de sauvegarde dans le répertoire 'saves'. */
			File saveFile = new File("saves",chemin);
			boolean ret = saveFile.createNewFile();

			if(!(ret))
				System.out.println("Fichier déjà existant.");

		}catch(NullPointerException | IOException cheminNull)
		{
			System.out.println("Erreur, nom de fichier de sauvegarde nul ou déplacement vers un dossier inexistant.");
		}
		//write into json the DDB state

	}

	public Sauvegarde(String nomProjet)
	{
		this.nomProjet = nomProjet;
	}

	//Pb : supprime dans tous les cas :/
	public void supprimerSauvegarde(String nomProjet) {
		if (nomProjet == null)
		{
			System.out.println("Erreur, nom de projet à supprimer vide.");
			return;
		}

		String chemin = this.nomProjet + "_save.json";
		File fileToSuppress = new File("saves", chemin);
		boolean ret = fileToSuppress.delete();
			if(!(ret))
				System.out.println("Fichier à supprimer non trouvé.");
	}
}
