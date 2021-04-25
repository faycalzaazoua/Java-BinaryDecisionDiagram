import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


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

		this.nomProjet += "_save.json";

		Path chemin = Paths.get(this.nomProjet);
		try
		{
			createFile(chemin);

		}catch(IOException fichierExistant)
		{
			System.out.println("Erreur, fichier de sauvegarde existant.");
			return;
		}
		//write into json the DDB state

	}

	public Sauvegarde(String nomProjet)
	{
		this.nomProjet = nomProjet;
	}
}
