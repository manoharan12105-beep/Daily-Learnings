package javaDemos;
import java.util.*;


public class LinkedList {
  private static Scanner scanner = new Scanner(System.in);
  private Node head;
  private Node tail;
  private int size;

  LinkedList() {
    this.size = 0;
  }

  
  class Node {
    private int data;
    private Node next;

    Node(int value) {
      this.data = value;
    }

    Node(int value, Node next) {
      this.data = value;
      this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

  }

  /**
   * Insert Data At First
   * @param value
   */
  public void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;

    if(tail == null) {
      tail = head;
    }
  
    size++;
  }

  /**
   * Insert Data At Last
   * @param value
   */
  public void insertLast(int value) {
    if(tail == null) {
      insertFirst(value);
      return;
    }

    Node node = new Node(value);
    tail.next = node;
    tail = node;
    size++;
  }


  /**
   * Insert Data At any Index
   * Zero index based
   * @param value
   * @param index
   */
  public void insert(int value, int index) {
    // InsertFirst 
    if(index == 0) {
      insertFirst(value);
      return;
    }

    // InsertLast
    if(index == size) {
      insertLast(value);
      return;
    }

    Node temp = head;
    for(int i = 1; i < index; i++) {
      temp = temp.next;
    }

    Node node = new Node(value, temp.next);
    temp.next = node;
    size++;

  }


  /**
   * Display the LinkedList
   */
  public void display() {
    Node temp = head;

    while(temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }

    System.out.println("End");

  }


  /**
   * Deletion of the First Element in the LinkedList
   * @return int
   */
  public int deleteFirst() {
    int value = head.data;
    head = head.next;

    if(head == null) {
      tail = null;
    }
    
    size--;
    return value;
  }


  /**
   * Deletion of Element at last Index in the LinkedList
   * @return int
   */
  public int deleteLast(){
    if(size == 1){
      return deleteFirst();
    }
    Node temp = head;
    for(int i = 1; i < size - 1; i++) {
      temp = temp.next;
    }
    int value = tail.data;
    tail = temp;
    tail.next = null;
    size--;
    return value;
  }


  /**
   * Deletion of Element at any Index of the LinkedList
   * @param index
   * @return int
   */
  public int delete(int index) {
    if(index == 0) {
      return deleteFirst();
    }
    
    if(index == size - 1) {
      return deleteLast();
    }

    Node prev = get(index - 1);
    int value = prev.next.data;
    prev.next = prev.next.next;
    size--;
    return value;

  }


  /**
   * GETS a node at the given index of the LinkedList
   * @param index
   * @return Node
   */
  public Node get(int index) {
    Node node = head;
    for(int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }


  /**
   * FINDS the Node of the given value of the LinkedList
   * @param value
   * @return Node
   */
  public Node find(int value) {
    Node node = head;

    while(node != null) {
      if(node.data == value) {
        return node;
      }
      node = node.next;
    }

  return null;
  }
}



