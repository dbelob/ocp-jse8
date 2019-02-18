package acme.study_guide.chapter06.rethrowing_exceptions;

import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class Example {
    public static void main(String[] args) {
        //...
    }

    public void parseData() throws SQLException, DateTimeParseException {
    }

    public void multiCatch() throws SQLException, DateTimeParseException {
        try {
            parseData();
        } catch (SQLException | DateTimeParseException e) {
            System.err.println(e);
            throw e;
        }
    }

    public void rethrowing() throws SQLException, DateTimeParseException {
        try {
            parseData();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }
    }
}
