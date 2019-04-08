package acme.study_guide.chapter10.review_questions.question16;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws SQLException {
        String sql = "select name from animal";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            rs.next();
            rs.previous();
            rs.previous();
            rs.next();
            rs.next();
            rs.absolute(2);
            System.out.println(rs.getString(1));
        }
    }
}
