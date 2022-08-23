package com.company.dsa.graph.topologicalSort;

import java.util.ArrayList;
import java.util.Stack;

class GraphNode{
    public String name;
    int index;
    public boolean isVisited = false;

    ArrayList<GraphNode> neighbor = new ArrayList<>();
    public GraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}

class Graph {
    ArrayList<GraphNode> nodelist = new ArrayList<>();
    public Graph(ArrayList<GraphNode> nodelist) {
        this.nodelist = nodelist;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodelist.get(i);
        GraphNode second = nodelist.get(j);
        first.neighbor.add(second);
        second.neighbor.add(first);
    }

    public void addDirectedEdge(int i, int j){
        GraphNode first = nodelist.get(i);
        GraphNode second = nodelist.get(j);
        first.neighbor.add(second);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodelist.size(); i++) {
            s.append(nodelist.get(i).name + ": ");
            for (int j = 0; j < nodelist.get(i).neighbor.size(); j++) {
                if (j == nodelist.get(i).neighbor.size() - 1) {
                    s.append(nodelist.get(i).neighbor.get(j).name);
                } else {
                    s.append((nodelist.get(i).neighbor.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    //---------TOPOLOGICAL SORT---------
    void topologicalVisit(GraphNode node, Stack<GraphNode> stack){
        for(GraphNode neighbor : node.neighbor){
            if(!neighbor.isVisited){
                topologicalVisit(neighbor,stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }
    void topologicalSort(){
        Stack<GraphNode> stack = new Stack<>();
        for(GraphNode node:nodelist){
            if(!node.isVisited){
                topologicalVisit(node,stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().name + " ");
        }
    }
}
public class topological_sort {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();
        nodelist.add(new GraphNode("A",0));
        nodelist.add(new GraphNode("B",1));
        nodelist.add(new GraphNode("C",2));
        nodelist.add(new GraphNode("D",3));
        nodelist.add(new GraphNode("E",4));
        nodelist.add(new GraphNode("F",5));
        nodelist.add(new GraphNode("G",6));
        nodelist.add(new GraphNode("H",7));

        Graph mygraph = new Graph(nodelist);
        mygraph.addDirectedEdge(0,2);
        mygraph.addDirectedEdge(2,4);
        mygraph.addDirectedEdge(4,7);
        mygraph.addDirectedEdge(4,5);
        mygraph.addDirectedEdge(5,6);
        mygraph.addDirectedEdge(1,2);
        mygraph.addDirectedEdge(1,3);
        mygraph.addDirectedEdge(3,5);

        System.out.println(mygraph.toString());
        mygraph.topologicalSort();
    }
}

