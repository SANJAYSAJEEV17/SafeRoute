import java.sql.Connection;
import java.sql.PreparedStatement;

public class ReportIncident {

    public static void report() {

        try {

            Connection con = DBConnection.getConnection();

            String sql="INSERT INTO incidents(location,incident_type,description,severity,reported_by) VALUES(?,?,?,?,?)";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,"Railway Station");
            ps.setString(2,"Theft");
            ps.setString(3,"Mobile Phone Stolen");
            ps.setInt(4,4);
            ps.setInt(5,1);

            ps.executeUpdate();

            System.out.println("Incident Reported");

            con.close();

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}
