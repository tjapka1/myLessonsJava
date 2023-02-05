import java.util.Objects;

public class BankAccountWithOwner {
    private Person owner;
    private String iBan;

    public BankAccountWithOwner(Person owner, String iBan) {
        this.owner = owner;
        this.iBan = iBan;
    }

    public Person getOwner() {
        return owner;
    }

    public String getiBan() {
        return iBan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccountWithOwner that = (BankAccountWithOwner) o;
        return Objects.equals(owner, that.owner) && Objects.equals(iBan, that.iBan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, iBan);
    }

    @Override
    public String toString() {
        return owner +
                "| iBan =   " + iBan;
    }
}
