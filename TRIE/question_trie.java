package TRIE;
//WORD BREAK PROBLEM .

public class question_trie {
    public static void main (String args[]){

        String words[] = {"i","like", "sam" , "samsung","mobile","ice"};

        for(String s: words) {
            Trie.insert(s);
        }

        String key = "like";

        System.out.println(wordBreak(key));

        System.out.println(prefix(key));

    }

    public static boolean wordBreak(String key) {
        if( key.length() == 0 )   return true ;

        for(int i = 1 ; i<=key.length(); i++) {

            if(Trie.search(key.substring(0 , i))  && wordBreak(key.substring(i)) ) {

                return true;

            }
        }

        return false;

    }
    public static boolean prefix(String key ) { 

        Trie.Node curr = Trie.root;

        for(int i =0 ; i< key.length() ; i++) {

            int idx = key.charAt(i)- 'a';

            if(curr.children[idx] == null) {
                return false ;

            }

            curr=curr.children[idx];
        }
        return true ; 

    }



    
}
