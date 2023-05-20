package com.collectionframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ToyExample {
/*

    ArrayList is like a shelf with slots, each slot has a toy, and you can easily find the toy by looking at the
    slot number. When you want to add a new toy, you find the first empty slot and place the toy there. If the
    shelf becomes full, you create a new and bigger shelf and move all the toys to the new shelf. This takes a
    bit of time, but finding a toy is very quick.

    LinkedList is like a chain of boxes, each box has a toy and is connected to the next box with a rope.
    To find a toy, you start from the first box and follow the ropes until you reach the desired box.
    To add a new toy, you simply add a new box to the end of the chain. Adding a new toy is very quick,
    but finding a toy takes a bit of time.

    Vector is like a toy collection in a big room. The room has a fixed size, and you can only place a limited
    number of toys. To add a new toy, you check if there is room for the new toy and if there is, you place
    the toy in the room. If the room becomes full, you need to move all the toys to a bigger room which takes
    a bit of time. But finding a toy is very quick because you know exactly where the toy is.

    So, ArrayList is best when you need to frequently add or remove elements from the middle of the collection
    and access elements by their index. LinkedList is best when you need to frequently add or remove elements
    from the beginning or end of the collection. Vector is best when you need a synchronized version of an
    ArrayList, where multiple threads access the collection at the same time.

*/
public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Vector<String> vector = new Vector<>();

        arrayList.add("Car");
        arrayList.add("Ball");
        arrayList.add("Doll");

        linkedList.add("Car");
        linkedList.add("Ball");
        linkedList.add("Doll");
        
        vector.add("Car");
        vector.add("Ball");
        vector.add("Doll");
        
        arrayList.add(1, "Toy Train"); // Slow as it requires shifting elements
        linkedList.add(1, "Toy Train"); // Faster as it only requires adjusting hashcode
        vector.add(1, "Toy Train"); // Slow as it is synchronized, has overhead of synchronization
        
        arrayList.remove(2); // Slow as it requires shifting elements
        linkedList.remove(2); // Faster as it only requires adjusting hashcode
        vector.remove(2); // Slow as it is synchronized, has overhead of synchronization
        
        System.out.println("ArrayList toy at index 1: " + arrayList.get(1)); // Faster than linked list
        System.out.println("LinkedList toy at index 1: " + linkedList.get(1)); // Slow as it requires traversing through the elements
        System.out.println("Vector toy at index 1: " + vector.get(1)); // Slow as it is synchronized, has overhead of synchronization
        
        
        System.out.println("ArrayList toys: " + arrayList);
        System.out.println("LinkedList toys: " + linkedList);
        System.out.println("Vector toys: " + vector);
    }
}
