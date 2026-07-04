import java.sql.*;

public class ViewSafeZones {

    public static void display() {

        try {

            Connection con=DBConnection.getConnection();

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("SELECT * FROM safe_zones");

            while(rs.next()){

                System.out.println(
                        rs.getInt("zone_id")+" "+
                        rs.getString("zone_name")+" "+
                        rs.getString("zone_type"));

            }

            con.close();

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}
