package ressources;

import java.util.Date;

public class Compte {
	private String username;
	private String password;
	private Date dna; //date naissance
	private String mail;
	private String tel;
	private String codePostal;
	private Profil profil;
	
	//constructeur
	public Compte(String uN, String pW, String m, Date d, String t, String cP,Profil p){
		username = uN;
		password = pW;
		dna = d;
		mail = m;
		tel = t;
		codePostal = cP;
		profil = p;
		
	}
	
	
	// getter & setters 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDna() {
		return dna;
	}
	public void setDna(Date dna) {
		this.dna = dna;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	

}
