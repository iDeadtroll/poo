/*  
Esta es una pequeña aplicación que muestra cómo obtener los  
datos de una tabla usando una consulta SELECT. Se ejecuta   
desde la línea de comandos del sistema operativo y los datos  
obtenidos son mostrados en la consola.  
*/  
 
import java.sql.*;  
 
public class MostrarMiniAgenda  
{  
   static String login = "root";  
   static String password = "";  
   static String url = "jdbc:mysql://localhost/MiniAgenda?serverTimezone=UTC";  
 
   public static void main(String[] args) throws Exception  
   {  
      Connection conn = null;  
      try  
      {  
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
         conn = DriverManager.getConnection(url,login,password);  
 
         if (conn != null)  
         {  
            Statement stmt = conn.createStatement();  
            ResultSet res  = stmt.executeQuery("SELECT * FROM contactos");  
 
            System.out.println("\nNOMBRE \t\t EMAIL \t\t\t TELEFONO \n");  
 
            while(res.next())  
            {  
               String nombre  = res.getString("nombre");  
               String email   = res.getString("email");  
               String telefono= res.getString("telefono");  
 
               System.out.println(nombre +" \t "+email+" \t "+telefono);  
            }  
 
            res.close();  
            stmt.close();  
            conn.close();  
         }  
       }  
       catch(SQLException | ClassNotFoundException ex)  
       {  
          System.out.println(ex);  
       }  
   }  
} 