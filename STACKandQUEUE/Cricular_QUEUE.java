package STACKandQUEUE;


class Circular_QUEUE{


    static class Queue{

        static int arr[];
        int size;
        int rear;
        int front;

        //constructor

        Queue(int size){
            this.size= size;

            arr = new int[size];
            rear= -1;
            front=-1;

        }

        // method enqueue dequeue isEmpty isFull 
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return rear == front-1;
        }

        // enqueue O(1)

        public void enqueue(int data) {
            if(isFull()) {

                System.out.println("queue full");

                return;
            }
            if(front== -1){
                front = 0;

            }


            rear= (rear+1)%size ;
            arr[rear]= data ; 


        }

        //dequeue O(1)

        public int dequeue() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1; 
            }

            int data = arr[front];

            //when single element in Queue

            if(rear == front) {
                rear  =-1; 
                front =-1; 
            } else {
                front = (front+1)%size;
            }

            return data; 

        }

        // peek O(n)
        public int peek() {
             if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1; 
            }
            return arr[front];

        }
        






    }
    public static void main(String[] args) {

        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(4);
        q.dequeue();
        q.enqueue(5);
        
       
       


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

        
    }
}


