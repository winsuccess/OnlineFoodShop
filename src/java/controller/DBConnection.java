package controller;

import java.sql.*;
import java.util.*;


public class DBConnection {

static Connection con;
static String connectionURL;
static String url;

public static Connection getConnection()
{

try
{

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=FoodStore;user=winsuccess;password=thang2101";
try
{            	
con = DriverManager.getConnection(connectionURL); 
// assuming your SQL Server's	username is "username"               
// and password is "password"
}

catch (SQLException ex)
{
ex.printStackTrace();
}
}

catch(ClassNotFoundException e)
{
System.out.println(e);
}

return con;
}
}
