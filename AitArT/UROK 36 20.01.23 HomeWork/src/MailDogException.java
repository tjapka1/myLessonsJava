public class MailDogException extends MyUnCheckedException{
    public MailDogException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "MailDogException{} \"Не хватает @\"";
    }
}
