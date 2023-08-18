package Stack;

public class Stack_LinkedList{
    
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        //push O(1)
        //pop O(1)
        //peek O(1)
        public static Node head=null;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top=head;
            head=head.next;
            return top.data;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top=head;
            return top.data;
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
    }
}