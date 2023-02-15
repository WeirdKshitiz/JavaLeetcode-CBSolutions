import java.util.*;
class pathWithMinimumEffort{
    class Tuple{
        int distance;
        int r;
        int c;
        
        Tuple(int distance,int r,int c){
            this.distance=distance;
            this.r=r;
            this.c=c;
        }
    }
    int MinimumEffort(int heights[][]) {
        PriorityQueue<Tuple> pq=new PriorityQueue<>((x,y) -> x.distance-y.distance);
        
        int n=heights.length;
        int m=heights[0].length;
        
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)(1e9);
            }
        }
        dist[0][0]=0;
        pq.add(new Tuple(0,0,0));
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        
        while(pq.size()!=0){
            Tuple it=pq.remove();
            int diff=it.distance;
            int row=it.r;
            int col=it.c;
            
            if(row==n-1 && col==m-1){
                return diff;
            }
            
            for(int i=0;i<4;i++){
                int nrow=row+dr[i];
                int ncol=col+dc[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                 int newEfforts=Math.max(Math.abs(heights[row][col]-heights[nrow][ncol]),diff);
                 
                 if(newEfforts < dist[nrow][ncol]){
                     dist[nrow][ncol]=newEfforts;
                     pq.add(new Tuple(newEfforts,nrow,ncol));
                 }
                }
            }
        }
        return 0;
    }
}class Solution {
    class Tuple{
        int distance;
        int r;
        int c;
        
        Tuple(int distance,int r,int c){
            this.distance=distance;
            this.r=r;
            this.c=c;
        }
    }
    int MinimumEffort(int heights[][]) {
        PriorityQueue<Tuple> pq=new PriorityQueue<>((x,y) -> x.distance-y.distance);
        
        int n=heights.length;
        int m=heights[0].length;
        
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)(1e9);
            }
        }
        dist[0][0]=0;
        pq.add(new Tuple(0,0,0));
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        
        while(pq.size()!=0){
            Tuple it=pq.remove();
            int diff=it.distance;
            int row=it.r;
            int col=it.c;
            
            if(row==n-1 && col==m-1){
                return diff;
            }
            
            for(int i=0;i<4;i++){
                int nrow=row+dr[i];
                int ncol=col+dc[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                 int newEfforts=Math.max(Math.abs(heights[row][col]-heights[nrow][ncol]),diff);
                 
                 if(newEfforts < dist[nrow][ncol]){
                     dist[nrow][ncol]=newEfforts;
                     pq.add(new Tuple(newEfforts,nrow,ncol));
                 }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int heights[][]={{1,2,2},{3,8,2},{5,3,5}};
        MinimumEffort(heights);
    }
}