package pr17;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List");
        LinkedList linkedList = new LinkedList();
        //Node student1 = new Node("Sosnin Artem Alexeevich", 18);
        linkedList.insert("Sosnin Artem Alexeevich", 18);
        linkedList.insert("Korenets alexey Michaylovich", 18);
        linkedList.insert("Sklyarov Vladimir chelik", 19);
        linkedList.print_list();

        System.out.println("=====================");
        linkedList.remove("Sklyarov Vladimir chelik", 19);
        linkedList.print_list();

        System.out.println("=====================");
        linkedList.remove_all();
        Boolean empty = linkedList.isEmpty();
        System.out.println(empty);

        System.out.println("\nDouble Linked List: ");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insert("Sosnin Artem Alexeevich", 18);
        doubleLinkedList.insert("Korenets alexey Michaylovich", 18);
        doubleLinkedList.insert("Sklyarov Vladimir chelik", 19);
        doubleLinkedList.print_list();

        System.out.println("================");
        doubleLinkedList.remove("Sklyarov Vladimir chelik", 19);
        doubleLinkedList.print_list();


        System.out.println("================");
        doubleLinkedList.remove("Sosnin Artem Alexeevich", 18);
        doubleLinkedList.print_list();

        System.out.println("================");
        doubleLinkedList.remove_all();
        Boolean empty2 = doubleLinkedList.isEmpty();
        System.out.println(empty2);

    }
}
