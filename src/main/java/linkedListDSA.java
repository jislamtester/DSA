import java.util.LinkedList;

// *******************************************************
// LinkedList =  Nodes are in 2 parts (data + address)
//                        Nodes are in non-consecutive memory locations
//                        Elements are linked using pointers

//    advantages?
//    1. Dynamic Data Structure (allocates needed memory while running)
//    2. Insertion and Deletion of Nodes is easy. O(1)
//    3. No/Low memory waste

//    disadvantages?
//    1. Greater memory usage (additional pointer)
//    2. No random access of elements (no index [i])
//    3. Accessing/searching elements is more time consuming. O(n)

//    uses?
//    1. implement Stacks/Queues
//    2. GPS navigation
//    3. music playlist
//small data set:                                 LinkedList = BAD
//large data set + lots of searching:             LinkedList = BAD
//large data set + lots of inserting/deleting: LinkedList = GOOD

// Linked List :- linear data structure contains/stores nodes which has two parts [data + address]
//                Nodes are in non - consecutive memory locations
//                All the elements are linked using pointers

//                                  Singly Linked List
//                     Node                 Node                  Node
//              [data | address] ---> [data | address] ---> [data  | address]

//                                  Doubly Linked List
//                     Node                 Node                  Node
//              [ address | data | address] <---> [address | data | address] <---> [address | data  | address]

// *******************************************************

public class linkedListDSA {
    public static void main(String[] args){


                        LinkedList<String> linkedList = new LinkedList<String>();
                        /*
                        // LinkedList as a Stack
                        linkedList.push("A");
                        linkedList.push("B");
                        linkedList.push("C");
                        linkedList.push("D");
                        linkedList.push("F");
                        linkedList.pop();
                        */
                        // LinkedList as a Queue
                        linkedList.offer("A");
                        linkedList.offer("B");
                        linkedList.offer("C");
                        linkedList.offer("D");
                        linkedList.offer("F");
                        //linkedList.poll();

                        //To add a node-
                        //linkedList.add(4, "E");
                        //To remove a node-
                        //linkedList.remove("E");
                        //System.out.println(linkedList.indexOf("F"));


                        //System.out.println(linkedList.peekFirst());
                        //System.out.println(linkedList.peekLast());
                        //linkedList.addFirst("0");
                        //linkedList.addLast("G");
                        //String first = linkedList.removeFirst();
                        //String last = linkedList.removeLast();

                        System.out.println(linkedList);

                    }
                }