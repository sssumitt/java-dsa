package LinkList;

import java.util.*;



public class LL_collection {
    public static void main (String []args){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("apple");
        list.addFirst("an");

        
        
        list.addLast("very");
        list.addLast("red");
        
        

        System.out.println(list.size());

        for(int i = 0 ; i <list.size() ; i++){ 

            System.out.print(list.get(i)+"->");

        }
        System.out.print("null");

        list.removeFirst();
        list.remove(0);

        list.removeLast();


        System.out.print("\n");


      
        for(int i = 0 ; i <list.size() ; i++){ 

            System.out.print(list.get(i)+"->");

        }


    }
    
    
}
