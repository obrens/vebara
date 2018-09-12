package Servisi;

import DAO.KorisnikDAO;
import DTO.MeniDTO;
import Pasulji.Korisnik;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/korisnik")
public class KorisnikService {
	@Context
	ServletContext context;
	
	@PostConstruct
	public void init() {
		if (context.getAttribute("korisnikDao") == null) {
			String contextPath = context.getRealPath("/");
			context.setAttribute("korisnikDao", new KorisnikDAO(contextPath));
		}
	}
	
	@GET
	@Path("/meni")
	@Produces(MediaType.APPLICATION_JSON)
	public MeniDTO test(@Context HttpServletRequest request) {
		Korisnik korisnik = ((Korisnik) request.getSession().getAttribute("korisnik"));
		boolean ulogovan = korisnik != null;
		String kime = korisnik != null ? korisnik.getKime() : "";
		return new MeniDTO(ulogovan, kime);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Korisnik test(Korisnik k) {
		System.out.println("KorisnikService test> uso");
		return ((KorisnikDAO) context.getAttribute("korisnikDao")).registerUser(k);
	}
}
