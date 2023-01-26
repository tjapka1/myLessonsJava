import java.util.Objects;

public class TransAction {
    private long id;
    private Account debit;
    private Account credit;
    private double amount;

    public TransAction(long id, Account debit, Account credit, double amount) {
        this.id = id;
        this.debit = debit;
        this.credit = credit;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Account getDebit() {
        return debit;
    }

    public void setDebit(Account debit) {
        this.debit = debit;
    }

    public Account getCredit() {
        return credit;
    }

    public void setCredit(Account credit) {
        this.credit = credit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransAction that = (TransAction) o;
        return id == that.id && Double.compare(that.amount, amount) == 0 && Objects.equals(debit, that.debit) && Objects.equals(credit, that.credit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, debit, credit, amount);
    }

    @Override
    public String toString() {
        return  id +
                " | " + debit +
                " | " + credit +
                " | " + amount;
    }
}
