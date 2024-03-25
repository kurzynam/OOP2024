public class NegativeLifespanException extends Exception{
    public NegativeLifespanException(String surname) {
        super(String.format("Data śmierci osoby %s jest wcześniejsza niż data narodzin", surname));
    }
}
