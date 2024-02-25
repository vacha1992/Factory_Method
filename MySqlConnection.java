/**
 * Este archivo implementa la clase concreta MySqlConnection, 
 * que es otra implementación específica de la interfaz DatabaseConnection.
 * Contiene la lógica de conexión y desconexión para MySQL Database.
 */

package principal;

/**
 *
 * @author Chava
 */

public class MySqlConnection implements DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("Conectado a MySQL Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectado de MySQL Database");
    }
    
}
