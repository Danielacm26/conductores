# Pilotos de Fórmula 1 con Más Puntos

Este proyecto es una aplicación Java que se conecta a una base de datos PostgreSQL para recuperar y mostrar una lista de pilotos de Fórmula 1 con sus respectivos puntos.

## Requisitos
- Java: Asegúrate de tener Java JDK instalado en tu sistema.
- PostgreSQL: Necesitas tener PostgreSQL instalado y en funcionamiento.

## Explicación del Código
- Conexión a la Base de Datos:
El programa establece una conexión a la base de datos utilizando DriverManager.getConnection().

###Consulta SQL:
Se ejecuta una consulta SQL para obtener los nombres y puntos de los pilotos desde la tabla pilotos.

Asegúrate de que los nombres de las columnas en la consulta coincidan exactamente con los nombres en tu base de datos.
Personaliza la consulta y la salida según sea necesario para adaptarse a tus requisitos específicos.


## codigo

package condc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conductores {
    public static void main(String[] args) {
        // Datos de conexión a la base de datos
        String url = "jdbc:postgresql://localhost:5432/f1db";
        String user = "daniela26";
        String password = "tu_contraseña";

        try {
            // Establecer la conexión
            Connection conn = DriverManager.getConnection(url, user, password);

            // Crear una declaración
            Statement stmt = conn.createStatement();

            // Ejecutar la consulta
            String query = "SELECT nombre, puntos FROM pilotos";
            ResultSet rs = stmt.executeQuery(query);

            // Imprimir la lista de pilotos
            System.out.println("Pilotos con más puntos en la historia de la Fórmula 1:");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double puntos = rs.getDouble("puntos");
                System.out.printf("%-20s: %.1f puntos%n", nombre, puntos);
            }

            // Cerrar la conexión
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Piloto {
    private String nombre;
    private double puntos;

    public Piloto(String nombre, double puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPuntos() {
        return puntos;
    }
}
## Resultado esperado:

El programa se conectará a la base de datos PostgreSQL, recuperará la lista de pilotos y sus puntos, y los mostrará en la consola:

Pilotos con más puntos en la historia de la Fórmula 1:
Lewis Hamilton       : 4658.5 puntos
Sebastian Vettel     : 3098.0 puntos
Max Verstappen       : 2696.5 puntos
Fernando Alonso      : 2298.0 puntos
Kimi Raikkonen       : 1873.0 puntos
Valtteri Bottas      : 1797.0 puntos
Nico Rosberg         : 1594.5 puntos
Checo Pérez          : 1571.0 puntos
Michael Schumacher   : 1566.0 puntos
Daniel Ricciardo     : 1317.0 puntos


## Ejecucion
[![Whats-App-Image-2024-07-22-at-12-20-53-PM.jpg](https://i.postimg.cc/6QHs086x/Whats-App-Image-2024-07-22-at-12-20-53-PM.jpg)](https://postimg.cc/KKgscvg0)

