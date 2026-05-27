import java.util.Scanner;
public class Stack_LL{
    class GetNode{
        int data;
        GetNode next;
        public GetNode(){
            next=null;

        }
    }
    public static void main(String[] args) {
        Stack_LL obj=new Stack_LL();
        
        while(true){
            System.out.println("1. Append");
        System.out.println("2. Traverse");
        System.out.println("3. Delete");
        System.out.println("0. Exit");
        System.out.println("Enter Choice:");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                obj.append();
                break;
            case 2:
                obj.traverse();
                break;
            case 3:
                obj.delete();
                break;
            case 0:
                System.exit(0);

        }
    }
    }
    GetNode head=null;
    public void append(){
        System.out.println("Enter data:");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        GetNode newNode=new GetNode();
        newNode.data=data;
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
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
    public void delete(){
        if(head==null){
            System.out.println("List is empty.");
        }
        else{
            head=head.next;
        }
    }

}
