package com.company.dsa.graph;

import java.awt.desktop.AboutHandler;
import java.util.ArrayList;

class GraphNode{
    public String name;
    public int index;
    public boolean isVisited = false;
    public GraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}
class Graph{
    ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();
    public int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodelist){
        this.nodelist = nodelist;
        adjacencyMatrix = new int[nodelist.size()][nodelist.size()];
    }

    public void addUndirectedEdge(int i, int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for(int i=0;i<nodelist.size();i++){
            s.append((nodelist.get(i).name + " "));
        }
        s.append("\n");
        for(int i = 0; i<nodelist.size();i++){
            s.append((nodelist.get(i).name + ": "));
            for(int j: adjacencyMatrix[i]){
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
    //FOR TRAVERSAL
    //get neighbors
    public ArrayList<GraphNode> getNeighbors(GraphNode node){
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for(int i=0;i<adjacencyMatrix.length;i++){
            if(adjacencyMatrix[nodeIndex][i] == 1){
                neighbors.add(nodelist.get(i));
            }
        }
        return neighbors;
    }
}
public class adjacency_matrix {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodelist = new ArrayList<>();
        nodelist.add(new GraphNode("A", 0));
        nodelist.add(new GraphNode("B", 1));
        nodelist.add(new GraphNode("C", 2));
        nodelist.add(new GraphNode("D", 3));

        Graph adjacencyGraph = new Graph(nodelist);
        adjacencyGraph.addUndirectedEdge(0, 1);
        adjacencyGraph.addUndirectedEdge(0, 3);
        adjacencyGraph.addUndirectedEdge(1, 0);
        adjacencyGraph.addUndirectedEdge(1, 2);
        adjacencyGraph.addUndirectedEdge(2, 0);
        adjacencyGraph.addUndirectedEdge(2, 1);
        adjacencyGraph.addUndirectedEdge(3, 0);

        System.out.println(adjacencyGraph.toString());
    }
}
