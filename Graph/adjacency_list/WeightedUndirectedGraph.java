
package Graph.adjacency_list;

import java.util.*;

public class WeightedUndirectedGraph {

  // undirected

  // __________________________________________________

  public static class Edge {
    int src, dest, weight;

    // constructor of edge
    Edge(int source, int destination, int weight) {

      this.src = source;
      this.dest = destination;
      this.weight = weight;

    }

  }

  // ___________________________________________________

  // To create graph

  public static void CreatGraph(ArrayList<Edge> graph[]) {
    // as array ((graph[])contains all null values

    // array(graph[]) need to initialize with empty edges

    for (int i = 0; i < graph.length; i++) {

      graph[i] = new ArrayList<Edge>();

    }

    graph[0].add(new Edge(0, 2, 1));

    graph[1].add(new Edge(1, 2, -1));
    graph[1].add(new Edge(1, 3, 2));

    graph[2].add(new Edge(2, 0, 3));
    graph[2].add(new Edge(2, 1, 3));
    graph[2].add(new Edge(2, 3, 4));

    graph[3].add(new Edge(3, 1, 2));
    graph[3].add(new Edge(3, 1, 2));

  }

  public static void main(String args[]) {
    // no of vertix
    int V = 4;
    @SuppressWarnings("unchecked")
    ArrayList<Edge> graph[] = new ArrayList[V];

    CreatGraph(graph);

    // print 2's neighbour
    for (int i = 0; i < graph[2].size(); i++) {
      Edge e = graph[2].get(i);
      System.out.println("dest-> " + e.dest + " src-> " + e.src + " weight-> " + e.weight);

    }

  }
}