package acme.tests.chapter21.test37;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:precipitation";
        String sql = "select count(*) from people";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {
            rs.next();
            rs.absolute(0); // q1
            System.out.print(rs.getInt(1)); // q2
        }
    }
}
