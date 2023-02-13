import java.util.Objects;

public class Address {
   private String postcode;
   private String city;
   private String street;
   private String house;

    public Address(String postcode, String city, String street, String house) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address adresse = (Address) o;
        return Objects.equals(postcode, adresse.postcode) && Objects.equals(city, adresse.city) && Objects.equals(street, adresse.street) && Objects.equals(house, adresse.house);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postcode, city, street, house);
    }

    @Override
    public String toString() {
        return "Adress " + " " + postcode +  " " + city + " " + street +
                " " + house;
    }
}

