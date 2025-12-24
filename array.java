import java.util.ArrayList;

public class array {
    void arr_int(){
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
    void arr_string(){
        ArrayList<Object> s1 = new ArrayList<Object>();
        s1.add("Hello");
        s1.add("World");
        System.out.println(s1);
        s1.add(1,"Hi");
        System.out.println(s1);
    }
    public static void main(String[] args) {
        array obj = new array();
        obj.arr_string();
    }
}
