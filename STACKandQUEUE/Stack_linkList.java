package STACKandQUEUE;


//STACK  lifo (method->push ,pop , peek )

//implementaion using Array(constant s ize) , linkList(variable size)  and ArrayList(dynamic Array)




public class Stack_linkList {

    static class Node {
        int data; 
        Node next; 
        
        //constructor of Node class
        public Node(int data) {
            this.data= data; 
            this.next= null; 
        }


    }

    static class Stack {
         
        public static Node head;
        // constructor of head class

        Stack() { 
            head=null; 

        } 


        //method of Stack class isEmpty push pop peek 
        public boolean isEmpty() {
            return  head ==null; 

        }


        public void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) { 
                head = newNode;
                return ; 
            }
            newNode.next = head; 
            head = newNode; 
        }

        public  int pop() {
            if(isEmpty()) { 
                System.out.println("Stack is empty") ;               
                return -1; 
            }

            int top = head.data;
            head= head.next; 
            return top;      
        }

        public  int peek() {
             if(isEmpty()) { 
                System.out.println("Stack is empty") ;               
                return -1; 
            }


            int top = head.data; 
            return top ; 

        }
        
    }

    public static void main(String[] args) {

        Stack s = new Stack(); 
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        while(!s.isEmpty()) {

            System.out.println( s.pop() );
            
        }
        

    }
    

    
}
