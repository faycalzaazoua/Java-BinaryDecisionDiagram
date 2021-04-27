package serveur.sauvegarde;

import serveur.construction.DDB;

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

		String chemin = "./" + this.nomProjet + "_save.json";

		try
		{
			File saveFile = new File(chemin);

		}catch(NullPointerException cheminNull)
		{
			System.out.println("Erreur, nom de fichier de sauvegarde nul.");
		}
		//write into json the DDB state

	}

	public Sauvegarde(String nomProjet)
	{
		this.nomProjet = nomProjet;
	}
}
