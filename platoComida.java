public class platoComida extends ItemMenu {
    private boolean esVegetariano;

    public platoComida(String id, String nombre, double precio, boolean esVegetariano) {
        super(id, nombre, precio);
        this.esVegetariano = esVegetariano;
    }

    public boolean getEsVegetariano() {
        return esVegetariano;
    }

    public void setEsVegetariano(boolean esVegetariano) {
        this.esVegetariano = esVegetariano;
    }

    @Override
    public String obtenerDetalles() {
        String base = super.obtenerDetalles();
        return base + " Vegetariano: " + (esVegetariano? "TRUE" : "FALSE");
    }
}
 