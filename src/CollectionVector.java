import java.util.Vector;

public class CollectionVector {
    public static void main(String[] args) {
        Vector vc= new Vector();
        vc.add(12);
        vc.add("My Vector");
        vc.add(123.56f);
        vc.add('d');
        // returns the current capacity of the vector which is by default 10
        System.out.println(vc.capacity());
        //return the first element of Vector
        System.out.println(vc.firstElement());
        // return the last element of vector
        System.out.println(vc.lastElement());
        // return true if the vector is not empty
        System.out.println(vc.isEmpty());
        for (int i = 0; i < vc.size() ; i++) {
            System.out.println("Index "+i+" ="+vc.get(i));
        }
    }
}