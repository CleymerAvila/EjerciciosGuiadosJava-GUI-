package PaquetePrincipal;
public class SalaCine {

    // Ejercicio teorico como crear una clase, Ejercicio 28
    int Aforo;
    int Ocupadas;
    double Entrada;
    String Pelicula;

    // Constructor
    public SalaCine(){
        Aforo = 100;
        Ocupadas = 0;
        Entrada = 5;
        Pelicula = "";
    }

    // Metodos set

    // Metodo set Aforo
    public void setAforo(int afo){
        Aforo = afo;
    }

    // Metodo set Ocupadas
    public void setOcupadas(int ocu){
        Ocupadas = ocu;
    }

    // Metodo set Entrada 
    public void setEntrada(double entra){
        Entrada = entra;
    }

    // Metodo set Pelicula
    public void setPelicula(String peli){
        Pelicula = peli;
    }

    // Metodo set Libre 
    public void setLibres(int lib){
        int ocu;

        ocu = Aforo - lib;
        Ocupadas = ocu;
    }

    // Metodos get

    // Metodo get Aforo
    public int getAforo(){
        return Aforo;
    }

    // Metodo get Ocupadas 
    public int getOcupadas(){
        return Ocupadas;
    }

    // Metodo get Pelicula
    public String getPelicula(){
        return Pelicula;
    }

    // Metodo get Entrada
    public double getEntrada(){
        return Entrada;
    }

    // Metodo get Libres
    public int getLibres(){
        int lib;

        lib = Aforo - Ocupadas;
        return lib;
    }

    // Metodo get Porcentaje
    public double getPorcentaje(){
        double por;

        por = (double) Ocupadas / (double) Aforo * 100;
        return por;
    }

    // Metodo get Ingreso
    public double getIngreso(){
        double ingre;

        ingre = Ocupadas * Entrada;

        return ingre;
    }

    // Metodos de orden
    // Metodo vaciar
    public void vaciar(){
        Ocupadas = 0;
        Pelicula = "";
    }

    // Metodo entra Uno
    public void entraUno(){
        Ocupadas++;
    }

}
