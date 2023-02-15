import java.util.*;
public class topologicalSortUsingBFS {
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

    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3,1));

    graph[4].add(new Edge(4,0));
    graph[4].add(new Edge(4,1));

    graph[5].add(new Edge(5,0));
    graph[5].add(new Edge(5,2));
}

public static void calcIndeg(ArrayList<Edge>graph[],int indegree[]){
    for(int i=0;i<graph.length;i++){
        int v=i;
        for(int j=0;j<graph[v].size();j++){
            Edge e=graph[v].get(j);
            indegree[e.dest]++;
        }
    }
}

public static void topSort(ArrayList<Edge>graph[]){
   
    int indegree[]=new int[graph.length];

    calcIndeg(graph, indegree);

    Queue<Integer>q=new LinkedList<>();

    for(int i=0;i<indegree.length;i++){
        if(indegree[i]==0){
            q.add(i);
        }
    }

    //bfs
    while(!q.isEmpty()){
        int curr=q.remove();
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            indegree[e.dest]--; //for neighbour
            if(indegree[e.dest]==0){
                q.add(e.dest);
            }
        }
    }
}
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        topSort(graph);

    }
}
