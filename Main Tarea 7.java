public class Main {
    public static void main(String[] args) {
        System.out.println("Clase Pais");
        Pais ps = new Pais("Colombia", "Latinoamericano", "Espaniol", "51 millones", "32", "Gustabo Petro");
        System.out.println(ps);
        ps.mostrarPais();
        ps.dondeEsElPais();
        ps.presidentePais();
        ps.personas();

        //Clase Giroscopio

        System.out.println("");
        System.out.println("Giroscopio");
        Giroscopio giro = new Giroscopio("Dispositivo que sirve para asegurar la estabilidad de un torpedo", 359, 149, "Mercado Libre, Amazon, AliExpress, MarquetPlace");
        System.out.println(giro);
        giro.queEs();
        giro.dondeComprar();
        giro.precioAmazon();
        giro.precioMercado();

        //Clase Computadora

        System.out.println("");
        System.out.println("Computadora");
        Computadora comp = new Computadora("Dell", 16, 19.999, "Intel Core i7", "Espaniol");
        System.out.println(comp);
        comp.encender();
        comp.corriendo();
        comp.apagando();
        comp.costo();
        comp.idioma();

        //Clase Cubo de Rubik

        System.out.println("");
        System.out.println("Rubik");
        CuboDeRubik cubo = new CuboDeRubik((byte) 6, 32, "Varia de n*m", "Rubiks", 339, "3x3");
        System.out.println(cubo);
        cubo.cubo3x3();
        cubo.cubogrande();
        cubo.precio3x3();

        //Clase libro

        System.out.println("");
        System.out.println("Libro");
        Libro li = new Libro("Diario de Greg", 16, 213, "Jeff Kinney", "Humor, Ficcion juvenil y comedio");
        System.out.println(li);
        li.libroFavorito();
        li.cantidad();

        //Clase Balon

        System.out.println("");
        System.out.println("Libro");
        Balon ba = new Balon("redonda", "Wilson", "Voit", 5, "futbol");
        System.out.println(ba);
        ba.jugar();
        ba.baloon();

        //Clase Lampara

        System.out.println("");
        System.out.println("Lampara");
        Lampara lamp = new Lampara("Iluminar", "Incandecente", "Bajo consumo", "LED", "Encendiendo...", "Apagando...");
        lamp.prender();
        lamp.apagar();
        lamp.encender2();
        lamp.apagar2();
        lamp.encender3();
        lamp.apagar3();
        lamp.funcion();

        //Clase Gato
        System.out.println("");
        System.out.println("Gato");
        Gato gat = new Gato("maullando", "egipcia", "negro", 19, "Wiskas", "Jugar con si raton");
        gat.despertar();
        gat.gatito();
        gat.loco();
    }
}