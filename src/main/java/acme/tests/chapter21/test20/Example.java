package acme.tests.chapter21.test20;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:precipitation";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(
                     "select total from precip where type = 'rain'")) {
            if (rs.next()) {
                System.out.println(rs.getString("total"));
            }
        }
    }
}
