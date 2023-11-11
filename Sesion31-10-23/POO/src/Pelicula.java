public class Pelicula {
  
    //Atributos
    private String nombre;
    private int duracion;
    private String genero;
    private String calidad;
    private String clasificacion;
  
    //Metodos constructores
    //Metodo constructor sin parametros
  
    public Pelicula(){
        this("No disponible", 0, "No disponible", "No disponible", "No disponible");
    }
  
    //Metodo constructor con todos los parametros
    public Pelicula(String nombre, int duracion, String genero, String calidad, String clasificacion){
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.calidad = calidad;
        this.clasificacion = clasificacion;
    }
    //Metodos getters y setters
    //Los metodos getters son para mostrar los valores de los atributos
  
    public String mostrarNombre(){  //getNombre()
        return this.nombre;
    }
    public int mostrarDuracion(){  //getDuracion()
        return this.duracion;
    }
    public String mostrarGenero() {
        return this.genero;
    }    
    public String mostrarCalidad() {
        return this.calidad;
    }    
    public String mostrarClasificacion() {
        return this.clasificacion;
    }    
  
    //Los metodos setters son para modificar los valores de los atributos    
    public void establecerNombre(String nombre){    //setNombre()
        this.nombre = nombre;
    }
    public void establecerDuracion(int duracion){    //setDuracion()
        if (duracion < 0) {
            this.duracion = 0;
        } else {
            this.duracion = duracion;
        }  
    }
    public void establecerGenero(String genero) {
        this.genero = genero;
    }
    public void establecerClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public void establecerCalidad(String calidad) {
        this.calidad = calidad;
    }
}
