import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	//Contact invalid_contact = new Contact("","","Brandon Thibeaux","123456","123456 the roses are great street");//debug line
	@Test
	void contact_test() {
		Contact valid_contact = new Contact("0","Brandon","Thibeaux","3338451234","123 Elm Street");
		assertTrue(valid_contact.contactID.equals("0"));
		assertTrue(valid_contact.firstName.equals("Brandon"));
		assertTrue(valid_contact.lastName.equals("Thibeaux"));
		assertTrue(valid_contact.phone.equals("3338451234"));
		assertTrue(valid_contact.address.equals("123 Elm Street"));
		
	}

	@Test
	void contactID_outside_limit() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Contact("001234567890","Brandon","Thibeaux","3338451234","123 Elm Street"); 
			}); 
	}
	@Test
	void contactID_IsNull() {
		Assertions.assertThrows(NullPointerException.class, () -> { 
			new Contact(null,"Brandon","Thibeaux","3338451234","123 Elm Street"); 
			}); 
	}
	@Test
	void firstName_outside_limit() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Contact("0","Brandon Philip","Thibeaux","3338451234","123 Elm Street"); 
			});
	}
	@Test
	public void firstName_IsNull() {
		Assertions.assertThrows(NullPointerException.class, () -> { 
			new Contact("0",null,"Thibeaux","3338451234","123 Elm Street"); 
			}); 
	}

	@Test
	void lastName_outside_limit() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Contact("0","Brandon","Philip Thibeaux","3338451234","123 Elm Street"); 
			});
	}
	@Test 
	void lastName_IsNull() {
		Assertions.assertThrows(NullPointerException.class, () -> { 
			new Contact("0","Brandon",null,"3338451234","123 Elm Street"); 
			}); 
	}
	@Test
	void phone_outside_underlimit() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Contact("0","Brandon","Thibeaux","33845123","123 Elm Street"); 
			});
	}
	@Test
	void phone_outside_overlimit() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Contact("0","Brandon","Thibeaux","12333845123","123 Elm Street"); 
			});
	}
	@Test
	void phone_IsNull() {
		Assertions.assertThrows(NullPointerException.class, () -> { 
			new Contact("0","Brandon","Thibeaux",null,"123 Elm Street"); 
			}); 
	}
	@Test
	void address_outside_limit() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Contact("0","Brandon","Thibeaux","3338569721","This is a long string thisshows a check for out of bounds"); 
			});
	}
	@Test
	void address_IsNull() {
		Assertions.assertThrows(NullPointerException.class, () -> { 
			new Contact("0","Brandon","Thibeaux","3338569721",null); 
			}); 
	}

}
