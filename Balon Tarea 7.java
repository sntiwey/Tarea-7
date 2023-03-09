public class Balon {
    private String forma;
    private String marca;
    private String marca1;
    private int numero;
    private String deporte;

    public Balon() {
    }

    public Balon(String forma, String marca, String marca1, int numero, String deporte) {
        this.forma = forma;
        this.marca = marca;
        this.marca1 = marca1;
        this.numero = numero;
        this.deporte = deporte;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca1() {
        return marca1;
    }

    public void setMarca1(String marca1) {
        this.marca1 = marca1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "forma='" + forma + '\'' +
                ", marca='" + marca + '\'' +
                ", marca1='" + marca1 + '\'' +
                ", numero=" + numero +
                ", deporte=" + deporte +
                '}';
    }

    public boolean jugar(){
        System.out.println("Para poder jugar " + deporte + " necesitamos un balon de forma " + forma + " pero no importa la marca si es " + marca + " o " + marca1);
    return true;
    }
    public boolean baloon(){
        System.out.println("El balon de " + deporte + " tiene que ser de un numero de " + numero);
    return true;
    }


}