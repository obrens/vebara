package Pasulji;

import java.util.ArrayList;

public class Porudzbina {
	private int id;
	private ArrayList<Stavka> stavke;
	private String datumPorudzbine;
	private String vremePorudzbine;
	private Korisnik kupac;
	private Korisnik dostavljac;
	public enum StatusPorudzbine {Poruceno, UToku, Otkazano, Dostavljeno}
	private StatusPorudzbine status;
	private String napomena;
	private boolean obrisana;
}