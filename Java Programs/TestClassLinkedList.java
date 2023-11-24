package sem3cosc2006;

public class TestClassLinkedList {
    public static void main(String[] args) {
        SortedDoubleLinkedList<String> list = new SortedDoubleLinkedList<>();

 
        list.insert("Milk");
        System.out.println(list); 

        list.insert("Eggs");
        System.out.println(list); 

        list.insert("Celery");
        System.out.println(list);

        list.insert("Bananas");
        System.out.println(list); 

        list.insert("Apples");
        System.out.println(list); 
        list.insert("Oranges");
        System.out.println(list); 
        list.insert("Cookies");
        System.out.println(list);

        list.insert("Steak");
        System.out.println(list); 
        list.remove(2);
        System.out.println(list); 

        list.remove(5);
        System.out.println(list); 

        
        list.removeAll();
        System.out.println(list);
    }
}

