public class Address {

    public int streetNo;
    public String streetName;
    public String city;
    public String country;
    public String zipCode;
    public final String DEFAULT_COUNTRY = "CANADA";
    public final int DEFAULT_STREETNO = 0;
    public final String DEFAULT_STREETNAME = "N/A";

    public Address() {
        this.streetNo = DEFAULT_STREETNO;
        this.streetName = DEFAULT_STREETNAME;
        this.country = DEFAULT_COUNTRY;
    }

    public Address(int streetNo, String streetName, String city, String country, String zipCode) {
        this.streetNo =streetNo;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public Address(String city, String zipCode) {
        this();
        this.city =city;
        this.zipCode = zipCode;
    }


}
