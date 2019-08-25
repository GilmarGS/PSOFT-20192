package psoft.lab1.disciplinas;

public class GeradorDeID {
	private static int ID = 0;
	
	public static int getProximoID () {
		return ++ID;
	}
}
