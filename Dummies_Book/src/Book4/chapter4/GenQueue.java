package Book4.chapter4;

import java.util.LinkedList; // Importing LinkedList to use as the underlying data structure for the queue

// Generic class representing a queue data structure
public class GenQueue<E> {
    // LinkedList to hold the elements of the queue
    private LinkedList<E> list = new LinkedList<>(); // Initialize the LinkedList

    // Default constructor for GenQueue
    public GenQueue() {
    }

    // Method to add an item to the end of the queue
    public void enqueue(E item) {
        this.list.addLast(item); // Add the item to the end of the LinkedList
    }

    // Method to remove and return the item at the front of the queue
    public E dequeue() {
        return this.list.poll(); // Remove and return the first item in the LinkedList; returns null if empty
    }

    // Method to check if the queue has any items
    public boolean hasItems() {
        return !this.list.isEmpty(); // Returns true if the queue is not empty
    }

    // Method to get the number of items in the queue
    public int size() {
        return this.list.size(); // Returns the size of the LinkedList
    }

    // Method to add all items from another GenQueue to this queue
    public void addItems(GenQueue<? extends E> q) {
        // While the provided queue has items, dequeue and add them to this queue
        while(q.hasItems()) {
            this.list.addLast(q.dequeue()); // Dequeue from the provided queue and add to this queue
        }
    }
}
