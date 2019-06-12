package acme.enthuware.standard_tests.test5.test10;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws SQLException {
//        Statement stmt = null;
        Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
        try (Statement stmt = c.createStatement();) {
            ResultSet rs = stmt.executeQuery("select * from STUDENT");
            while (rs.next()) {
                System.out.println(rs.getString(0));
            }
        } catch (SQLException e) {
            System.out.println("Exception ");
        }
    }
}
