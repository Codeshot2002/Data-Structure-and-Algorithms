package com.company.dsa.database_Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class data{
    int Sno;
    String name;
    int Systemid;

    public data(int sno, String name, int systemid) {
        this.Sno = sno;
        this.name = name;
        this.Systemid = systemid;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSystemid() {
        return Systemid;
    }

    public void setSystemid(int systemid) {
        Systemid = systemid;
    }
    @Override
    public String toString(){
        return "Sno : " + Sno + "\nName : " + name + "\n System id :" + Systemid;
    }
}

public class insert_query {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        String name = "";
        int sysid = 0;

        List<data> myfile = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection (
                    "jdbc:mysql://localhost:3306/employees"
                    ,"root"
                    ,"root"
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while(true){
                System.out.println("Type 1 to enter the data in the sql \nType 2 print the data of the table \nType 3 to stop the program");
                int start = sc.nextInt();
                if(start == 1){
                    System.out.print("Sno : ");
                    index = sc.nextInt();
                    System.out.print("Name : ");
                    name = sc.next();
                    System.out.println("System id : ");
                    sysid = sc.nextInt();

                    String sql = "insert into student values (" + index + "," + "'" + name + "'" + "," + sysid+")";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.execute();
                }
                else if(start == 2){
                    System.out.println("-------------- Student table ------------");
                    while(resultSet.next()){
                        System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                        //+ " " + resultSet.getInt(4));
                        data data2 = new data(resultSet.getInt(resultSet.getInt(1)
                        ), resultSet.getString(2), resultSet.getInt(3));
                        myfile.add(data2);
                    }
                }
                else {
                    break;
                }
            }
        } catch (Exception e) {

        }
    }
}
