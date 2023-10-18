package TRIE;

/*many words given ? find the given word  */

class Trie {

    static class Node {
        Node children[];// every node has an array that stores the info of the character a-z in the
                        // array where 0 -> a ...

        Boolean eow;// to mark that one of our string is completely stored

        // constructor of node class

        Node() {

            children = new Node[26];

            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;

        }
    }

    static Node root = new Node();// like a head always remain empty

    public static void insert(String Word) {
        

        Node curr = root;
        

        for (int i = 0; i < Word.length(); i++) {

            int idx = Word.charAt(i) - 'a';
           
            if ( curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            if (i == Word.length() - 1) {
               curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }

    }

    public static boolean search(String Word) {
        Node curr = root;

        for (int i = 0; i < Word.length(); i++) {

            int idx = Word.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }

            if (i == Word.length() - 1 && node.eow == false) {
                return false;
            }
            curr = curr.children[idx];

        }

        return true;

    }
    
}



public class Retrival_tree {
    public static void main(String[] args) {
        String Words[] = { "there", "their", "any", "anywhere" };

        for (int i = 0; i < Words.length; i++) {
            Trie.insert(Words[i]);
        }

        System.out.println(Trie.search("any"));
        System.out.println(Trie.search("an"));
        System.out.println(Trie.search("thor"));
    }

}
