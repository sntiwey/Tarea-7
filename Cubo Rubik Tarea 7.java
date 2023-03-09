public class CuboDeRubik {
    private byte colores;
    private double caras;
    private String cantidad;
    private String marca;
    private double precio;
    private String cuboTipico;

    public CuboDeRubik() {
    }

    public CuboDeRubik(byte colores, double caras, String cantidad, String marca, double precio, String cuboTipico) {
        this.colores = colores;
        this.caras = caras;
        this.cantidad = cantidad;
        this.marca = marca;
        this.precio = precio;
        this.cuboTipico = cuboTipico;
    }

    public byte getColores() {
        return colores;
    }

    public void setColores(byte colores) {
        this.colores = colores;
    }

    public double getCaras() {
        return caras;
    }

    public void setCaras(double caras) {
        this.caras = caras;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCuboTipico() {
        return cuboTipico;
    }

    public void setCuboTipico(String cuboTipico) {
        this.cuboTipico = cuboTipico;
    }

    @Override
    public String toString() {
        return "CuboDeRubik{" +
                "colores='" + colores + '\'' +
                ", caras=" + caras +
                ", cantidad='" + cantidad + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cuboTipico='" + cuboTipico + '\'' +
                '}';
    }

    public void cubo3x3() {
        System.out.println("El cubo tradicional tiene " + colores + " colores y es de la marca " + marca + " y es el cubo " + cuboTipico);
    }
    public void cubogrande(){
        System.out.println("El cubo de " + caras + " es el mas grande del mundo y tiene solamente 6 colores");
    }
    public void precio3x3(){
        System.out.println("El cubo 3x3 de " + colores  + "colores y de marca" + marca + " es de un precio de " + precio);
    }
}