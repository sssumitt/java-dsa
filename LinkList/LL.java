package LinkList;

class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first ,last
    void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode ;
            return ;
        }

        newNode.next = head;
        head = newNode;

    }

    void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

    }

    void printList() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // delete node

    void deletefirst() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        head = head.next;
        size--;
    }

    void deleteLast() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {

            secondLast = lastNode;
            lastNode = lastNode.next;

        }
        secondLast.next = null;

        size--;
    }

    // delete from n pos

    void deletePos(int n) {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp1 = head;
        Node temp2 = head;

        // traverse to n-1th pos

        for (int i = 0; i < n - 2; i++) {
            temp1 = temp1.next;
        }

        // nth pos
        temp2 = temp1.next;

        temp1.next = temp2.next;

        size--;

    }

    // return the size of the array

    int getSize() {

        return size;
    }

    // reverse link list
    void reverseLL() {
        Node front = null;
        Node back = head;
        Node curr = head.next;

        while (curr != null) {
            front = curr.next;
            curr.next = back;

            // update
            back = curr;
            curr = front;
        }
        head.next = null;

        head = back;

    }

    // n th node from the last
    String getNodeLast(int n) {
        int pos = getSize() - n + 1;
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        return temp.data;

    }

    // n th node from the last
    String getNodeFirst(int n) {
        int pos = n;
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        return temp.data;

    }

    // find cycle in the
    boolean cycleDetection() {
        Node Hare = head;
        Node Turtle = head;
        if (head == null) {
            return false;
        }

        while (Hare != null && Hare.next != null) {

            Hare = Hare.next.next;
            Turtle = Turtle.next;

            if (Turtle == Hare) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        LL list = new LL();

        list.addLast("r");
        list.addLast("o");
        list.addLast("t");
        list.addLast("o");
        list.addLast("r");

        // list.addfirst("b");
        // list.addfirst("c");

        // list.deletefirst();
        // list.printList();

        // list.deletePos(1);
        // System.out.println("\n");

        list.printList();

        list.reverseLL();

        int flag = 0;

        list.printList();

        for (int i = 1; i < list.size / 2; i++) {
            if (list.getNodeFirst(i).equals(list.getNodeLast(i))) {
                flag = 1;

            } else {
                flag = 0;
                System.out.print("Not a palindrome");
                break;
            }
        }

        if (flag == 1) {
            System.out.print("palindrome");

        }

    }

}