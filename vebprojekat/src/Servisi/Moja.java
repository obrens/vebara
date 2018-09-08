package Servisi;

import Pasulji.Korisnik;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/moja")
public class Moja {
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Korisnik test() {
		System.out.println("kora");
		Korisnik k = new Korisnik();
		k.setImejl(".com");
		k.setLozinka("sifrica");
		return k;
	}
}
