/**
 * Este archivo contiene el programa principal (main method) donde se ejemplifica el uso del patrón Factory Method. 
 * Se crean instancias de fábricas para Oracle y MySQL, y se utilizan para obtener conexiones a las respectivas bases de datos.
 */

package principal;

/**
 *
 * @author Chava
 */

public class Main {
    public static void main(String[] args) {
        // Utilizando el Factory Method para obtener una conexión a Oracle
        DatabaseConnectionFactory oracleFactory = new OracleConnectionFactory();
        DatabaseConnection oracleConnection = oracleFactory.createConnection();
        oracleConnection.connect();
        // ... trabajar con la conexión a Oracle
        oracleConnection.disconnect();

        // Utilizando el Factory Method para obtener una conexión a MySQL
        DatabaseConnectionFactory mysqlFactory = new MySqlConnectionFactory();
        DatabaseConnection mysqlConnection = mysqlFactory.createConnection();
        mysqlConnection.connect();
        // ... trabajar con la conexión a MySQL
        mysqlConnection.disconnect();
        }
}
