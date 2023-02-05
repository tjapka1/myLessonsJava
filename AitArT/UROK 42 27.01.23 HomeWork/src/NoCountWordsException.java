public class NoCountWordsException extends Exception {

    public NoCountWordsException(String message) {
        super(message);
        System.out.println("No Word");
    }
}
