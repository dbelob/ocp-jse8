package acme.study_guide.chapter10.getting_data_from_a_resultset.scrolling_resultset;

import java.sql.*;

public class Example {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("select id from species order by id");
        rs.afterLast();
        System.out.println(rs.previous()); // true
        System.out.println(rs.getInt(1)); // 2
        System.out.println(rs.previous()); // true
        System.out.println(rs.getInt(1)); // 1
        System.out.println(rs.last()); // true
        System.out.println(rs.getInt(1)); // 2
        System.out.println(rs.first()); // true
        System.out.println(rs.getInt(1)); // 1
        rs.beforeFirst();
        System.out.println(rs.getInt(1)); // throws SQLException
    }
}
