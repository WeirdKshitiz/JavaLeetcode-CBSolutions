import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
public class bipartiteGraph {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;   
        }
    }

    static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    // -1=no color
    // 0=yellow
    // 1=blue

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[]=new int[graph.length]; //color wala array
        for(int i=0;i<col.length;i++){
            col[i]=-1; //no color
        }

        Queue<Integer>q=new LinkedList<>();
for(int i=0;i<graph.length;i++){
    if(col[i]==-1){
        //agar color nhi diya hua
        //then BFS
        q.add(i);
        col[i]=0; //yellow
        while(!q.isEmpty()){
            int curr=q.remove();
            for(int j=0;j<graph[curr].size();j++){
                Edge e= graph[curr].get(j);  //e ka destination

                //case 1=no color
                if(col[e.dest]==-1){
                    int nextCol;
                   if(col[curr]==0){
                    nextCol=1;
                   }
                   else{
                    nextCol=0;
                   }
                   col[e.dest]=nextCol;
                   q.add(e.dest); //next node ko add krdiya
                }





                else if(col[e.dest]==col[curr]){
                    //agar source aur neighbour ka
                    //color same mil gya
                    return false;
                }
            }
        }
    }
}
return true;
    }
  public static void main(String[] args) {
    int V=5;
    ArrayList<Edge>[] graph=new ArrayList[V];
    createGraph(graph);
    System.out.println(isBipartite(graph));
  }  
}
