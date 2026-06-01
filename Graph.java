import java.util.ArrayList;
import java.util.Scanner;
public class Graph {
    int nodeCount;
    ArrayList<String> nodes;
    ArrayList<ArrayList<Integer>> graph;
    public Graph(){
        nodeCount=0;
        nodes=new ArrayList<>();
        graph=new ArrayList<>();

    }
    public void addNode(String v){
        if(graph.contains(v)){
            System.out.println(v+" is already present.");
        }
        else{
            nodes.add(v);
            nodeCount++;
            for(ArrayList<Integer> row:graph){
                row.add(0);
            }
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<nodeCount;i++){
                temp.add(0);
            }
            graph.add(temp);
        }
        
    }
    //undirected unweighted 
    public void addEdge(String v1, String v2){
        if(!nodes.contains(v1)){
            System.out.println("Vertex1 not present");
        }
        else if(!nodes.contains(v2)){
            System.out.println("Vertex2 not present");
        }
        else{
            int index1=nodes.indexOf(v1);
            int index2=nodes.indexOf(v2);
            graph.get(index1).set(index2,1);
            graph.get(index2).set(index1,1);
        }
    }
    public void addEdgeUndirectedWeight(String v1, String v2, int w){
        if(!nodes.contains(v1)){
            System.out.println("Vertex1 not present");
        }
        else if(!nodes.contains(v2)){
            System.out.println("Vertex2 not present");
        }
        else{
            int index1=nodes.indexOf(v1);
            int index2=nodes.indexOf(v2);
            graph.get(index1).set(index2,w);
            graph.get(index2).set(index1,w);
        }
    }
    public void addEdgeDirectedWeight(String v1, String v2, int w){
        if(!nodes.contains(v1)){
            System.out.println("Vertex1 not present");
        }
        else if(!nodes.contains(v2)){
            System.out.println("Vertex2 not present");
        }
        else{
            int index1=nodes.indexOf(v1);
            int index2=nodes.indexOf(v2);
            graph.get(index1).set(index2,w);
            
        }

    }
    public void printGraph(){
        System.out.print("\n  ");
        for(int i=0;i<nodeCount;i++){
            System.out.print(nodes.get(i)+" ");
        }
        System.out.println();
        for(int i=0;i<nodeCount;i++){
            System.out.print(nodes.get(i)+" ");
            for(int j=0;j<nodeCount;j++){
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public void deleteNode(String v){
        if(!nodes.contains(v)){
            System.out.println("Vertex doesnt exist.");
        }
        else{
            int index1=nodes.indexOf(v);
            graph.remove(index1);
            for(ArrayList<Integer> col:graph){
                col.remove(index1);
            }
            nodeCount--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Graph g=new Graph();
        while(true){
            System.out.println("\n1. add a node using adjacency matrix representation");
            System.out.println("2. add a edge using adjacency matrix representation");
            System.out.println("3. add a edge undirected weighted graph");
            System.out.println("4. add a edge directed weighted graph");
            System.out.println("5. Print Graph");
            System.out.println("6. Delete Operation");
            System.out.println("0. Exit \n");
            System.out.println("Enter choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:{
                    sc.nextLine();
                    System.out.println("Enter vertex:");
                    String v=sc.nextLine();
                    g.addNode(v);
                    break;
                }
                case 2:{
                    sc.nextLine();
                    System.out.println("Enter vertex 1");
                    String v1=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter vertex 2");
                    String v2=sc.nextLine();

                    g.addEdge(v1,v2);
                    break;
                }
                case 3:{
                    sc.nextLine();
                    System.out.println("Enter vertex 1");
                    String v1=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter vertex 2");
                    String v2=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter weight");
                    int w=sc.nextInt();
                    g.addEdgeUndirectedWeight(v1,v2,w);
                    break;
                }
                case 4:{
                    sc.nextLine();
                    System.out.println("Enter vertex 1");
                    String v1=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter vertex 2");
                    String v2=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter weight");
                    int w=sc.nextInt();
                    g.addEdgeDirectedWeight(v1,v2,w);
                    break;
                }
                case 5:{
                    g.printGraph();
                    break;
                }
                case 6:{
                    sc.nextLine();
                    System.out.println("Enter vertex to delete");
                    String v=sc.nextLine();
                    g.deleteNode(v);
                    break;
                }
                case 0:{
                    System.exit(0);
                }
            }
        }
    }
}
