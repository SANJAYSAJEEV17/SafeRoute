import java.sql.Connection;
import java.sql.PreparedStatement;

class RegisterUser {

    public static void registerUser() {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name,email,password,phone) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Sanjay");
            ps.setString(2, "sanjay@gmail.com");
            ps.setString(3, "12345");
            ps.setString(4, "9876543210");

            ps.executeUpdate();

            System.out.println("User Registered Successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
