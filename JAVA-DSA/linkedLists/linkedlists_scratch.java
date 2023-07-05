class ll{

    Node head;

    private int size;

    ll(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node  newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node lastNode=head;
        while(lastNode.next != null){
            lastNode=lastNode.next;
        }

        lastNode.next=newNode;
    }

    public void addInMiddle(int index, String data){
        if(index>size||index<0){
            System.out.println("Invalid Index Value");
            return;
        }

        size++;

        Node newNode=new Node(data);
        if(head==null||index==0){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node currNode = head;
        for(int i=1;i<size;i++){
            if(i==index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode=currNode.next;
        }
    }

    public void printList(){
        Node currNode=head;
        
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("The List is Empty, Nothing to delete");
            return;
        }
        
        head=this.head.next;
        size--;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("The List is Empty, Nothing to delete");
            return;
        }

        size--;

        if(head.next == null){
            head=null;
            return;
        }
        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            currNode=currNode.next;
            lastNode=lastNode.next;
        }
        currNode.next=null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head==null||head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }

}

public class linkedlists_scratch{
    public static void main(String args[]){
        ll list = new ll();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();
        
        list.reverseIterate();
        list.printList();

        list.head=list.reverseRecursive(list.head);
        list.printList();

        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();

        // list.removeFirst();
        // list.printList();

        // list.removeLast();
        // list.printList();

        // list.addInMiddle(1,"Uday");
        // list.printList();


        // System.out.println(list.getSize());
        // list.addFirst("This");
        // list.printList();
        // System.out.println(list.getSize());
 
    }
}