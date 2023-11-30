package day40_exception.bank;

public class NotEnoughBalanceException extends Throwable {
    public NotEnoughBalanceException(String message) {
        super(String.valueOf(message));
    }
}
