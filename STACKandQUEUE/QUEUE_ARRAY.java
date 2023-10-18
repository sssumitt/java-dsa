package STACKandQUEUE;





class QUEUE_ARRAY{


    static class Queue{

        static int arr[];
        int size;
        int rear;

        //constructor

        Queue(int size){
            this.size= size;

            arr = new int[size];
            rear= -1;

        }

        // method enqueue dequeue isEmpty isFull 
        public boolean isEmpty(){
            return rear == -1;
        }

        public boolean isFull(){
            return rear == size-1;
        }

        // enqueue O(1)

        public void enqueue(int data) {
            if(isFull()) {
                System.out.println("queue full");
                return ;
            }

            rear++;
            arr[rear]= data;  

        }

        //dequeue O(n)

        public int dequeue() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1; 

            }

            int front = arr[0];
            for(int i=0; i< rear; i++) {
                arr[i]= arr[i+1];
            }
            rear--;
            return front; 
        }

        // O(n)
        public int peek() {
             if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1; 
            }
            return arr[0];

        }
        






    }
    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(2);

       


        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }

        
    }
}


