package com.company.dsa.greedyAlgo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class items{
    int weight;
    int value;
    int index;
    double ratio;

    public items(int index, int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.index = index;
        this.ratio = value*1.0 / weight;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return "Item index = " + index + ", value = " + value + ", weight = " + weight;
    }
}
public class Knapsack_problem {
    public static void knapsack(ArrayList<items> itemsArrayList, int boxWeight){
        Comparator<items> comparator = new Comparator<items>() {
            @Override
            public int compare(items o1, items o2) {
                if(o2.getRatio() > o1.getRatio()){
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(itemsArrayList,comparator);
        int usedCapacity = 0;
        double totalValue = 0;
        for(items item : itemsArrayList){
            if(usedCapacity + item.getWeight() <= boxWeight){
                usedCapacity += item.getWeight();
                System.out.println("Taken : " + item);
                totalValue += item.getValue();
            }else{
                int usedWeight = boxWeight - usedCapacity;
                double value = item.getRatio() * usedWeight;
                System.out.println("Taken : item index = " + item.getIndex() + ", obtained value : " + value + ", used weight = "
                + usedWeight + ",ratio = " + item.getRatio());
                usedCapacity += usedWeight;
                totalValue += value;
                if(usedCapacity == boxWeight){
                    break;
                }
            }
            System.out.println("\n Total value Obtained : " + totalValue);
        }
    }
    public static void main(String[] args) {
        ArrayList<items> item = new ArrayList<>();
        item.add(new items(1,20,100));
        item.add(new  items(2,30,120));
        item.add(new  items(3,10,60));
        int box = 50;

        knapsack(item,box);
    }
}
