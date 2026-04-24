public class Strr {

        public static void main(String args[])
        {
            String a = "Gpawasari";
            String b = "gpawasari";
            String c = " is college of diplama";

            System.out.println("Lenght="+ a.length());
            System.out.println("to lower case:-"+ a.toLowerCase());
            System.out.println("to Upper case:-"+ a.toUpperCase());
            System.out.println("to at char 5:-"+ a.charAt(5));
            System.out.println("are equal or not?:-" + a.equals(b));
            System.out.println("Strings are equal are or not?(case insensitive):-" +a.equalsIgnoreCase(b));
            System.out.println(a.concat(c));
            System.out.println(a.substring(0,3));



        }
    
}
