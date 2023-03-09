public class Computadora {
    private String marca;
    private double pulgadas;
    private double precio;
    private String procesador;
    private String idioma;

    public Computadora() {
    }

    public Computadora(String marca, double pulgadas, double precio, String procesador, String idioma) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.precio = precio;
        this.procesador = procesador;
        this.idioma = idioma;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                ", precio=" + precio +
                ", procesador='" + procesador + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
    public boolean encender(){
        System.out.println("Encendiendo la computadora marca" + marca + "de " + pulgadas + "pulgadas.");
        return true;
    }
    public boolean corriendo(){
        System.out.println("Esta corriendo Fortnite con el preocesador " + procesador + " con computadora marca " + marca + " de " + pulgadas + " pulgadas.");
        return true;
    }
    public boolean apagando(){
        System.out.println("Esta computadora marca " + marca + " se esta apagando BYE");
        return true;
    }
    public boolean costo(){
        System.out.println("El costo de la computadora " + marca + " es de: " + precio);
        return true;
    }
    public boolean idioma(){
        System.out.println("El idioma del teclado es " + idioma);
        return true;
    }
}