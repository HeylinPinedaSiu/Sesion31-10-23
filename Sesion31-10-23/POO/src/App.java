import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        Pelicula endgame = new Pelicula();
        
        //System.out.println("Nombre: " + endgame.mostrarNombre());
        
        endgame.establecerNombre("Avengers: Endgame");
        endgame.establecerDuracion(125);        
        endgame.establecerCalidad("4K");
        endgame.establecerClasificacion("PG-13");
        endgame.establecerGenero("Ciencia ficcion");
        
        System.out.println("Nombre: " + endgame.mostrarNombre());
        System.out.println("Duracion: " + endgame.mostrarDuracion() + " minutos.");
        System.out.println("Calidad: " + endgame.mostrarCalidad());
        System.out.println("Clasificacion: " + endgame.mostrarClasificacion());
        System.out.println("Genero: " + endgame.mostrarGenero());
        System.out.println("*********************************");
        
        Pelicula justiceleague = new Pelicula("Justice League", 240, "Ciencia ficcion", "8K", "R");
        System.out.println("Nombre:" + justiceleague.mostrarNombre());
        System.out.println("Duracion: " + justiceleague.mostrarDuracion());
        System.out.println("Calidad: " + justiceleague.mostrarCalidad());
        System.out.println("Clasificacion: " + justiceleague.mostrarClasificacion());
        System.out.println("Genero: " + justiceleague.mostrarGenero());
        System.out.println("*********************************");
        
        Pelicula superman = new Pelicula();
        System.out.println("Nombre:" + superman.mostrarNombre());
        System.out.println("Duracion: " + superman.mostrarDuracion());
        System.out.println("Calidad: " + superman.mostrarCalidad());
        System.out.println("Clasificacion: " + superman.mostrarClasificacion());
        System.out.println("Genero: " + superman.mostrarGenero());
        System.out.print("Como se llama la pelicula: ");
        String nombre = lector.nextLine();
        
        superman.establecerNombre(nombre);
        System.out.print("Cual es la duracion de la pelicula: ");
        
        int duracion = lector.nextInt();
        superman.establecerDuracion(duracion);
        System.out.print("Cual es la calidad de la pelicula: ");
        
        lector.nextLine();
        String calidad = lector.nextLine();
        superman.establecerCalidad(calidad);
        System.out.print("Cual es la clasificacion de la pelicula: ");
        
        String clasificacion = lector.nextLine();
        superman.establecerClasificacion(clasificacion);
        System.out.print("Cual es el genero de la pelicula: ");
        
        String genero = lector.nextLine();
        superman.establecerGenero(genero);
        
        System.out.println("Nombre:" + superman.mostrarNombre());
        System.out.println("Duracion: " + superman.mostrarDuracion());
        System.out.println("Calidad: " + superman.mostrarCalidad());
        System.out.println("Clasificacion: " + superman.mostrarClasificacion());
        System.out.println("Genero: " + superman.mostrarGenero());
    }
}
