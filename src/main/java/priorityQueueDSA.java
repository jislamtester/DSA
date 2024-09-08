import java.util.PriorityQueue;
import java.util.Queue;

// Priority Queue :- Priority Queue is a special type of queue where all the elements
// are ordered on based of there natural ordering (priority) or based on a custom comparator
// given at the time of creation
// Higher prioriy elements are served or processed first before elements of lower priority
public class priorityQueueDSA {public static void main(String[] args){
    Queue<Double> pQueue = new PriorityQueue<>(); // instantiate PriorityQueue
    //Queue<Double> pQueue = new PriorityQueue<>(Collection.reverseOrder());//it is reverse priority queue
    pQueue.offer(7.8);  // offer adds element to the priorityqueue
    pQueue.offer(9.2);
    pQueue.offer(6.4);
    pQueue.offer(8.2);

    while(!pQueue.isEmpty()){
        System.out.println(pQueue.poll());
    }
    // op --> 6.4 , 7.8 , 8.2, 9.2 (Arranged in ascending order)

    // priority queue of grades a,b , c, d
    Queue<Character> grades = new PriorityQueue<>(); // instantiate PriorityQueue

    grades.offer('D'); // offer adds element to the priorityqueue
    grades.offer('A');
    grades.offer('C');
    grades.offer('B');

    while(!grades.isEmpty()){
        System.out.println(grades.poll());
    }

    //Option- 2
    //while (grades.hasNext()) {
    //    System.out.println(grades.next());
    //}

    // op--> A, B, C, D

}
}

// Uses of Priority Queue
// Operating System: To select the next process to run, to ensure that high priority task
// run before low priority tasks