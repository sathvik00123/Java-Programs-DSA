//  import java.beans.Statement;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
import java.sql.*;
class JdbcDemo {
    public static void main(String args[]) throws ClassNotFoundException{
        

        int rolNum = 1;
        String stName = "jane";
        int stAge = 15;
        String sql = "insert into demotable(rollno,name,age) values("+rolNum+",'"+stName+"',"+stAge+")";
        String sql1 = "delete from demotable where rollno = 1";
        try{
            String url = "jdbc:mysql://localhost:3306/demo";
            Connection conn = DriverManager.getConnection(url,"root","Sathvik@mysql*18");
            Class.forName("com.mysql.cj.jdbc.Driver");
            

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if(m==1){
                System.out.println("Inserted successfully : "+sql);
            }
            else{
                System.out.println("Insertion Failed");
            }
            ResultSet rs=st.executeQuery("select * from demotable");
            System.out.println(rs);
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        }
        catch(SQLException s){
            System.out.println(s);
        }
        // finally{
        //     // conn.close();
        // }
    }
}
