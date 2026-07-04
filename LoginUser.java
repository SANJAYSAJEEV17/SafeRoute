import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginUser {

    public static void login() {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM users WHERE email=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,"bhagya@gmail.com");
            ps.setString(2,"12345");

            ResultSet rs = ps.executeQuery();

            if(rs.next()){

                System.out.println("Login Successful");

            }else{

                System.out.println("Invalid Login");

            }

            con.close();

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}
