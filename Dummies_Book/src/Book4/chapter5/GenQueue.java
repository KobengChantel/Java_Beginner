
//Generic Queue class
// queue is another type of collection
//that lets you add objects to the end of the collection and remove them from the
//top. Queues are commonly used in all sorts of applications, from data processing
//applications to sophisticated networking systems

//queue class is named GenQueue and has the following methods:
//» enqueue: This method adds an object to the end of the queue.
//» dequeue:Thismethodretrievesthefirstitemfromthequeue.Theitemis
//removed from the queue in the process. If the queue is empty, this method
//returns null.
//» hasItems: This method returns a boolean value of true if the queue has at
//least one item in it.
//» size: This method returns an int value that indicates how many items are in
//the stack.
//» addItems: This method accepts another GenQueue object as a parameter.
//listing 5.2
import java.util.*;
public class GenQueue<E>
        {
private LinkedList<E> list = new LinkedList<E>();
public void enqueue(E item)
        {
        list.addLast(item);
}
public E dequeue()
        {
        return list.poll();
}
public boolean hasItems()
{
    return !list.isEmpty();
}
public int size()
{
    return list.size();
}
public void addItems(GenQueue<? extends E> q)
{
    while (q.hasItems())
        list.addLast(q.dequeue());
}
}
