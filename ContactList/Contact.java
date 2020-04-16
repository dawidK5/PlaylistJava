//****************************
// Contact.java
//
// Class describing the data stored in a mobile Phone contact entry
//****************************
//
//                   NB NB NB NB NB NB NB NB NB NB
//                   vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv         
public class Contact implements Comparable<Contact> {
	private String name ;   // Stores the contact name.
	private String number ; // Ttores the contact number.

	public Contact(String name, String number) {
    	// Store the data in the NEW Contact instance.
    	this.name = name ;
    	this.number = number ;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getName()	{
		return this.name ;
	}
	
	public void setNumber(String number) {
		this.number = number ;
	}
	
	public String getNumber() {
		return this.number ;
	}
	
	public String toString() {
	    return "(" + this.name + " - " + this.number + ")";
    }
    
    public int compareTo(Contact other) {
        // NOTE: the comparison is CASE INSENSITIVE
        return this.name.compareToIgnoreCase(other.name);
    }
}