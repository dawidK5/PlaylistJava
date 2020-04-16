public class ContactListDriver {
    public static void main(String[] args) {   
        ContactList bff = new ContactList() ; 
        ContactList friends = new ContactList() ;
        ContactList controllingAdults = new ContactList() ;
        ContactList allContacts = new ContactList() ;
        
        bff.add(new Contact("Dijkstra","086 999")) ;
        bff.add(new Contact("Knuth","086 123")) ;
        bff.add(new Contact("Wirth","086 555")) ;
        friends.add(new Contact("David","087 8765987")) ;
        friends.add(new Contact("Paul","087 1")) ;
        friends.add(new Contact("Sally","087 121212")) ;
        controllingAdults.add(new Contact("mom","085 666")) ;
        controllingAdults.add(new Contact("dad","085 878")) ;
        controllingAdults.add(new Contact("HoD","085 000")) ;
        System.out.println("bff list :- ") ;
        bff.display() ;
        System.out.println(bff) ;
        System.out.println("friends :- ") ;
        friends.display() ;
        System.out.println(friends) ;
        System.out.println("controllingAdults :- ") ;
        controllingAdults.display() ;
        System.out.println(controllingAdults) ;
        

        allContacts.addAll(friends);
        allContacts.addAll(bff);
        allContacts.addAll(controllingAdults);
        allContacts.sort();
        System.out.println("allContacts list :- ") ;
        allContacts.display() ;
        System.out.println(allContacts) ;
        
        System.out.print("Incoming call from number 085 000 ---> ");
        System.out.println(allContacts.nameOfIncomingCaller("085 000"));

        System.out.print("Incoming call from number 086 999 ---> ");
        System.out.println(allContacts.nameOfIncomingCaller("086 999"));

        System.out.print("Name for dialled number 087 121212 ---> ");
        System.out.println(allContacts.nameForDialledNumber("087 121212"));

        System.out.print("Name for dialled number 087 8765987 ---> ");
        System.out.println(allContacts.nameForDialledNumber("087 8765987"));
    }
}

