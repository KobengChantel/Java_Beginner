
//Generic Stack Class
//GenStack class uses a LinkedList to implement the stack.
//stack is a simple type of
//collection that lets you add objects to the top of the collection and remove them
//from the top
//listing 5.1
import java.util.*;
public class GenStack<E>
        {
private LinkedList<E> list = new LinkedList<E>();
public void push(E item)
        {
        list.addFirst(item);
}
public E pop()
        {
        return list.poll();
}
public E peek()
        {
        return list.peek();
}
public boolean hasItems()
        {
        return !list.isEmpty();
}
public int size()
        {
        return list.size();
}
        }
