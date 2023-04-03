package TernaryOperator;
import java.util.*;
public class UseTernaryOperator {
    public static void main(String[] args) {

        int number = 4874773;
        //Ternary Operator
        String type = ((number%2) == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
