package linkedlist;

import java.util.LinkedList;

public class ListChallenge {

static class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

    public Node getIntersection(Node m, Node n) {
        while (n != null) {
            Node temp = m;
            while (temp != null) {
                if (temp == n) {
                    return n;
                }
                temp = temp.next;
            }
            n = n.next;
        }
        return null;
    }


public static void main(String [] args) {
    ListChallenge list = new ListChallenge();
    Node m, n;

    m = new Node(3);
    n = new Node(99);

    Node newNode = new Node(7);
    m.next = newNode;

    newNode = new Node(1);
    n.next = newNode;

    newNode = new Node(8);
    m.next.next = newNode;
    n.next.next = newNode;

    newNode = new Node(10);
    m.next.next.next = newNode;
    n.next.next.next = newNode;



    Node intersection
            = list.getIntersection(m, n);

        System.out.print("The intersection point is: "
                + intersection.data);
    }
}
