/**
 * This class implements the 'Contact' interface.
 * 
 * @author James
 */
public class ContactImpl implements Contact {
    
    /**
     * This is a unique ID through which the application can identify a
     * contact.
     */
    private int contactID;
    
    /**
     * This is the name given to the contact by the user.
     */
    private String contactName;
    
    /**
     * This is a string of notes that can record information about a contact.
     */
    private String contactNotes;
    
    /**
     * This is the class constructor.
     * 
     * @param contactID the unique ID is provided by the application. 
     * @param contactName the name is provided by the user upon creation.
     */
    public ContactImpl(int contactID, String contactName){
        this.contactID = contactID;
        this.contactName = contactName;
        this.contactNotes = "";
    }
    
    @Override
    public int getId(){
        return contactID;
    }
    
    @Override
    public String getName(){
        return contactName;
    }
    
    @Override
    public String getNotes(){
        return contactNotes;
    }
    
    @Override
    public void addNotes(String note){
        this.contactNotes = note;
    }
}