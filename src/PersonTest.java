import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	public void getComepleteName() {
		Person person = new Person();
		person.firstname = "Suchaya";
		person.lastname = "Kunjaetong";
		assertEquals(person.getComepleteName(),"Suchaya Kunjaetong");
	}

}
