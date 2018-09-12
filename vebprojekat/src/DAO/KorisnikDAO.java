package DAO;

import Pasulji.Korisnik;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KorisnikDAO {
	private List<Korisnik> korisnici;
	private String contextPath;
	
	public KorisnikDAO(){}
	
	public KorisnikDAO(String contextPath) {
		ucitaj(contextPath);
		this.contextPath = contextPath;
	}
	
	private void ucitaj(String contextPath) {
		korisnici = new ArrayList<>();
		BufferedReader in = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			File file = new File (contextPath + "/podaci/korisnici.json");
			//System.out.println(file.getCanonicalPath());
			in = new BufferedReader(new FileReader(file));
			
			korisnici = mapper.readValue(in, new TypeReference<List<Korisnik>>(){});
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
	
	public Korisnik registerUser(Korisnik korisnik) {
		
		for (Korisnik k : korisnici) {
			
			if (k.getKime().toLowerCase().equals(korisnik.getKime().toLowerCase())){
				System.out.println("KorisnikDAO registerUser> vec ima taj korisnik");
				return null;
			}
		}
		return dodajKorisnika(korisnik);
	}
	
	private Korisnik dodajKorisnika(Korisnik korisnik) {
		korisnik.setDatumRegistracije(Date.from(Instant.now()).toString());
		korisnik.setDodeljenePorudzbine(new ArrayList<>());
		korisnik.setOmiljeniRestorani(new ArrayList<>());
		korisnik.setPorudzbine(new ArrayList<>());
		korisnik.setTipKorisnika(Korisnik.TipKorisnika.Kupac);
		korisnici.add(korisnik);
		sacuvaj();
		return korisnik;
	}
	
	private void sacuvaj() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			File file = new File (this.contextPath + "/podaci/korisnici.json");
			
			mapper.writerWithDefaultPrettyPrinter().writeValue(file , korisnici);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
