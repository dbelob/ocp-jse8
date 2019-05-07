package acme.tests.chapter21.test25;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:precipitation";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_READ_ONLY)) {
            ResultSet rs = stmt.executeQuery("select * from pens");
            rs.afterLast();
            rs.previous();
            rs.updateInt(2, 10);
            rs.updateRow();
            rs = stmt.executeQuery("select * from pens where color = 'red'");
            while (rs.next())
                System.out.println(rs.getInt(2));
        }
    }
}
