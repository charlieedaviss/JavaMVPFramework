package utilities;

import java.sql.*;

public class DatabaseUtils {
    static String url = ConfigReader.getConfigProperty("db.url");
    static String userName = ConfigReader.getConfigProperty("db.username");
    ;
    static String password = ConfigReader.getConfigProperty("db.password");
    ;
    static Connection con;
    static Statement stmt;
    static ResultSet rs;


    public static void initializeDBProperties()  {

        try {
            //1. Get the connection - One Time Setup activity
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
            // You create the variable of that Interface's Type, and store
            // the instance of the Interface in the variable.
            // And we use the "DriverManager" Class method to reference
            // the static method .getConnection() that returns Connection type
            stmt = con.createStatement();
        } catch (Exception e) {
            // Here we are just printing the exception stack trace if there is one caught
            // It tells w=us what exception is found
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuery(String query) {
        //2. Execute the query - We use this whenever we want to execute the query
        // We have created
        try {
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    //3. Process the result
//        while(rs.next())
//        System.out.println(rs.getString("first_name"));

        public static void closeDataBaseConnection() {
        //4. Close the statement - One Time closing activity
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}


//        ResultSetMetaData rsm = rs.getMetaData();
//        int columnNumber = rsm.getColumnCount();
//
//        while (rs.next()) {
//            System.out.println();
//            for (int i = 1; i < columnNumber; i++) {
//                System.out.print
//                        (rs.getString(i) + "|");
//            }
//            System.out.println();
//        }

//        ResultSetMetaData rsm=rs.getMetaData(); //An object that can be used to get information about the types and properties of the columns in a ResultSet object.
//        int columnNum= rsm.getColumnCount();
//
//
//        rs.next();
//        // Moves the cursor forward one row from its current position. A ResultSet cursor is initially positioned before the first row;
//        // the first call to the method next makes the first row the current row; the second call makes the second row the current row, and so on
//
//        System.out.println(rs.getString("first_name"));

//        while(rs.next()){
//            System.out.print(rs.getString("emp_id")+" ");
//            System.out.print(rs.getString("first_name")+" ");//System.out.println(rs.getString(2)); //2 stands for column number for first name
//            System.out.println(rs.getString("last_name")); //System.out.println(rs.getString(3)); //3 stands for column number for last name
//        }

//        while(rs.next()){
//            for (int i = 1; i <columnNum ; i++) {
//                System.out.print(rs.getString(i)+"|"); //returns everything as a string
//            }
//            System.out.println();
//        }

//        //if we want the result an integer
//        while(rs.next()){
//           System.out.print(rs.getInt("salary")); //returns an integer
//        }

//        //Prints the whole table
//        ResultSetMetaData rsmd = rs.getMetaData();
//        int columnsNumber = rsmd.getColumnCount();
//
//        while(rs.next()){
//            for(int i =1 ; i <= columnsNumber;i++){
//                System.out.print(rs.getString(i)+ " ");
//            }
//            System.out.println();
//        }


//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con=DriverManager.getConnection(url, username, password);
//        Statement statement= con.createStatement();
//        ResultSet rs=statement.executeQuery("Select * FROM bootcamp.employees WHERE first_name='Ali';");
//
//        while (rs.next()){
//            System.out.print(rs.getString("first_name")+" ");
//            System.out.println(rs.getString("last_name"));
//        }
