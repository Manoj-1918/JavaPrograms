public class linkedList {
    Node head=null;
    Node temp=null;
    //add one data

    void addData(int data){
        Node new_node= new Node();
        new_node.data=data;
        new_node.next=null;

        if(head==null){
            head=new_node;
            temp=head;
        }
        else{
            temp.next=new_node;
            temp=new_node;
        }

    }

    // insertion in linkedList

    void insertAtStart(int data){
        Node new_node= new Node();
        new_node.data=data;
        new_node.next=null;

        if(head==null){
            head=new_node;
            temp=head;
        }
        else{
            new_node.next=head;
            head=new_node;
        }

    }

    void insertAtEnd(int data){
        Node new_node= new Node();
        new_node.data=data;
        new_node.next=null;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }

    void insertAt(int pos,int data){
        Node new_node= new Node();
        new_node.data=data;
        new_node.next=null;
        temp=head;
        if(head==null){
            head=new_node;
        }
        else{
            for(int i=0;i<pos-2;i++){
                temp=temp.next;
            }
            Node k=temp.next;
            temp.next=new_node;
            temp=new_node;
            temp.next=k;
        }
    }

    void deleteAtEnd(){
        temp=head;
        if(head==null){
            System.out.println("no data is stored yet");
        }
        else{
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    }

    
    void deleteAtStart(){
        if(head==null){
            System.out.println("node data is stored yet");
        }
        else{
        head=head.next;
        }
        
    }

    void deleteAt(int pos){
        temp=head;
        for(int i=0;i<pos-2;i++){
            temp=temp.next;
        }

    }

    void show(){
        temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }
    }
    
}
