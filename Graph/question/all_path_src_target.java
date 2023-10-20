package Graph.question;
import java.util.*;

public class all_path_src_target {
    //we need to construct a graph (Array of Arraylist<Edge>)
 


    public static class Edge {

        int src,dest;

        //constructor
        Edge(int src,int dest) {
            this.src= src;
            this.dest= dest;
        }

    } 

    //we do this question with help of modified dfs algo 

    public static void createGraph(ArrayList<Edge> graph[]){
        //as graph constains all null value it needs to intilialized with empty ArrayList<Edge>

        for(int i=0 ;i<graph.length ; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));


        graph[6].add(new Edge(6, 5));
       
    }

    public static void print_paths(ArrayList<Edge> graph[], boolean vis[], int curr , int targ ,String path) {
        //base case 

        if(curr == targ) {
            System.out.println(path);
            return ;
        }
 

        for(int i =0 ; i<graph[curr].size() ; i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false) {
                vis[curr] = true;
                print_paths(graph, vis, e.dest, targ, path+e.dest);
                vis[curr]= false;

            }
        }
        return;

    }
    public static void main (String args[] ) {
        int V= 7; 
        /* 
           1---- 3
         /       | \
        0       |   5 --6
        \      |  /
          2 ---4
           */  
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        boolean vis[] = new boolean[V];
        int src= 0, targ= 5 ;

        print_paths(graph, vis, src, targ,"0");



    }
    
}
