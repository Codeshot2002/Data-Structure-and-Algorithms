package com.company.dsa.database_Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class database_file{
    int id;
    String f_name;
    String l_name;
    int salary;

    public database_file(int id, String f_name, String l_name, int salary) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "ID : " + id + "\nFirst Name : " + f_name +"\nLast name : " + l_name + "\nSalary : " + salary;
    }
}
public class test {
    public static void main(String[] args) {
        List<database_file> myfile = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select *from employees");
            while(resultSet.next()){
                //System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3)
                //+ " " + resultSet.getInt(4));
                database_file data = new database_file(resultSet.getInt(1)
                        ,resultSet.getString(2)
                        ,resultSet.getString(3)
                        ,resultSet.getInt(4));
                myfile.add(data);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        for(database_file a : myfile){
            System.out.println(a);
            System.out.println("----------");
        }
    }

}
