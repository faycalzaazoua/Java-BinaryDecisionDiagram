import serveur.sauvegarde.*;

public class Main
{
	public static void main(String[] args)
	{
		Sauvegarde s = new Sauvegarde(null, "test", "creation");
		s.supprimerSauvegarde("test");
	}
}
