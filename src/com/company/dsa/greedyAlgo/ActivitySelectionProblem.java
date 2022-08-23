package com.company.dsa.greedyAlgo;

import javax.accessibility.AccessibleIcon;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Activity{
    private String name;
    private int startTime;
    private int finishTime;

    public Activity(String name, int startTime, int finishTime){
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
    @Override
    public String toString(){
        return "Activity : " + name +" , startTime = " + startTime + ", endTime = " + finishTime;
    }
}
public class ActivitySelectionProblem {
    static void activitySelection(ArrayList<Activity> activityList){
        Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getFinishTime() - o2.getFinishTime();
            }
        };
        Collections.sort(activityList,finishTimeComparator);
        Activity previousActivity = activityList.get(0);
        System.out.println("\n\nRecommended Schedule : \n" + activityList.get(0));

        for(int i=1;i<activityList.size();i++){
            Activity activity = activityList.get(i);
            if(activity.getStartTime()>=previousActivity.getFinishTime()){
                System.out.println(activity);
                previousActivity = activity;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Activity> activities = new ArrayList<>();
        activities.add(new Activity("A1",0,6));
        activities.add(new Activity("A2",3,4));
        activities.add(new Activity("A3",1,2));
        activities.add(new Activity("A4",5,8));
        activities.add(new Activity("A5",5,7));
        activities.add(new Activity("A6",8,9));

        activitySelection(activities);
    }
}
