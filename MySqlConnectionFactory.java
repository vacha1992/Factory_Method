/*
 * Este archivo implementa la clase concreta MySqlConnectionFactory, 
 * que es otra implementación específica de la interfaz DatabaseConnectionFactory. 
 * Contiene la lógica para crear instancias de MySqlConnection.
 */
package principal;

/**
 *
 * @author Chava
 */
public class MySqlConnectionFactory implements DatabaseConnectionFactory{

    @Override
    public DatabaseConnection createConnection() {
        return new MySqlConnection();
    }
    
}
