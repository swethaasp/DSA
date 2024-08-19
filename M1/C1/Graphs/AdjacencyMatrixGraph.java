package com.packt.datastructuresandalg.lesson6.graph;

public class AdjacencyMatrixGraph {
    int[][] adj;  //2 d array

    public AdjacencyMatrixGraph(int nodes) {
        this.adj = new int[nodes][nodes];  //int[6][6]
    }

    public void addEdge(int u, int v) {
        this.adj[u][v] = 1;  //adj[0][1]=1  adj[0][3]=1   adj[1][4]=1 adj[2][4]=1 adj[2][5]=1  adj[3][1]=1 adj[4][3]=1 adj[5][5]=1 
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.adj.length; i++) {
            res += (i + ":");
            for (int j = 0; j < this.adj[i].length; j++)
                res += (" " + adj[i][j]);
            if (i + 1 < adj.length)
                res += "\n";
        }
        return res;
    }

    public static void main(String [] args) {
        AdjacencyMatrixGraph g = new AdjacencyMatrixGraph(6);
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

//The adjacency matrix would look like this:
  0  1  2  3  4  5
0[0, 1, 0, 1, 0, 0] 
1[0, 0, 0, 0, 1, 0]
2[0, 0, 0, 0, 1, 1]
3[0, 1, 0, 0, 0, 0]
4[0, 0, 0, 1, 0, 0]
5[0, 0, 0, 0, 0, 1]


 //Output:
//The toString() method will produce the following output:

0: 0 1 0 1 0 0
1: 0 0 0 0 1 0
2: 0 0 0 0 1 1
3: 0 1 0 0 0 0
4: 0 0 0 1 0 0
5: 0 0 0 0 0 1
