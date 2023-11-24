package sem3cosc2006;
import java.util.List;

public class Swap {
    public static <T> void swap(List<T> list, int i, int j) {
        if (i < 0 || i >= list.size() || j < 0 || j >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid indices: " + i + ", " + j);
        }
        T elementI = list.get(i);
        T elementJ = list.get(j);
        list.set(i, elementJ);
        list.set(j, elementI);
    }
    public static void main(String[] args) {
        List<String> stringList = List.of("A", "B", "C", "D");
        System.out.println("Before Swap: " + stringList);
        swap(stringList, 1, 2);
        System.out.println("After Swap: " + stringList);
    }
}

