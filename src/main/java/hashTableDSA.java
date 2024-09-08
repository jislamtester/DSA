import java.util.Enumeration;
import java.util.Hashtable;

public class hashTableDSA {

    public static void main(String args[]) {

        // Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //			   Each key/value pair is known as an Entry
        //			   FAST insertion, look up, deletion of key/value pairs
        // 			   Not ideal for small data sets, great with large data sets

        // hashing = Takes a key and computes an integer (formula will vary based on key & data type)
        //		       In a Hashtable, we use the hash % capacity to calculate an index number

        //			key.hashCode() % capacity = index

        // bucket = an indexed storage location for one or more Entries
        //	            can store multiple Entries in case of a collision (linked similarly a LinkedList)

        // collision = hash function generates the same index for more than one key
        //			less collisions = more efficiency

        // Runtime complexity: Best Case O(1)
        //                                     Worst Case O(n)

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put(1, "One");
        hashtable.put(2, "Two");

        // Retrieving a value
        String value = hashtable.get(1);

        // Checking if a key exists
        boolean exists = hashtable.containsKey(2);

        // Checking if a value exists
        boolean hasValue = hashtable.containsValue("Two");

        // Getting the size
        int size = hashtable.size();

        // Iterating over keys
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        // Clearing the hashtable
        hashtable.clear();
    }
}
