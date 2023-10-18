package datastructure.linkedlist;

import datastructure.linkedlist.LinkedList.Node;

public class Main {

public static void main(String[] args){

    LinkedList myLinkedList = new LinkedList(3);

    myLinkedList.append(2);
    myLinkedList.append(3);
    myLinkedList.append(4);

    System.out.println(myLinkedList.get(3).value + "\n");

    myLinkedList.printList();
  }


}
