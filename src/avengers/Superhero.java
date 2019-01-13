package avengers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Superhero {

	private String firstname;
	private String lastname;
	private Weapon weapon;
	private ArrayList<Equipment> equipment;
	
	public Superhero() {
		firstname = "";
		lastname = "";
		weapon = null;
		equipment = new ArrayList<Equipment>();
	}
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String fullname(){
		return firstname + " " + lastname;
	}
	
	public String presentation(){
		return "My name is "+fullname() + " and I use a " + this.weapon.getName();
	}
	
	public List<Equipment> getEquipment() {
		return Collections.unmodifiableList(equipment);
	}
	
	public void batchEquip(ArrayList<Equipment> equipment){
		for (Equipment e : equipment) {
			equip(e);
		}
	}
	private void equip(Equipment e) {
		e.setUser(this);
		this.equipment.add(e);
	}
	
}
