/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version Fall 2019
 * @author Rachel Taylor
 */
public class AMGraphTest {

    private AMGraph<String> instance;

    public AMGraphTest() {

    }

    /**
     * Test of addVertex method, of class AMGraph.
     */
    @Test
    public void testAddVertex() {
        System.out.println("addVertex");
        instance = new AMGraph<>(2);
        assertEquals(0, instance.size());
        instance.addVertex("Bob");
        instance.addVertex("Mary");
        assertEquals(2, instance.size());
        String[] vertices = new String[2];
        vertices[0] = "Bob";
        vertices[1] = "Mary";
        assertArrayEquals(vertices, instance.getVertices());
    }

    /**
     * Test of removeVertex method, of class AMGraph.
     */
    @Test
    public void testRemoveVertex() {
        System.out.println("removeVertex");
        instance = new AMGraph<>(2);
        assertEquals(0, instance.size());
        instance.addVertex("Bob");
        instance.addVertex("Mary");
        assertEquals(2, instance.size());
        String[] vertices = new String[2];
        vertices[0] = "Bob";
        vertices[1] = "Mary";
        assertArrayEquals(vertices, instance.getVertices());
        instance.removeVertex("Mary");
        assertEquals(1, instance.size());
        vertices[0] = "Bob";
        vertices[1] = null;
        assertArrayEquals(vertices, instance.getVertices());
    }

    /**
     * Test of addEdge method, of class AMGraph.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        instance = new AMGraph<>(6);
        instance.addVertex("A");
        instance.addVertex("B");
        instance.addVertex("C");
        instance.addVertex("D");
        instance.addVertex("E");
        instance.addVertex("F");
        assertEquals(6, instance.size());
        instance.addEdge("A", "B");
        instance.addEdge("A", "C");
        instance.addEdge("A", "D");
        instance.addEdge("B", "C");
        instance.addEdge("B", "E");
        instance.addEdge("D", "E");
        instance.addEdge("D", "F");
        boolean[][] edges = new boolean[6][6];
        edges[0][1] = true;
        edges[0][2] = true;
        edges[0][3] = true;
        edges[1][0] = true;
        edges[1][2] = true;
        edges[1][4] = true;
        edges[2][0] = true;
        edges[2][1] = true;
        edges[3][0] = true;
        edges[3][4] = true;
        edges[3][5] = true;
        edges[4][1] = true;
        edges[4][3] = true;
        edges[5][3] = true;
        assertArrayEquals(edges, instance.getEdges());
    }

    /**
     * Test of removeEdge method, of class AMGraph.
     */
    @Test
    public void testRemoveEdge() {
        System.out.println("removeEdge");
        instance = new AMGraph<>(6);
        instance.addVertex("A");
        instance.addVertex("B");
        instance.addVertex("C");
        instance.addVertex("D");
        instance.addVertex("E");
        instance.addVertex("F");
        assertEquals(6, instance.size());
        instance.addEdge("A", "B");
        instance.addEdge("A", "C");
        instance.addEdge("A", "D");
        instance.addEdge("B", "C");
        instance.addEdge("B", "E");
        instance.addEdge("D", "E");
        instance.addEdge("D", "F");
        boolean[][] edges = new boolean[6][6];
        edges[0][1] = true;
        edges[0][2] = true;
        edges[0][3] = true;
        edges[1][0] = true;
        edges[1][2] = true;
        edges[1][4] = true;
        edges[2][0] = true;
        edges[2][1] = true;
        edges[3][0] = true;
        edges[3][4] = true;
        edges[3][5] = true;
        edges[4][1] = true;
        edges[4][3] = true;
        edges[5][3] = true;
        assertArrayEquals(edges, instance.getEdges());
        instance.removeEdge("A", "D");
        assertEquals(6, instance.size());
        edges[0][1] = true;
        edges[0][2] = true;
        edges[0][3] = false;
        edges[1][0] = true;
        edges[1][2] = true;
        edges[1][4] = true;
        edges[2][0] = true;
        edges[2][1] = true;
        edges[3][0] = false;
        edges[3][4] = true;
        edges[3][5] = true;
        edges[4][1] = true;
        edges[4][3] = true;
        edges[5][3] = true;
        assertArrayEquals(edges, instance.getEdges());
    }

    /**
     * Test of isEmpty method, of class AMGraph.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        instance = new AMGraph<>(1);
        assertTrue(instance.isEmpty());
        instance.addVertex("Mary");
        assertFalse(instance.isEmpty());
    }

    /**
     * Test of size method, of class AMGraph.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        instance = new AMGraph<>(1);
        assertEquals(0, instance.size());
        instance.addVertex("Bob");
        assertEquals(1, instance.size());
        instance.removeVertex("Bob");
        assertEquals(0, instance.size());
    }

    /**
     * Test of getEdges method, of class AMGraph.
     */
    @Test
    public void testGetEdges() {
        System.out.println("getEdges");

    }

    /**
     * Test of getVertices method, of class AMGraph.
     */
    @Test
    public void testGetVertices() {
        System.out.println("getVertices");

    }

    /**
     * Test of isComplete method, of class AMGraph.
     */
    @Test
    public void testIsComplete() {
        System.out.println("isComplete");
        instance = new AMGraph<>(6);
        assertTrue(instance.isEmpty());
        instance.addVertex("A");
        instance.addVertex("B");
        instance.addVertex("C");
        instance.addVertex("D");
        instance.addVertex("E");
        instance.addVertex("F");
        assertEquals(6, instance.size());
        instance.addEdge("A", "B");
        instance.addEdge("A", "C");
        instance.addEdge("A", "D");
        instance.addEdge("B", "C");
        instance.addEdge("B", "E");
        instance.addEdge("D", "E");
        instance.addEdge("D", "F");
        assertTrue(instance.isComplete());
    }

}
