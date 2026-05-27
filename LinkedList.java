import java.util.Scanner;
public class LinkedList {
    class GetNode{
    int data;
    GetNode next;
    public GetNode(){
        next=null;
    }
}
public static void main(String[] args) {
    LinkedList obj=new LinkedList();
    Scanner sc=new Scanner(System.in);
    while (true) {
    System.out.println("1. Append");
    System.out.println("2. Traverse");
    System.out.println("3. Middle");
    System.out.println("0. Exit");
    int ch=sc.nextInt();
    switch(ch){
        case 1:{
            obj.append();
            break;
        }
        case 2:{
            obj.traverse();
            break;
        }
        case 3:
            obj.Middle();
            break;
        case 0:{
            System.exit(0);
        }

    }
}
}
GetNode head=null;
public void append(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter data: ");
    int data=sc.nextInt();
    GetNode newNode=new GetNode();
    newNode.data=data;
    if(head==null){
        head=newNode;
    }
    else{
        GetNode ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        
    }
    System.out.println("Data is added.");

}
public void traverse(){
    if(head==null){
        System.out.println("List is empty.");
    }
    GetNode ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.println();
}
public void Middle(){
    GetNode start=head;
    GetNode end=head;
    GetNode temp=head;
    while(end!=null && end.next!=null){
        temp=start;
        start=start.next;
        end=end.next.next;
        
    }
    temp.next=start.next;

}
}
