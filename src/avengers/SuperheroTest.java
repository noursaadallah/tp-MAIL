package avengers;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SuperheroTest {
	
	protected Superhero captAmerica;
	@Before
	public void setUp() throws Exception {
		captAmerica = new Superhero();
	}

	@After
	public void tearDown() throws Exception {
	}
	   
	@Test
	public void testSuperhero() {
		assertNotEquals(captAmerica, null);
	}

	@Test
	public void testGetFirstname() {
		assertEquals(captAmerica.getFirstname(), "");
	}

	@Test
	public void testSetFirstname() {
		captAmerica.setFirstname("steve");
		assertEquals(captAmerica.getFirstname(), "steve");
	}

	@Test
	public void testGetLastname() {
		assertEquals(captAmerica.getLastname(), "");
	}

	@Test
	public void testSetLastname() {
		captAmerica.setLastname("rogers");
		assertEquals(captAmerica.getLastname(), "rogers");
	}

	@Test
	public void testGetWeapon() {
		assertEquals(captAmerica.getWeapon(), null);
	}

	@Test
	public void testSetWeapon() {
		Weapon w = new Weapon();
		captAmerica.setWeapon(w);
		assertEquals(captAmerica.getWeapon(), w);
	}
	
	@Test
	public void testFullname() {
		captAmerica.setFirstname("steve");
		captAmerica.setLastname("rogers");
		assertEquals(captAmerica.fullname(), "steve rogers");
	}
	
	@Test
	public void testPresentation(){
		Weapon w = new Weapon();
		w.setName("shield");
		captAmerica.setFirstname("steve");
		captAmerica.setLastname("rogers");
		captAmerica.setWeapon(w);
		String result = "My name is steve rogers and I use a shield";
		assertEquals(captAmerica.presentation(), result);
	}
	
	@Test
	public void testEquip(){
		Equipment e1 = new Equipment();
		e1.setType("armor");
		Equipment e2 = new Equipment();
		e2.setType("helmet");
		ArrayList<Equipment> equipment = new ArrayList<Equipment>();
		equipment.add(e1); equipment.add(e2);
		captAmerica.batchEquip(equipment);
		for (Equipment e : equipment) {
			assertEquals(e.getUser(), captAmerica);
		}
		assertEquals(captAmerica.getEquipment().size() , 2);
		assertEquals(captAmerica.getEquipment().get(0).getType()  , e1.getType());
		assertEquals(captAmerica.getEquipment().get(1).getType()  , e2.getType());
	}

}
