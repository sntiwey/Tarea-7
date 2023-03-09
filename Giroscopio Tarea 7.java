public class Giroscopio {
    private String significado;
    private double precioAmazon;
    private double precioMercadoLibre;
    private String adquicision;

    public Giroscopio() {
    }

    public Giroscopio(String significado, double precioAmazon, double precioMercadoLibre, String adquicision) {
        this.significado = significado;
        this.precioAmazon = precioAmazon;
        this.precioMercadoLibre = precioMercadoLibre;
        this.adquicision = adquicision;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public double getPrecioAmazon() {
        return precioAmazon;
    }

    public void setPrecioAmazon(double precioAmazon) {
        this.precioAmazon = precioAmazon;
    }

    public double getPrecioMercadoLibre() {
        return precioMercadoLibre;
    }

    public void setPrecioMercadoLibre(double precioMercadoLibre) {
        this.precioMercadoLibre = precioMercadoLibre;
    }

    public String getAdquicision() {
        return adquicision;
    }

    public void setAdquicision(String adquicision) {
        this.adquicision = adquicision;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "significado='" + significado + '\'' +
                ", precioAmazon=" + precioAmazon +
                ", precioMercadoLibre=" + precioMercadoLibre +
                ", adquicision='" + adquicision + '\'' +
                '}';
    }
    public void queEs(){
        System.out.println("El giroscipio es" + significado);
    }
    public void dondeComprar(){
        System.out.println("Este giroscopio se puede adquirir en Amazon y Mercado libre");
    }
    public void precioAmazon(){
        System.out.println("El precio en Amazon es de: " + precioAmazon);
    }
    public void precioMercado(){
        System.out.println("El precio estimado en Mercado Libre es de: " + precioMercadoLibre);
    }
}