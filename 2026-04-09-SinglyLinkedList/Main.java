package javaDemos;

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertFirst(1);
    list.insertFirst(2);
    list.insertFirst(3);
    list.insertFirst(4);
    list.insertFirst(5);
    list.insertFirst(6);
    list.insertFirst(7);
    list.insertLast(8);
    list.insertLast(9);

    list.display();

    list.insert(10, 9);
    list.display();
    list.insert(10, 4);
    

    System.out.println(list.deleteFirst());
    list.display();

    System.out.println(list.deleteLast());
    list.display();

    System.out.println(list.delete(4));
    list.display();

    System.out.println(list.find(2).toString());
  }
}
