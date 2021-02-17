package Maze_DS;

import ADTs.StackADT;
import Exceptions.EmptyCollectionException;
import grid.Location;
import java.util.ArrayList;

/**
 * @version Fall 2019
 * @author Rachel Taylor
 * @param <T>
 */
public class ArrayListStack<T> implements StackADT<T> {

    private ArrayList<T> stackT;

    /**
     * Default constructor of Stack object.
     */
    public ArrayListStack() {
        this.stackT = new ArrayList<>();
    }

    /**
     * Method to add a new element into the Stack.
     *
     * @param element the element to be added into the stack.
     */
    @Override
    public void push(T element) {
        stackT.add(element);
    }

    /**
     * Method to return and remove the top item from the stack
     *
     * @return the element that comes after the top element from the stack
     * @throws EmptyCollectionException
     */
    @Override
    public T pop() throws EmptyCollectionException {
        if (stackT.isEmpty()) {
            throw new EmptyCollectionException("Stack is Empty");
        }
        return stackT.remove(stackT.size() - 1);
    }

    /**
     * Method to peek at the top element of the stack.
     *
     * @return element at the top of the stack
     * @throws EmptyCollectionException
     */
    @Override
    public T peek() throws EmptyCollectionException {
        if (stackT.isEmpty()) {
            throw new EmptyCollectionException("Stack is Empty");
        }
        return stackT.get(size() - 1);
    }

    /**
     * Gets whether the stack is empty.
     *
     * @return true if and only if the collection is empty
     */
    @Override
    public boolean isEmpty() {
        return stackT.isEmpty();
    }

    /**
     * Gets the size of the stack.
     *
     * @return the size of the stack.
     */
    @Override
    public int size() {
        return stackT.size();
    }

    /**
     * Returns a string representing this object.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        return "ArrayListStack(" + "list=" + stackT + ')';
    }
}
