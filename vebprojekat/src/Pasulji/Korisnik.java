package Pasulji;

import java.util.ArrayList;

public class Korisnik {
	public enum TipKorisnika {Kupac, Dostavljac, Admin}
	private TipKorisnika tipKorisnika;
	private String kime;
	private String lozinka;
	private String ime;
	private String prezime;
	private String uloga;
	private int telefon;
	private String imejl;
	private String datumRegistracije;
	private ArrayList<Porudzbina> porudzbine;
	private ArrayList<Restoran> omiljeniRestorani;
	private Vozilo vozilo;
	private ArrayList<Porudzbina> dodeljenePorudzbine;
	
	public TipKorisnika getTipKorisnika() {
		return tipKorisnika;
	}
	
	public void setTipKorisnika(TipKorisnika tipKorisnika) {
		this.tipKorisnika = tipKorisnika;
	}
	
	public String getKime() {
		return kime;
	}
	
	public void setKime(String kime) {
		this.kime = kime;
	}
	
	public String getLozinka() {
		return lozinka;
	}
	
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getUloga() {
		return uloga;
	}
	
	public void setUloga(String uloga) {
		this.uloga = uloga;
	}
	
	public int getTelefon() {
		return telefon;
	}
	
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	
	public String getImejl() {
		return imejl;
	}
	
	public void setImejl(String imejl) {
		this.imejl = imejl;
	}
	
	public String getDatumRegistracije() {
		return datumRegistracije;
	}
	
	public void setDatumRegistracije(String datumRegistracije) {
		this.datumRegistracije = datumRegistracije;
	}
	
	public ArrayList<Porudzbina> getPorudzbine() {
		return porudzbine;
	}
	
	public void setPorudzbine(ArrayList<Porudzbina> porudzbine) {
		this.porudzbine = porudzbine;
	}
	
	public ArrayList<Restoran> getOmiljeniRestorani() {
		return omiljeniRestorani;
	}
	
	public void setOmiljeniRestorani(ArrayList<Restoran> omiljeniRestorani) {
		this.omiljeniRestorani = omiljeniRestorani;
	}
	
	public Vozilo getVozilo() {
		return vozilo;
	}
	
	public void setVozilo(Vozilo vozilo) {
		this.vozilo = vozilo;
	}
	
	public ArrayList<Porudzbina> getDodeljenePorudzbine() {
		return dodeljenePorudzbine;
	}
	
	public void setDodeljenePorudzbine(ArrayList<Porudzbina> dodeljenePorudzbine) {
		this.dodeljenePorudzbine = dodeljenePorudzbine;
	}
}
