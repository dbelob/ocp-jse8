package acme.enthuware.standard_tests.test5.test65;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example {
    public static void main(String args[]) {
        Connection connection = null;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("select * from STUDENT");) {
            while (rs.next()) {
                //do something with the row
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
