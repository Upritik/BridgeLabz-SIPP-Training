public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();  

        // list.rotateright(2);
        // list.display();
        list.AddAtMiddle(25, 3);
        list.display();

        list.remove(20);
        list.display();  

        list.remove(10);
        list.display();  
    }
}
