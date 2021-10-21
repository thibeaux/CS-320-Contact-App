
public class ContactService {
	Contact[] contact;// Declaring an array of Contact

Contact[] addContact(int length,Contact[] oldContact,String firstName, String lastName, String phone, String address)
{
	
	// Allocating memory for 2 objects
    // of type task
    contact = new Contact[length+1];
    
    //See if head id null
    if(oldContact[0] == null)
    {
    	contact[0] = new Contact("0",firstName,lastName,phone,address);
    }
    else
    {
    	// insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (int i = 0; i < length; i++)
            contact[i] = oldContact[i];
  
        contact[length] = new Contact(String.valueOf(length),firstName,lastName,phone,address);
    }
    return contact;
    
    
}
public static Contact[] deleteContact(Contact[] arr,int index)
{

// If the array is empty
// or the index is not in array range
// return the original array
if (arr == null
|| index < 0
|| index >= arr.length) {

return arr;
}

// Create another array of size one less
Contact[] anotherArray = new Contact[arr.length - 1];

// Copy the elements except the index
// from original array to the other array
for (int i = 0, k = 0; i < arr.length; i++) {

// if the index is
// the removal element index
if (i == index) {
continue;
}

// if the index is not
// the removal element index
anotherArray[k++] = arr[i];
}

// return the resultant array
return anotherArray;
}

Contact[] updateContact(int index,Contact[] oldContactArr,String firstName, String lastName,String phone, String address)
{
	oldContactArr[index].firstName = firstName;
	oldContactArr[index].lastName = lastName;
	oldContactArr[index].phone = phone;
	oldContactArr[index].address = address;
	return oldContactArr;
}

void displayContactList(int length, Contact[] contact)
{
	for(int index = 0; index<length;index++)
	{
		System.out.println(contact[index].contactID + ", " + contact[index].firstName + ", " + contact[index].lastName +
				", " + contact[index].phone + ", " + contact[index].address);
	}
}
}
