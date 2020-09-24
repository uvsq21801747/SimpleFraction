package fr.uvsq;

public class SimpleFraction {
	double dividende, diviseur;
	
	public SimpleFraction()
	{
		dividende = 0;
		diviseur = 0;
	}
	
	public String toString()
	{
		if (diviseur == 0)
				return "NAN";
		return dividende + "/" + diviseur;
	}
	
}
