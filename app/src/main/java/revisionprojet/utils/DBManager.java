package revisionprojet.utils;

import java.sql.*;

public class DBManager {
    public static Connection conn;
    private static String user = "floyojera";
    private static String password = "eRv4b26^k#"; // H3ll0M2I ,auguste

    private static String database = "floyojera_adventure2d"; // rpgbddyoh

    private static String url = "jdbc:mysql://51.68.227.19:3306/" + database;
    private static Connection connection;

    public static void init() {
        try {
            DBManager.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static void close() {
        try {
            DBManager.connection.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static ResultSet execute(String sql) {
        ResultSet test = null;
        try {
            Statement stmt = DBManager.connection.createStatement();
            test = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return test;
    }

    public static int executeUpdate(String sql) {
        int test = -1;
        try {
            Statement stmt = DBManager.connection.createStatement();
            test = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return test;
    }

    public static void setAutoCommit(boolean autocommit) {
        try {
            DBManager.connection.setAutoCommit(autocommit);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static Savepoint setSavePoint() {
        try {
            return DBManager.connection.setSavepoint();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return null;
        }
    }

    public static void rollback(Savepoint save) {
        try {
            DBManager.connection.rollback(save);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}
