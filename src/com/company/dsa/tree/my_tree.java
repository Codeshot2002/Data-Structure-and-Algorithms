package com.company.dsa.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

class treeNode{
    String data;
    ArrayList<treeNode> children;

    public treeNode(String data){
        this.data = data;
        this.children = new ArrayList<treeNode>();
    }
    public void addChild(treeNode node){
        this.children.add(node);
    }
    public String print(int level){
        String ret;
        ret = "    ".repeat(level) +  data + "\n";
        for(treeNode node : this.children){
            ret += node.print(level + 1);
        }
        return ret;
    }
}
public class my_tree {
    public static void main(String[] args) {
        treeNode human = new treeNode("Human");
        treeNode boy = new treeNode("boy");
        treeNode girl = new treeNode("girl");
        treeNode teen = new treeNode("teen");
        treeNode adult = new treeNode("adult");

        human.addChild(boy);
        human.addChild(girl);
        boy.addChild(teen);
        boy.addChild(adult);
        girl.addChild(teen);
        girl.addChild(adult);

        System.out.println(human.print(0));
    }
}
