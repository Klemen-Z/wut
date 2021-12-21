package main.ship_race;

public class Owner {
    private String Lastname;
    private String Firstname;
    private String Address;

    Owner( String Firstname, String Lastname, String Address){
        setAddress(Address); setFirstname(Firstname); setLastname(Lastname);
    }

    public String getAddress() {
        return Address;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
