public class start {
    public static void main(String[] args) {

        linkedList list =new linkedList();
        list.addData(5);
        list.addData(4);
        list.addData(3);
        list.insertAtStart(1);
        list.insertAtEnd(9);
        list.insertAt(3,5);
        list.deleteAtEnd();
       // list.deleteAt(3);
        list.deleteAtStart();

        list.show();
    }
}
