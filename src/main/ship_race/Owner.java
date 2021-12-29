package main.ship_race;

public class Owner {
    private String lastname;
    private String firstname;
    private String address;

    Owner( String Firstname, String Lastname, String Address){
        setAddress(Address); setFirstname(Firstname); setLastname(Lastname);
    }

    public String getAddress() {
        return address;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
