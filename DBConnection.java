import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/saferoute";

    private static final String USER = "sanjay";
    private static final String PASSWORD = "sanjay";

    public static Connection getConnection() {

        try {

            Class.forName("org.postgresql.Driver");

            Connection con =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Connected Successfully!");

            return con;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }
}
