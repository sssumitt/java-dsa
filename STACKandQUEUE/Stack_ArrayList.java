package STACKandQUEUE;
import java.util.*;
public class Stack_ArrayList {
    
    public static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        

        
        

        //method push pop isEmpty peek
        
        public boolean isEmpty(){
            return list.size() == 0; 
            
        }

        public void push(int data) {
            list.add(data);
           

        }
        public int pop() {
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
         
            return top;

        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);

        }


    }
    
   



    public static void main(String[]args) {

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