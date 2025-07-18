public class link{
    Node head;
    static class Node {
        String data;
        Node next;

        Node(String data ) {
            this.data =  data;
            this.next = null;
        }
    }

public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null) {
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}

public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null) {
        head = newNode;
        return;
    }

    Node currNode = head;
    while(currNode.next != null){
        currNode = currNode.next;
    }
currNode.next = newNode;

}

public void printList(){
    if(head ==null){
        System.out.println("list is empty");
        return;
    }
        Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data + " ->");
        currNode = currNode.next;
    }

    System.out.println("null");


}                             

    public static void main(String args[]) {
        link list = new link(); 
        list.addFirst("a");
        list.addLast("is"); 
        list.printList();


    }
}