package Graph.adjacency_list;

import java.util.*;

public class nonWeightedUndirectedGraph {

  // undirected

  // __________________________________________________

  public static class Edge {
    int src, dest;

    // constructor of edge
    Edge(int source, int destination) {

      this.src = source;
      this.dest = destination;

    }

  }

  // ___________________________________________________

  // To create graph
  public static void addEdge(ArrayList<Edge> graph[], int src, int dest) {
    graph[src].add(new Edge(src, dest));

  }

  public static void CreatGraph(ArrayList<Edge> graph[]) {
    // as array ((graph[])contains all null values

    // array(graph[]) need to initialize with empty edges

    for (int i = 0; i < graph.length; i++) {

      graph[i] = new ArrayList<Edge>();

    }

    addEdge(graph, 0, 1);
    addEdge(graph, 0, 2);

    addEdge(graph, 1, 0);
    addEdge(graph, 1, 3);

    addEdge(graph, 2, 0);
    addEdge(graph, 2, 4);

    addEdge(graph, 3, 1);
    addEdge(graph, 3, 4);
    addEdge(graph, 3, 5);

    addEdge(graph, 4, 2);
    addEdge(graph, 4, 3);
    addEdge(graph, 4, 5);

    addEdge(graph, 5, 3);
    addEdge(graph, 5, 4);
    addEdge(graph, 5, 6);

  }

  public static void bfs(ArrayList<Edge> graph[],boolean visited[],int start) {

    Queue<Integer> q = new LinkedList<>();

  
    q.add(start);

    while (q.size() != 0) {

      int curr = q.remove();

      if (visited[curr] == false) {

        // print the current element in graph
        System.out.print(curr + " ");

        // to check visted node should not be printed again
        visited[curr] = true;

        // to find all the destination of curr vertex then add in queue
        for (int i = 0; i < graph[curr].size(); i++) {

          Edge e = graph[curr].get(i);
          q.add(e.dest);

        }

      }

    }

  }

  public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
    System.out.print(curr + " ");
    vis[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {

      Edge e = graph[curr].get(i);
      //base case
      if (vis[e.dest] == false)
        dfs(graph, e.dest, vis);

    }

  }

  public static void main(String args[]) {
    // no of vertix
    int V = 7;
    @SuppressWarnings("unchecked")
    ArrayList<Edge> graph[] = new ArrayList[V];


     

    CreatGraph(graph);
    boolean vis[] = new boolean[V]; 

    

  


    //for non-connected graphs
    for(int i=0; i<V ;i++) {
      if(vis[i]==false) {
        bfs(graph,vis,i);
      }
    }


    System.out.println();

    boolean vis1[] = new boolean[V];


    //for non-connected graphs
    for(int i=0; i< V ; i++) { 
      if(vis1[i]==false) {
        dfs(graph, i, vis1);
      } 

    }

    System.out.println();


  }
}