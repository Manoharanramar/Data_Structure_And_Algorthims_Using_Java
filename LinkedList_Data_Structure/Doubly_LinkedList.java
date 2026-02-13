package LinkedList_Data_Structure;
class Node{//node declaration
    int data;
    Node next;
    Node prev;//prev node add
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Doubly_LinkedList{
    Node head=null;
    void inserAtBeggning(int data){//insert at beggning
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;//prev node add prev->(null)
        head=newNode;
    }
    void insertAtLast(int data){
        if(head==null){//insert at last
            inserAtBeggning(data);
            return; 
        }
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;//prev node add at last index->[[temp][data][null]]
    }
    void insertAtMiddle(int index,int data){//insert at middle
        if(index<0){
            System.out.println("Not valid");
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1&&temp!=null;i++){
            temp=temp.next;
        }
        Node newNode=new Node(data);
        newNode.next=temp.next;
        newNode.prev=temp;//prev value 
        if(temp.next != null){
         temp.next.prev = newNode;
        }
        temp.next = newNode;
        }
    void delete(int data){//delete the element
        Node temp=head;
        if(head.data==data){
            head=head.next;
             if(head != null){
                head.prev = null;
             }
            return;
        }
        while(temp.next!=null&&temp.next.data!=data){
            temp=temp.next;
        }
        if(temp.next==null){
            return;
        }
        if(temp.next==null || temp==null){
            return;
        }
        temp.next=temp.next.next;//temp.next(4)->temp.next(3)
        if(temp.next==null||temp==null){
            return;
        }
        temp.next.prev=temp;//2 4 5 3 -> if 4->temp   temp-next=5  temp-next-next=3
    }
    void deleteIndex(int index){
        //delete the index element
       if(index<0){
            System.out.println("Not valid");
            return;
        }
        if(head == null){return;} 
        if(index==0){
            head=head.next;
            if(head!=null){
                 head.prev=null;}
                return;
            
        }
        Node temp=head;
        for(int i=0;i<index-1&&temp!=null;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(temp.next==null){
            return;
        }
        temp.next.prev=temp;//2 4 5 3 -> if 4->temp   temp-next=5  temp-next-next=3
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
       Doubly_LinkedList a=new Doubly_LinkedList();
        a.inserAtBeggning(1);
		a.inserAtBeggning(2);
		a.inserAtBeggning(3);
		a.inserAtBeggning(4);
		a.inserAtBeggning(5);
		a.inserAtBeggning(6);
		a.insertAtLast(10);
		a.insertAtMiddle(2, 10);

        a.delete(1);
		a.display();
    }
}
