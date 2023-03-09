public class Pais {
    private String pais;
    private String continente;
    private String idioma;
    private String aproxPersonas;
    private String estados;
    private String presidente;

    public Pais() {
    }

    public Pais(String pais, String continente, String idioma, String aproxPersonas, String estados, String presidente) {
        this.pais = pais;
        this.continente = continente;
        this.idioma = idioma;
        this.aproxPersonas = aproxPersonas;
        this.estados = estados;
        this.presidente = presidente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAproxPersonas() {
        return aproxPersonas;
    }

    public void setAproxPersonas(String aproxPersonas) {
        this.aproxPersonas = aproxPersonas;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    public  String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "pais='" + pais + '\'' +
                ", continente='" + continente + '\'' +
                ", idioma='" + idioma + '\'' +
                ", aproxPersonas=" + aproxPersonas +
                ", estados='" + estados + '\'' +
                ", presidente=" + presidente +
                '}';
    }

    public void mostrarPais(){
        System.out.println("El pais que quiero mostrarte es: " + pais);
    }
    public void dondeEsElPais(){
        System.out.println("El pais de " + pais + "esta ubicado en el continente " + continente);
    }
    public void presidentePais(){
        System.out.println("El presidente de " + pais + "es: " + presidente);
    }
    public void personas(){
        System.out.println("En el pais de " + pais + " hay " + aproxPersonas);
    }
}