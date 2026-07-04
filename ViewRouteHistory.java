import java.sql.*;

public class ViewRouteHistory {

    public static void display() {

        try{

            Connection con=DBConnection.getConnection();

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("SELECT * FROM route_history");

            while(rs.next()){

                System.out.println(

                        rs.getInt("history_id")+
                        " User:"+rs.getInt("user_id")+
                        " Route:"+rs.getInt("route_id")

                );

            }

            con.close();

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}
