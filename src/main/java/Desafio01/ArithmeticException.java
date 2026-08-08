package Desafio01;

public class ArithmeticException extends RuntimeException {
    public ArithmeticException(String message) {
        System.out.println("Altitude overflow detected");
    }
}
