package oop.association;

public class Address {
    private String city;
    private String postalCode;

    public Address(String postalCode, String city) {
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
