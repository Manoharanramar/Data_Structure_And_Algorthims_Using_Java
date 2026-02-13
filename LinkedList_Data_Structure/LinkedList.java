package LinkedList_Data_Structure;

class Node{//node declaration
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedList{
    Node head=null;
    void inserAtBeggning(int data){//insert at beggning
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void insertAtLast(int data){
        if(head==null){//insert at last
            inserAtBeggning(data);
        }
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void insertAtMiddle(int index,int data){//insert at middle
        if(index<0){
            System.out.println("Not valid");
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node newNode=new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    void delete(int data){//delete the element
        Node temp=head;
        if(head.data==data){
            head=head.next;
            return;
        }
        while(temp.next!=null&&temp.next.data!=data){
            temp=temp.next;
        }
        if(temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }


    void deleteIndex(int index){
        //delete the index element
       if(index<0){
            System.out.println("Not valid");
            return;
        }
        if(index==0){
            head=head.next;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    void search(int data){//search the element
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                System.out.println("true");
            }
            temp=temp.next;
        }
        return;
    }

    void display(){//Display the element
        Node temp=head;
            while(temp!=null){
            System.out.print(temp.data+"->");
			temp=temp.next;
            }
        	System.out.print("null");    
    }
    public static void main(String[] args) {
        LinkedList a=new LinkedList();
        a.inserAtBeggning(1);
		a.inserAtBeggning(2);
		a.inserAtBeggning(3);
		a.inserAtBeggning(4);
		a.inserAtBeggning(5);
		a.inserAtBeggning(6);
		
        //insert at last
		a.insertAtLast(10);
		
        //insert at middle
		a.insertAtMiddle(2, -4);
	
        //delete the element
		a.delete(4);
		
         //delete the index_element
		a.deleteIndex(3);
		
        //serch the element
		a.search(1);
		a.display();
    }
}

