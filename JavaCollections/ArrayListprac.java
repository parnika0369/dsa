package JavaCollections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListprac {
    public static void main(String[] args) {
        //String[] student = new String[30];               //array
        ArrayList<String> student = new ArrayList<>();
        student.add("pari");
        student.set(0,"para");
        student.add("pari");
        boolean a = student.contains("pari");
        System.out.println(a);
        Iterator<String> it = student.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
