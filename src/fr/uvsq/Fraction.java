package fr.uvsq;

public class Fraction {
	double dividende, diviseur;
	
	public Fraction()
	{
		dividende = 0;
		diviseur = 0;
	}

	public Fraction(double dividende, double diviseur)
	{
		this.dividende = dividende;
		this.diviseur = diviseur;
	}
	
	public String toString()
	{
		if (diviseur == 0)
				return "NAN";
		return dividende + "/" + diviseur;
	}
}
