class Node {
    public int data;
    public Node next;

    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    public Node(int data1) {
        data = data1;
        next = null;
    }
}

public class DeleteNthNodeFromLast {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node DeleteNthNodefromEnd(Node head, int N) {
        Node fastp = head;
        Node slowp = head;

        for (int i = 0; i < N; i++)
            fastp = fastp.next;

        if (fastp == null)
            return head.next;

        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }

        Node delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }
}
