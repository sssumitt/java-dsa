package STACKandQUEUE;
import java.util.*; 

public class Queue_LL {
   


    static class Node {

        int data;
        Node next; 

        public Node(int data) {

            this.data= data;
            next = null;

        }
    }
    static class queue{


    static Node head= null; 
    static Node tail= null;
    
        //constructor of queue_ll
        

        //methods for Queue
        public boolean isEmpty() {
            return head == null && tail ==null;
        }
       

        public void enqueue(int data) {
            Node newNode = new Node(data);
            
            if(isEmpty()){

                head = newNode;
                tail = newNode;

                return;
            }

            tail.next= newNode;
            tail= newNode;
        
            return;
        }
        public int dequeue(){
            
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int result = head.data;

            //single element
            if(head==tail) {
                head = tail = null;
                return result;
            }
            head = head.next;
            return result;
        }


        public int peek (){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
}

    public static void main(String[] args) {
     queue q = new queue();
     
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        
        q.enqueue(4);
        
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

        System.out.println("_______________________________");

        //using collection farmework 
        Queue<Integer> Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.remove();
        Q.add(4);
         
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }

        
    }
}



