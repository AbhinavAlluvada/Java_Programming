import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList <Integer> s1 = new ArrayList<Integer>();
        s1.add(10);
        s1.add(20);
        System.out.println("ArrayList: "+s1);
        s1.add(1,15);
        System.out.println(s1);
        System.out.println(s1.getFirst());
        System.out.println(s1.getLast());
        System.out.println(s1.isEmpty());

    }
}
