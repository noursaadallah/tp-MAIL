package avengers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WeaponTest {

	protected Weapon shield; 
	
	@Before
	public void setUp() throws Exception {
		shield = new Weapon();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testWeapon() {
		assertNotEquals(shield, null);
	}

	@Test
	public void testGetName() {
		assertEquals(shield.getName(), "");
	}

	@Test
	public void testSetName() {
		shield.setName("shield");
		assertEquals(shield.getName(), "shield");
	}

}
