/*
 * implemented using array of linklist
 * 
 * link list is stored in a array    
 * n(nodes)=6
 * N(size)=4=bucket(index of array )
 * bucket stores the nodes of link list
 * put(K,V)
 * checks if key exist ->then just update 
 * checks if key does not exist ->then new K,V pair 
 * hashing change the form of data fjdksj->5738743
 * many algorithm 
 */


package hashing.hashmap_implementation;
import java.util.*;



class HashMap<K,V> {    
//generics K And V can be any data type expect primitive (to use primitive data type we need to use wrapper functions)

       


//----------NODE CLASS------------//

        private class Node{
            //variables
            K keys;
            V value;
    
            //construtor
            public Node(K key,V value){
            this.keys= key;
            this.value= value;
            }
        }
//---------------------------------//    

//      VARIBLES of HashMap  class

    private int n;//number of nodes
    private int N;//number of BUCKETLIST
    private LinkedList<Node> buckets[]; // array of linklists
    private double threshold = 2.0;

//      constuctor of HashMap class 

@SuppressWarnings("unchecked")
    public HashMap() 
    {
        this.N=4;
        this.buckets= new LinkedList[4];

        for(int i =0 ; i < 4;i++)
        {
            this.buckets[i]= new LinkedList<>();

        }
   
    }
//-------------------------------------------------//
    //methods of HashMap class



    private int hashFunction(K key){
        int bi = key.hashCode();// may return pos or negative 
        return Math.abs(bi)% N;//  %N to keep the index between the range 0 to n-1
    }




    private int searchLL(K key,int bi)
    {
        LinkedList<Node> l1= buckets[bi];
        for(int i = 0; i<l1.size(); i++)
        {
            if(l1.get(i).keys == key)
            {
                return i ;
            }
        }
        return -1;
    }


    // please revise  {this concept is imp} 
    @SuppressWarnings("unchecked")
    private void rehash()
    {
        LinkedList<Node> oldBucket[] = buckets;
      
        buckets = new LinkedList[N*2];

        for(int i = 0 ; i<N*2;i++){
            buckets[i] = new LinkedList<>();
        }

        for(int i = 0 ; i < oldBucket.length; i++ )
        {
            LinkedList<Node> l1 = oldBucket[i];

                for(int j= 0; j<l1.size();j++)
                {
                    Node node = l1.get(j);
                    put(node.keys , node.value );

                }
            }

    }




    public void put(K key, V value){
        int b_Index= hashFunction(key);


        int data_Index= searchLL(key,b_Index);

        if(data_Index ==-1){  //KEY DOES NOT EXIST
            buckets[b_Index].add(new Node(key, value));
            n++;
        }
        
        else{  //KEY  EXISTS
            Node data = buckets[b_Index].get(data_Index);
            data.value= value;
        }

        double Lambda= (double)n/N;
        if(Lambda>threshold){
            //REHASHING
            rehash();

        }

 
    }


    public V get(K key){
        int bi= hashFunction(key);
        int di= searchLL(key, bi);

        if(di==-1){
            return null;
        }
        
        else{
            Node node = buckets[bi].get(di);
            return node.value;
        }
    }


    public boolean containsKey(K key){
        int bi= hashFunction(key);
        int di= searchLL(key, bi);

        if(di==-1){
            return false;
        }

        else{
            return true;
        }

    }

     public V remove(K key){
        int bi= hashFunction(key);
        int di= searchLL(key, bi);

        if(di==-1){
            return null;
        }
        
        else{
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }
    }



    public boolean isEmpty(){
        return n==0;

    }


    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i =0; i<N; i++){
            LinkedList<Node> l1 = buckets[i];

            for(int j =0 ;j<l1.size();j++){

                Node node = l1.get(j);
                keys.add(node.keys);

            }
        }
        return keys;
    }


}




public class HashMapCode{ 
    public static void main (String[]args){
        HashMap<String,Integer> map = new HashMap<>();

        map.put("China",234323);
        map.put("India",2343);
        map.put("USA",2323);
        
        ArrayList<String> keys = map.keySet();

        for(int i = 0; i<keys.size(); i++){
            System.out.println(keys.get(i)+"  "+map.get(keys.get(i)));
        }
        System.out.println("%$%$$%$%$%$%$%");

        map.remove("India");
       
        System.out.println(map.get("India"));
      





    }

}


















    

