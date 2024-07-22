package condc;
public class conductores {
	
    public static void main(String[] args) {
        // Crear una lista de pilotos con sus puntos
        Piloto[] pilotos = {
            new Piloto("Lewis Hamilton", 4658.5),
            new Piloto("Sebastian Vettel", 3098),
            new Piloto("Max Verstappen", 2696.5),
            new Piloto("Fernando Alonso", 2298),
            new Piloto("Kimi Raikkonen", 1873),
            new Piloto("Valtteri Bottas", 1797),
            new Piloto("Nico Rosberg", 1594.5),
            new Piloto("Checo Pérez", 1571),
            new Piloto("Michael Schumacher", 1566),
            new Piloto("Daniel Ricciardo", 1317)
        };

        // Imprimir la lista de pilotos
        System.out.println("Pilotos con más puntos en la historia de la Fórmula 1:");
        for (Piloto piloto : pilotos) {
            System.out.printf("%-20s: %.1f puntos%n", piloto.getNombre(), piloto.getPuntos());
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
