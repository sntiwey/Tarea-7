public class Libro {
    private String saga;
    private double totalLibros;
    private int paginas;
    private String autor;
    private String genero;

    public Libro() {
    }

    public Libro(String saga, double totalLibros, int paginas, String autor, String genero) {
        this.saga = saga;
        this.totalLibros = totalLibros;
        this.paginas = paginas;
        this.autor = autor;
        this.genero = genero;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public double getTotalLibros() {
        return totalLibros;
    }

    public void setTotalLibros(double totalLibros) {
        this.totalLibros = totalLibros;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "saga='" + saga + '\'' +
                ", totalLibros=" + totalLibros +
                ", paginas=" + paginas +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
    public boolean libroFavorito(){
        System.out.println("Mi libro favorito que tambien es una saga es " + saga + " y tiene un total de libro de " + totalLibros);
        return true;
        }
    public boolean cantidad(){
        System.out.println(saga + " tiene una cantidad de " + paginas + " paginas y este es de un genero " + genero);
        return true;

    }
}