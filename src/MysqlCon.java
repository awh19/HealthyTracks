import java.sql.*;

class MysqlCon {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://axxb6a0z2kydkco3.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/nkfszrrxkyw5jypd", "z2hl7aklk6bs8bl0", "d397ug19mkb2lksa");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from tbl_exercises");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}