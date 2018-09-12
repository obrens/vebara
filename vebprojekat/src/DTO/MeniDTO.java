package DTO;

public class MeniDTO {
	private boolean ulogovan;
	private String kime;
	
	public MeniDTO() {
	}
	
	public MeniDTO(boolean ulogovan, String kime) {
		this.ulogovan = ulogovan;
		this.kime = kime;
	}
	
	public boolean isUlogovan() {
		return ulogovan;
	}
	
	public void setUlogovan(boolean ulogovan) {
		this.ulogovan = ulogovan;
	}
	
	public String getKime() {
		return kime;
	}
	
	public void setKime(String kime) {
		this.kime = kime;
	}
}
