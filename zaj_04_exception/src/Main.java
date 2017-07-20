import com.tomek.app.exceptions.DivideByZeroException;
import com.tomek.app.logic.MathOps;

public class Main {
    public static void main(String[] args) {
        //User user = new User(null, null);
        MathOps mathOps = new MathOps();
        System.out.println(mathOps.multiply(2.0, 0.3));

        try {
            System.out.println(mathOps.divide(4.0, 3.0));
            System.out.println(mathOps.divide(3.0, 0.0));
            System.out.println(mathOps.divide(5.0, 10.0));
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
           // e.printStackTrace();
        }
    }
}
