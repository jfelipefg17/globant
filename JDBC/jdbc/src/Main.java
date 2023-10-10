import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/jdbc";
        String usuario = "jfelipefg17";
        String contraseña = "1001445250Fg.";

        try {
            // Establecer la conexión a la base de datos
            Connection connection = DriverManager.getConnection(jdbcURL, usuario, contraseña);

            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // Aquí puedes ejecutar consultas SQL y otras operaciones con la base de datos.
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}