
package pruebaobjeto;


public class Player {
    
    private int id;
    private int numero_camiseta;
     String nombre;
     String apellido;
     String posición;
    private boolean diestro;

    public Player() {
    }

    public Player(int id, int numero_camiseta, String nombre, String apellido, String posición, boolean diestro) {
        this.id = id;
        this.numero_camiseta = numero_camiseta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posición = posición;
        this.diestro = diestro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_camiseta() {
        return numero_camiseta;
    }

    public void setNumero_camiseta(int numero_camiseta) {
        this.numero_camiseta = numero_camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public boolean isDiestro() {
        return diestro;
    }

    public void setDiestro(boolean diestro) {
        this.diestro = diestro;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", numero_camiseta=" + numero_camiseta + ", nombre=" + nombre + ", apellido=" + apellido + ", posici\u00f3n=" + posición + ", diestro=" + diestro + '}';
    }
    
    
    
   public void atacar() {
       System.out.println("va al ataque");   
    }
   
   public void defender () {
            System.out.println("esta en defensa");
    }
   
 public void rematar (int remates) {
     System.out.println("el jugador " + numero_camiseta + " ejecuto " + remates + " remates al arco.");
     }
}
