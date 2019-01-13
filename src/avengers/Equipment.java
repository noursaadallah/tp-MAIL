package avengers;

public class Equipment {

	private String type;
	private Superhero user;
	
	public Equipment() {
		type = "";
		user = null;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Superhero getUser() {
		return user;
	}

	public void setUser(Superhero user) {
		this.user = user;
	}
}
