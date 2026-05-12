public class linklist {
    class Node {
        String data;
        Node next;
    
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    // ass - first, last
    Node head;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
    
        newNode.next = head;
        head = newNode;
    }
    
    public void addlast(String data){
    Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
    
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
    
        currNode.next = newNode; 
    }
    
    
    // print
    
    public void printlist(){
        if(head == null ){
    
            System.out.println("list is empty");
            return;
        }
    Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode
            .data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
  public static void main(String[] args) {
    linklist list = new linklist();
    
    // Add elements using addFirst
    list.addFirst("a");
    list.addFirst("is");
    
    // Print the list to see the initial state
    System.out.println("Initial list:");
    list.printlist(); // This will print: is -> a -> null
    
    // Add an element to the end using addlast
    list.addlast("list");
    
    // Print the list again to see the new state
    System.out.println("\nList after addlast:");
    list.printlist(); // This will print: is -> a -> list -> null
}
}
