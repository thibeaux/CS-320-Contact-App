import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	Contact contact[] = new Contact[1];
	ContactService cs = new ContactService();
	@Test
	void addTwoItem() {
		//syntax adContact(<current size of array>,<array we want to append to>,<first name>,<last name>,<phone#>,<address>)
		contact=cs.addContact(0, contact, "Larry","Begnaud", "5589651234", "123 Rue Aubin");
		System.out.println(contact[0].contactID + ", " + contact[0].firstName + ", " + contact[0].lastName +
				", " + contact[0].phone + ", " + contact[0].address);
		
		
		//make sure first item was appended to array
		assertTrue(contact[0].contactID.equals("0"));
		assertTrue(contact[0].firstName.equals("Larry"));
		assertTrue(contact[0].lastName.equals("Begnaud"));
		assertTrue(contact[0].phone.equals("5589651234"));
		assertTrue(contact[0].address.equals("123 Rue Aubin"));
		
		//add second item
		contact=cs.addContact(1,contact,"Brandon","Thibeaux","3378493896","123 Elm Street");

		System.out.println(contact[1].contactID + ", " + contact[1].firstName + ", " + contact[1].lastName +
				", " + contact[1].phone + ", " + contact[1].address);
		
		//make sure second contact was added
		assertTrue(contact[1].contactID.equals("1"));
		assertTrue(contact[1].firstName.equals("Brandon"));
		assertTrue(contact[1].lastName.equals("Thibeaux"));
		assertTrue(contact[1].phone.equals("3378493896"));
		assertTrue(contact[1].address.equals("123 Elm Street"));
		
		assertTrue(contact.length==(2));
		System.out.println("Array size: " + contact.length);
	}
	
	@Test
	void updateContact()
	{
		contact=cs.addContact(contact.length-1,contact,"Brandon","Thibeaux","3378493896","123 elmo st");//add one person		
		contact=cs.addContact(contact.length, contact, "Larry","Begnaud", "5589651234", "123 elm st");//add second person
		int index = 0;
		contact=cs.updateContact(index,contact,"Rene","Ducet","5555551111","156 Rue Lafayette");
		System.out.println(contact[index].contactID + ", " + contact[index].firstName + ", " + contact[index].lastName +
				", " + contact[index].phone + ", " + contact[index].address);	
		
		assertTrue(contact[0].contactID.equals("0"));
		assertTrue(contact[0].firstName.equals("Rene"));
		assertTrue(contact[0].lastName.equals("Ducet"));
		assertTrue(contact[0].phone.equals("5555551111"));
		assertTrue(contact[0].address.equals("156 Rue Lafayette"));
	}
	
	@Test
	void DeleteItem()
	{
		//System.out.println("Array size before: " + contact.length);//debug
		cs.deleteContact(contact,1);
		//System.out.println("Array size after: " + contact.length);//debug
		
		
		assertTrue(contact.length==(1));
	}

}
