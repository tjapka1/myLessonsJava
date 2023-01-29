import java.util.Objects;

public class Accaunt {

    private Person owner;
    private String iban;

    public Accaunt(String iban, Person owner) {
        this.owner = owner;
        this.iban = iban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accaunt accaunt = (Accaunt) o;
        return Objects.equals(owner, accaunt.owner) && Objects.equals(iban, accaunt.iban);
    }

    public Person getOwner() {
        return owner;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, iban);
    }

    @Override
    public String toString() {
        return  owner +" "+ iban ;
    }
}
