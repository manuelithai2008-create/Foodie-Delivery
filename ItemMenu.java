public class ItemMenu {
    
    private String id;
    private String nombre;
    private double precio;

    public ItemMenu(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getid() {
        return id;
    }

    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    
    public String obtenerDetalles() {
        return "id: " + id + ", nombre: " + nombre + ", precio: $" + precio;
    }
    
    }



    
    