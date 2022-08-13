package com.company.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;

class GraphNode2{
    public String name;
    int index;
    public boolean isVisited = false;

    ArrayList<GraphNode2> neighbor = new ArrayList<>();
    public GraphNode2(String name, int index){
        this.name = name;
        this.index = index;
    }
}

class Graph2{
    ArrayList<GraphNode2> nodelist = new ArrayList<>();
    public Graph2(ArrayList<GraphNode2> nodelist){
        this.nodelist = nodelist;
    }


    public void addUndirectedEdge(int i,int j){
        GraphNode2 first = nodelist.get(i);
        GraphNode2 second = nodelist.get(j);
        first.neighbor.add(second);
        second.neighbor.add(first);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<nodelist.size();i++){
            s.append(nodelist.get(i).name + ": ");
            for(int j = 0; j<nodelist.get(i).neighbor.size();j++){
                if(j == nodelist.get(i).neighbor.size() -1){
                    s.append(nodelist.get(i).neighbor.get(j).name);
                }
                else{
                    s.append((nodelist.get(i).neighbor.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
    public void bfsVisit(GraphNode2 node){
        LinkedList<GraphNode2> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode2 current = queue.remove(0);
            current.isVisited = true;
            System.out.print(current.name + " ");
            for(GraphNode2 neigbor : current.neighbor){
                if(!neigbor.isVisited){
                    queue.add(neigbor);
                    neigbor.isVisited = true;
                }
            }
        }
    }
    public void BFS() {
        for (GraphNode2 node : nodelist) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }
}

public class adjacency_list {
    public static void main(String[] args) {
        ArrayList<GraphNode2> nodelist = new ArrayList<>();
        nodelist.add(new GraphNode2("A", 0));
        nodelist.add(new GraphNode2("B", 1));
        nodelist.add(new GraphNode2("C", 2));
        nodelist.add(new GraphNode2("D", 3));

        Graph2 mygraph = new Graph2(nodelist);
        mygraph.addUndirectedEdge(0,1);
        mygraph.addUndirectedEdge(0,2);
        mygraph.addUndirectedEdge(2,1);
        mygraph.addUndirectedEdge(3,0);

        mygraph.BFS();
    }
}
