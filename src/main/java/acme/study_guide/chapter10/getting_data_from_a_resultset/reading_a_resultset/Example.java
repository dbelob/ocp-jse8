package acme.study_guide.chapter10.getting_data_from_a_resultset.reading_a_resultset;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();

        Map<Integer, String> idToNameMap = new HashMap<>();
        ResultSet rs = stmt.executeQuery("select id, name from species");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            idToNameMap.put(id, name);
        }
        System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}
    }
}
