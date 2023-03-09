public class Gato {
    private String maullar;
    private String raza;
    private String color;
    private double peso;
    private String comer;
    private String jugar;

    public Gato() {
    }

    public Gato(String maullar, String raza, String color, double peso, String comer, String jugar) {
        this.maullar = maullar;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.comer = comer;
        this.jugar = jugar;
    }

    public String getMaullar() {
        return maullar;
    }

    public void setMaullar(String maullar) {
        this.maullar = maullar;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    public String getJugar() {
        return jugar;
    }

    public void setJugar(String jugar) {
        this.jugar = jugar;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "maullar='" + maullar + '\'' +
                ", raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", comer='" + comer + '\'' +
                ", jugar='" + jugar + '\'' +
                '}';
    }
    public boolean despertar(){
        System.out.println("El gato de raza " + raza + " de color " + color + " empieza su dia " + maullar + " y despues se va a comer " + comer);
        return true;
    }
    public boolean gatito(){
        System.out.println("El gato de raza " + raza + "es de un pero de " + peso + " kilos y lo que come es " + comer);
        return true;
    }
    public boolean loco(){
        System.out.println("El gato de raza " + raza + " lo que mas le gusta hacer es " + jugar + " pero al comer " + comer + " se vomita");
        return true;
    }
}