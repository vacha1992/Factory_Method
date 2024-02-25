/**
 * Este archivo define la interfaz DatabaseConnectionFactory, 
 * que actúa como la interfaz común para las fábricas de conexiones a bases de datos.
 * Contiene el Factory Method createConnection, que debe ser implementado por las clases concretas de fábrica.
 */

package principal;

/**
 *
 * @author Chava
 */

public interface DatabaseConnectionFactory {
    DatabaseConnection createConnection();
}
