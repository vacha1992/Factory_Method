/*
 * Este archivo implementa la clase concreta OracleConnection, 
 * que es una implementación específica de la interfaz DatabaseConnection. 
 * Contiene la lógica de conexión y desconexión para Oracle Database.
 */
package principal;

/**
 *
 * @author Chava
 */
public class OracleConnection implements DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("Conectado a Oracle Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectado de Oracle Database");
    }
    
}
