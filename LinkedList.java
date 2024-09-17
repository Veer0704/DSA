class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
};

public class LinkedList{
    private static Node convert2Lll(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
        
    }
    


public static void main(String[] args){
    int[] arr = [1,2,3,4];
    Node head  = convert2Lll(arr);
    System.out.println(head.data);
}
}
