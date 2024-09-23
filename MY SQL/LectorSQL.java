import java.sql.*;

public class LectorSQL {
    // Este código se conecta a la BD sakila incluida en los ejemplos de MySQL
// Muestra en pantalla los campos actor_id y firts_name de la tabla actors
// No olvides modificar en el código los valores de usuario y contraseña
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/sakila";
            String usuario = "root", password = "abc123.";
            try {
// Comprobar si se puede cargar el driver JDBC
                Class.forName("com.mysql.cj.jdbc.Driver");
// Establecer la conexión
                Connection connection = DriverManager.getConnection(
                        url, usuario,password
                );


///////////////////////////////////////////////////////////////////////////////////////////

/*

// Crear la sentencia LectorSQL
                String sql = "SELECT * FROM actor";
// Ejecutar la consulta
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
// Recorrer el resultado y mostrar los datos
                while (resultSet.next()) {
// Obtener valores de las columnas
                    int id = resultSet.getInt("actor_id");
                    String nombre = resultSet.getString("first_name");
// Mostrar los valores en pantalla
                    System.out.println("ID: " + id + ", Nombre: " + nombre);
}


 */
/*

                // Crear la sentencia SQL
                //String sql = "SELECT * FROM actor WHERE actor_id=5 OR last_update='2006-02-15 04:34:33'";

                //Error de cambio por integridad
                //String sql = "update actor set last_name='Apellido de thora' WHERE first_name='THORA'";

                //Regresa informacion
                //String sql = "SELECT * FROM actor WHERE actor_id=200;";

                //Error por integridad
                //String sql = "delete from film_actor where actor_id = 200;";

                //Error de integridad
                String sql = "delete from actor where actor_id = 200;";





                // Ejecutar la consulta
                    Statement statement = connection.createStatement();

                //Resultados que regresa
                    ResultSet resultSet = statement.executeQuery(sql);

                //Recorremnos la sentencia
                    while (resultSet.next()){
                        System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
                    }



 */
// Realizar insert ,delete , update.

                //String sql = "insert into actor(first_name, last_name, last_update) values (\"laureano\",\"De sousa Dias\", now());";
                String sql = "delete from actor where first_name like \"laureano\";";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.executeUpdate();

// Crear la sentencia SQL
                //String sql = "SELECT * FROM actor WHERE first_name=?";
// Ejecutar una consulta
                //PreparedStatement statement = connection.prepareStatement(sql);
                //statement.setString(1, "PENELOPE");

                //ResultSet resultSet = statement.executeQuery();
                //while (resultSet.next()){
                  //  System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
                //}






////////////////////////////////////////////////////////////////////////////////////////////

// Cerrar recursos
                //resultSet.close();
                statement.close();
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

