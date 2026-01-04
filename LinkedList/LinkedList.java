
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public static void adddMiddile(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;

    }

    public static int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public static int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;
    }

    public static int recSearch(int key) {
        return helper(head, key);
    }

    public static void reverseList() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void removeNthNode(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }
        if (n == sz) {
            head = head.next;
        }
        Node prev = head;
        int i = 1;
        while (i != sz - n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;
    
    // Find middle (Floyd's Cycle Finding)
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow; // This is the head of the second half
}

public boolean checkPalindrome() {
    //Empty or Single node is always a palindrome.
    if (head == null || head.next == null) {
        return true;
    }

    // Step 1: Find Middle
    Node midNode = findMid(head);

    // Step 2: Reverse the Second Half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while (curr != null) {
        next = curr.next; 
        curr.next = prev; 
        prev = curr;
        curr = next;
    }

    // Step 3: Check Left vs Right
    Node right = prev; // Head of the reversed second half
    Node left = head;  // Head of the first half

    while (right != null) {
        if (left.data != right.data) {
            return false;
        }
        left = left.next;
        right = right.next;
    }

    return true;
} 


    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.adddMiddile(2, 5);
        System.out.println("Key found at: " + ll.itrSearch(5));
        System.out.println("Key found at: " + ll.recSearch(5));
        ll.reverseList();
        ll.removeNthNode(2);
        System.out.println(ll.checkPalindrome());
        ll.print();
        System.out.println(size);
    }
}
