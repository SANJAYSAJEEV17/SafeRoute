import java.sql.*;

public class ViewRoutes {

    public static void display() {

        try{

            Connection con=DBConnection.getConnection();

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("SELECT * FROM routes");

            while(rs.next()){

                System.out.println(

                        rs.getInt("route_id")+" "+
                        rs.getString("start_location")+" -> "+
                        rs.getString("destination")+
                        " Score:"+rs.getDouble("safety_score")

                );

            }

            con.close();

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}
