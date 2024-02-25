/**
 * Este archivo define la interfaz DatabaseConnection, que actúa como la interfaz común para las conexiones a bases de datos. 
 * Contiene métodos connect y disconnect que deben ser implementados por las clases concretas.
 */
package principal;

/**
 *
 * @author Chava
 */

public interface DatabaseConnection {
    void connect();
    void disconnect();
}
