package string;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Saurav";
        String s3 = "Sachin";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);

    }
}
