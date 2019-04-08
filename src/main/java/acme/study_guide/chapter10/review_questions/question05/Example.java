package acme.study_guide.chapter10.review_questions.question05;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws SQLException {
        String url = "url";
        String userName = "userName";
        String password = "password";

//        Connection conn = new Connection(url, userName, password);
        Connection conn = DriverManager.getConnection(url, userName, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select count(*) from animal");
        if (rs.next()) System.out.println(rs.getInt(1));
    }
}
