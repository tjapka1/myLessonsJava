public class Accaunt {
    private String IBAN;
    private Person person;

    public Accaunt(String IBAN, Person person) {
        this.IBAN = IBAN;
        this.person = person;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return IBAN + " | " + person;
    }
}
