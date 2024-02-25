/**
 * Este archivo implementa la clase concreta OracleConnectionFactory, 
 * que es una implementación específica de la interfaz DatabaseConnectionFactory.
 * Contiene la lógica para crear instancias de OracleConnection.
 */

package principal;

/**
 *
 * @author Chava
 */

public class OracleConnectionFactory implements DatabaseConnectionFactory{

    @Override
    public DatabaseConnection createConnection() {
        return new OracleConnection();
    }
    
}
