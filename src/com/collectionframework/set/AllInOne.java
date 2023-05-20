package com.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllInOne {
    public static void main(String[] args) {
/*
        So imagine you have a toy box with lots of toys in it. You want to make sure that you don't
        put the same toy in the box twice, but you also want to be able to find your toys quickly.
        That's where these sets come in!

        A HashSet is like a big toy box where you can put in all kinds of toys. But it has a special
        magic power that makes sure that you can't put the same toy in the box twice. This makes it
        really easy to keep track of all your toys, and to find them quickly. You just have to remember
        the name of the toy you're looking for, and the HashSet will help you find it really quickly.

        A TreeSet is like a big toy box too, but it sorts your toys automatically as you put them in.
        That way, you can find your toys really quickly by looking at the first toy in the box, and
        then the second, and so on. It's like having all your toys lined up in a neat row on a shelf,
        where you can easily find the one you're looking for.

        A LinkedHashSet is like a toy box that also remembers the order in which you put the toys in.
        So if you put in a toy car first, and then a doll, and then a ball, the LinkedHashSet will
        always remember that order. This can be really useful if you want to find your toys in the order
        that you put them in, or if you want to take them out of the toy box in the same order. It's
        like having your toys arranged in a line, where you can easily find the one you want by looking
        at its place in the line.
*/


//      HashSet - stores elements in a random order
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("pear");
        hashSet.add("kiwi");
        System.out.println("HashSet: " + hashSet);

        // TreeSet - stores elements in a sorted order
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("orange");
        treeSet.add("pear");
        treeSet.add("kiwi");
        System.out.println("TreeSet: " + treeSet);

        // LinkedHashSet - stores elements in the order they were added
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");
        linkedHashSet.add("pear");
        linkedHashSet.add("kiwi");

        System.out.println("LinkedHashSet: " + linkedHashSet);

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
