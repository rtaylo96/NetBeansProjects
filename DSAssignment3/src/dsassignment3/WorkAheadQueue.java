package dsassignment3;

import DataStructures.*;
import Exceptions.EmptyCollectionException;
import Exceptions.InvalidArgumentException;
import java.util.ArrayList;

/**
 *
 * @author Rachel Taylor
 * @version Fall 2019
 * @param <T>
 */
public class WorkAheadQueue<T> implements WorkAheadQueueADT<T> {

    private LinearNode<T> front;
    private LinearNode<T> back;
    private ArrayList<LinearNode<T>> frontThreeNodes;
    private ArrayList<T> frontThreeElements;
    private int numNodes;

    /**
     * A place to intialize reference variables.
     */
    public WorkAheadQueue() {
        frontThreeNodes = new ArrayList<>();
        frontThreeElements = new ArrayList<>();
        numNodes = 0;
        front = null;
        back = null;
    }

    /**
     * Removes and returns the element that is at place x in the queue.
     * Precondition: x must be less than 5, x must be less than size Note:
     * indexing from 0: 0 == front element, 1 == second element, etc.
     *
     * @param x the passed in index of the element to be removed
     * @return the element removed from the queue
     * @throws EmptyCollectionException if the queue is empty
     * @throws InvalidArgumentException if x > 4, or x > size of collection
     */
    @Override
    public T dequeue(int x) throws EmptyCollectionException, InvalidArgumentException {
        if (isEmpty()) {
            throw new EmptyCollectionException("dequeue(int x) : empty queue");
        }
        LinearNode<T> curr = front;
        if (x == 0) {
            dequeue();
        } else {
            if (x > 1 || x > size()) {
                throw new InvalidArgumentException("dequeue(int x): invalid arg");
            }
            for (int i = 0; i < x; i++) {
                curr = curr.getNext();
            }
            if (curr == back) {
                //Remove last
                //Set back's prev's next to null
                back.setPrev(back.getNext());
                //Change back to back's prev
                back = back.getPrev();

            } else {
                //Remove from middle
                //Set curr's prev to curr's next
                curr.setPrev(curr.getNext());
                //Set curr's next to curr's prev
                curr.setNext(curr.getPrev());
            }
            numNodes--;
        }
        return curr.getElement();
    }

    /**
     * Returns (without removing) the element that is at place x in the queue.
     * Precondition: x must be less than 5, x must be less than size Note:
     * indexing from 0: 0 == front element, 1 == second element, etc.
     *
     * @return the element at the front of the queue
     * @throws EmptyCollectionException if the queue is empty
     * @throws InvalidArgumentException if x > 4, or x > size of collection
     * @param x the specified index of the element to return
     */
    @Override
    public T first(int x) throws EmptyCollectionException, InvalidArgumentException {
        if (isEmpty()) {
            throw new EmptyCollectionException("first(int x) : empty queue");
        }
        if (!isEmpty()) {
            if (x > 4 || x > size()) {
                throw new InvalidArgumentException("first(int x): invalid arg");
            }
            LinearNode<T> curr = front;
            // check exceptions
            for (int i = 0; i < x; i++) {
                curr = curr.getNext();
            }
            return curr.getElement();
        }
        return null;
    }

    /**
     * Returns an ArrayList of the first three nodes in the queue.
     *
     * @return ArrayList<LinearNode<T>> array list of nodes
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public ArrayList<LinearNode<T>> firstThreeNodes() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("firstThreeNodes() : empty queue");
        }
        frontThreeNodes.clear();
        LinearNode<T> curr = front;
        for (int i = 0; i < 3 && i < size(); i++) {
            frontThreeNodes.add(curr);
            curr = curr.getNext();
        }
        return frontThreeNodes;
    }

    /**
     * Returns an ArrayList of the first three elements in the queue.
     *
     * @return ArrayList<T> array list of elements
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public ArrayList<T> firstThreeElements() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("firstThreeElements() : empty queue");
        }
        frontThreeElements.clear();
        LinearNode<T> curr = front;
        for (int i = 0; i < 3 && i < size(); i++) {
            frontThreeElements.add(i, curr.getElement());
            curr = curr.getNext();
        }
        return frontThreeElements;
    }

    /**
     * Adds the specified element to the end of the queue.
     *
     * @param element to be added to the queue.
     */
    @Override
    public void enqueue(T element) {
        LinearNode<T> curr = new LinearNode<>(element);
        if (isEmpty()) {
            front = curr;
        } else {
            back.setNext(curr);
        }
        back = curr;
        numNodes++;
    }

    /**
     * Removes the element at the front of the queue
     *
     * @return a reference to the node being removed
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("dequeue() : empty queue");
        }
        if (isEmpty()) {
            back = null;
        }
        T curr = front.getElement();
        front = front.getNext();
        numNodes--;
        return curr;
    }

    /**
     * Returns a reference to the element at the front of the queue. The element
     * is not removed from the queue
     *
     * @return a reference to the element at the front of the queue
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("first() : empty queue");
        }
        return front.getElement();
    }

    /**
     * Returns true if the collection contains no elements
     *
     * @return true if the collection is empty
     */
    @Override
    public boolean isEmpty() {
        return numNodes == 0;
    }

    /**
     * Returns the number of elements in the collection
     *
     * @return the number of elements as an int
     */
    @Override
    public int size() {
        return numNodes;
    }

    /**
     * Returns a string representation of the collection
     *
     * @return a string representation of the collection
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        LinearNode curr = front;
        for (int i = 0; i < size(); i++) {
            sb.append(curr.getElement().toString());
            if (i < size() - 1) {
                sb.append(", ");
            }
            curr = curr.getNext();
        }
        return sb.toString();
    }
}
