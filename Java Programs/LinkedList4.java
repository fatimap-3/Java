package sem3cosc2006;
import java.util.LinkedList;

public class LinkedList4 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        addElement(list, "Algoma U", 0);
        addElement(list, "COSC", 1);
        addElement(list, "Data Structures", 1);
        addElement(list, "Java", 3);
        removeElement(list, 1);
        removeElement(list, 0);
        addElement(list, "My List", 1);
        System.out.println(list);
    }

  
    private static void addElement(LinkedList<String> list, String element, int index) {
        list.add(index, element);
    }

       private static void removeElement(LinkedList<String> list, int index) {
        list.remove(index);
    }
}
