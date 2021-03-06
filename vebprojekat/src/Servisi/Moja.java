package Servisi;

import DAO.KorisnikDAO;
import Pasulji.Korisnik;
import Pomocne.IdGetter;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/moja")
public class Moja {
	@Context
	ServletContext context;
	
	@PostConstruct
	public void init() {
		if (context.getAttribute("korisnikDao") == null) {
			String contextPath = context.getRealPath("/");
			System.out.println(contextPath);
			IdGetter.Putanja = contextPath;
			context.setAttribute("korisnikDao", new KorisnikDAO(contextPath));
		}
	}
	
	@POST
	@Path("/test")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Korisnik test(Korisnik k) {
		System.out.println("uso");
		k.setIme("Dobrica");
		k.setPrezime("Dobra");
		//k.setKime("dobri123");
		k.setTelefon(554);
		//k.setImejl("imejl.com");
		//k.setLozinka("sifrica");
		Korisnik korisnik = ((KorisnikDAO) context.getAttribute("korisnikDao")).registerUser(k);
		return korisnik;
	}
}
