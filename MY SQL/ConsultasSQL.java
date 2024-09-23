import java.sql.*;

public class ConsultasSQL {
    public static void main(String[] args) {




        try {
// Comprobar si se puede cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
// Establecer la conexión
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila", "root","abc123."
            );

///////////////////////////////////////////////////////////////////////////////////////////

// Realizar insert ,delete , update SQL.


            //String sql = "insert into actor(first_name, last_name, last_update) values (\"laureano\",\"De sousa Dias\", now());";

            /*
            String sql1 = "delete from actor where first_name like \"laureano\";";
            PreparedStatement statement1 = connection.prepareStatement(sql1);
            statement1.executeUpdate();
*/







// Consultas SQL.

            System.out.println("Select");
            String sql = "SELECT * FROM actor WHERE first_name=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "PENELOPE");

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
              System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
            }


            resultSet.close();
            statement.close();



////////////////////////////////////////////////////////////////////////////////////////////

// Cerrar recursos

            connection.close();



        }catch(ClassNotFoundException e){
            System.out.println("Error: no se puede cargar el driver JDBC");
            System.out.println(e.getMessage());
        }catch (SQLException e) {
            System.out.println("Error: fallo en el acceso a la BD");
            System.out.println(e.getMessage());
        }
    }
}

