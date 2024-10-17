package Book3.chapter6;



class Address1 implements Cloneable {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address1() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public Address1(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address clone() {
        try {
            return (Address)super.clone();
        } catch (CloneNotSupportedException var2) {
            return null;
        }
    }

    public String getAddress() {
        return this.street + "\n" + this.city + ", " + this.state + " " + this.zipCode;
    }
}
