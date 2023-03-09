public class Lampara {
    private String iluminar;
    private String tipo;
    private String tipo2;
    private String tipo3;
    private String encender;
    private String apagar;

    public Lampara() {
    }

    public Lampara(String iluminar, String tipo, String tipo2, String tipo3, String encender, String apagar) {
        this.iluminar = iluminar;
        this.tipo = tipo;
        this.tipo2 = tipo2;
        this.tipo3 = tipo3;
        this.encender = encender;
        this.apagar = apagar;
    }

    public String getIluminar() {
        return iluminar;
    }

    public void setIluminar(String iluminar) {
        this.iluminar = iluminar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getTipo3() {
        return tipo3;
    }

    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }

    public String getEncender() {
        return encender;
    }

    public void setEncender(String encender) {
        this.encender = encender;
    }

    public String getApagar() {
        return apagar;
    }

    public void setApagar(String apagar) {
        this.apagar = apagar;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "iluminar='" + iluminar + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tipo2='" + tipo2 + '\'' +
                ", tipo3='" + tipo3 + '\'' +
                ", encender='" + encender + '\'' +
                ", apagar='" + apagar + '\'' +
                '}';
    }
    public boolean prender(){
        System.out.println(encender + " lampara de tipo " + tipo);
        return true;
    }
    public boolean apagar(){
        System.out.println(apagar + " lampara de tipo " + tipo);
        return true;
    }
    public boolean encender2(){
        System.out.println(encender + " lampara de tipo " + tipo2);
        return true;
    }
    public boolean apagar2(){
        System.out.println(apagar + " lampara de tipo " + tipo2);
        return true;
    }
    public boolean encender3(){
        System.out.println(encender + " lampara de tipo " + tipo3);
        return true;
    }
    public boolean apagar3(){
        System.out.println(apagar + " lampara de tipo " + tipo3);
        return true;
    }
    public boolean funcion(){
        System.out.println("Las lamparas " + tipo + "," + tipo2 + "y" + tipo3  + " sirven para" + iluminar + " la oscuridad");
        return true;
    }

}