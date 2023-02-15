public class Transaction {
    private Accaunt debit;
    private Accaunt credit;
    private double amount;

    public Transaction(Accaunt debit, Accaunt credit, double amount) {
        this.debit = debit;
        this.credit = credit;
        this.amount = amount;
    }

    public Accaunt getDebit() {
        return debit;
    }

    public Accaunt getCredit() {
        return credit;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return debit + " --> " + credit +
                " " + amount ;
    }
}
