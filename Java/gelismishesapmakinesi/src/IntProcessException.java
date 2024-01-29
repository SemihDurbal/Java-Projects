import java.util.InputMismatchException;

public class IntProcessException extends InputMismatchException {
    public void Int (double x){
        if(x%1 != 0){
            throw new ArithmeticException();
        }
    }
}
