package acme.study_guide.chapter10.review_questions.question13;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("select count(*) from species");
            int num = stmt.executeUpdate("INSERT INTO species VALUES (3, 'Ant', .05)");
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}
