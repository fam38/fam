package ressources;

public class Profil {
	private String pseudo;
	private String avatar;
	private String message;
	
	//Constructeur
	public Profil(String p, String a, String m){
		pseudo = p;
		avatar = a;
		message = m;
	}
	//Getters & Setters
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
