package com.packt.datastructuresandalg.lesson6.graph;

import java.util.ArrayList;

public class AdjacencyListGraph {
    ArrayList<Integer>[] adj;

    public AdjacencyListGraph(int nodes) {
        this.adj = new ArrayList[nodes];
        for (int i = 0; i < nodes; i++)
            this.adj[i] = new ArrayList<>();  //0-new arraylist created 1-> new arraylist created   2-> new arraylist created .....
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);   //adj[u].add(v)---adj[0].add(0)---adj[0].add(1)
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < adj.length; i++) {  //0  to 5
            res += (i + ":");   //0:   1:
            for (int j = 0; j < adj[i].size(); j++)   //0.size()-2
                res += (" " + adj[i].get(j));   //1 3 
            if (i + 1 < adj.length)  //nextline
                res += "\n";
        }
        return res;
    }

    public static void main(String [] args) {
        AdjacencyListGraph g = new AdjacencyListGraph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 1);
        g.addEdge(4, 3);
        g.addEdge(5, 5);
        System.out.println(g);
    }
}

The graph can be visualized as follows:
0 -> 1, 3
1 -> 4
2 -> 4, 5
3 -> 1
4 -> 3
5 -> 5


//output
/*
0: 1 3
1: 4
2: 4 5
3: 1
4: 3
5: 5
*/
