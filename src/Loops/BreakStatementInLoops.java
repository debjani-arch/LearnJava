package Loops;

public class BreakStatementInLoops {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++){
            if( i==5){
                break;
            }
            System.out.println(i);

        }
        System.out.println("Out of the Loop");
    }
}
