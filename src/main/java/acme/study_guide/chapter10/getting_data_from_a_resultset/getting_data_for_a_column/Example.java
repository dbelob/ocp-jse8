package acme.study_guide.chapter10.getting_data_from_a_resultset.getting_data_for_a_column;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs.next()) {
            java.sql.Date sqlDate = rs.getDate(1);
            LocalDate localDate = sqlDate.toLocalDate();
            System.out.println(localDate); // 2001―05―06
        }

        rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs.next()) {
            java.sql.Time sqlTime = rs.getTime(1);
            LocalTime localTime = sqlTime.toLocalTime();
            System.out.println(localTime); // 02:15
        }

        rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
        if (rs.next()) {
            java.sql.Timestamp sqlTimeStamp = rs.getTimestamp(1);
            LocalDateTime localDateTime = sqlTimeStamp.toLocalDateTime();
            System.out.println(localDateTime); // 2001―05―06T02:15
        }

        rs = stmt.executeQuery("select id, name from species");
        while (rs.next()) {
            Object idField = rs.getObject("id");
            Object nameField = rs.getObject("name");
            if (idField instanceof Integer) {
                int id = (Integer) idField;
                System.out.println(id);
            }
            if (nameField instanceof String) {
                String name = (String) nameField;
                System.out.println(name);
            }
        }
    }
}
