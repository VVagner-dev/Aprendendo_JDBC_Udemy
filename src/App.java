import java.sql.*;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {

        Connection conn = DB.getConnection();
        DB.closeConnection();
        System.out.println("Connected to database");
    }
}
