import java.util.Vector;

class m {
    public static void main(String[] args) {

        Vector v = new Vector();

        // adding elements from args[] to vector
        for (int i = 0; i < args.length; i++) {
            v.addElement(args[i]);
        }

        System.out.println("Vector elements are:");
        System.out.println(v);
    }
}
