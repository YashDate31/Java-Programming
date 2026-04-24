public class Demo {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d = null;   // object becomes unused
        System.gc();
    }
}
 
    

