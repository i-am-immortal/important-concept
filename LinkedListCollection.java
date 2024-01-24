import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("amar");
        System.out.println(list);
        list.add("prerna");
        list.addLast("sujal");
        System.out.println(list);
        System.out.println(list.size());
    };

}
