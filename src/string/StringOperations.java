package string;

public class StringOperations {
    public static void main(String[] args) {
        //refer link: https://www.w3schools.com/java/java_ref_string.asp
        //equals
        String a = "DEbjani";
        String b = "saurav";
        boolean e = a.equalsIgnoreCase(b);
        System.out.println(e);

        //charAt
        a = "Michael";
        char c = a.charAt(5);
        System.out.println(c);

        //length
        int l = a.length();
        System.out.println(l);

        //trim
        a = "Debjani ";
        l = a.length();
        System.out.println(l);
        a = a.trim();
        l = a.length();
        System.out.println(l);

        //indexOf
        int p = a.indexOf('j');
        System.out.println(p);

        //lastIndexOf
        a = "Saurav";
        int q = a.lastIndexOf('a');
        System.out.println(q);

        //compareTo
        a = "Priiya";
        b = "Priya";
        int compare = a.compareTo(b);
        System.out.println(compare);

        //replace
        a = "Helle";
        System.out.println(a.replace('e' , 'n'));

        //replaceFirst
        a = "Helle";
        System.out.println(a.replaceFirst("e", "n"));

        //replaceAll

        a = "Helle";
        System.out.println(a.replaceAll("e", "n"));

        //startsWith
        a = "Helle";
        System.out.println(a.startsWith("Hel"));
        System.out.println(a.startsWith("ell"));
        System.out.println(a.startsWith("lle"));

        //endsWith

        a = "Helle";
        System.out.println(a.endsWith("Hel"));
        System.out.println(a.endsWith("ell"));
        System.out.println(a.endsWith("lle"));

        //



    }
}
