package Pasulji;

import java.util.ArrayList;

public class Restoran {
	private String naziv;
	private String adresa;
	public enum Kategorija {Domaca, Rostilj, Kineski, Indijski, Poslasticarnica, Picerija}
	private Kategorija kategorija;
	private ArrayList<Artikal> jela;
	private ArrayList<Artikal> pica;
	private boolean obrisan;
}
