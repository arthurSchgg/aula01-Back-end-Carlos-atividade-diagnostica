package Desafio01;

public class TelemetryProcessor {
    public static void processAltitude(long currentAltitude, long speedMs, int durationSeconds) {
        long calc = 0;

            try {
                calc = currentAltitude + (speedMs * durationSeconds);
            } catch (Desafio01.ArithmeticException e) {
                throw new ArithmeticException(e.getMessage());
            }
            System.out.println("A nova altitude é de: " + calc);
    }
    
    public static void main(String[] args){
        processAltitude(2, 10, 20);
    }
}
