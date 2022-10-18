public class Main {
    public static void main(String[] args) {

        int resultado = 0;
        resultado = suma( 4, 2, 4);
        System.out.println(resultado);
        Coche micoche = new Coche();
        micoche.puertas = 2;
        micoche.sumarpuerta();
        System.out.println(micoche.puertas);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
class Coche {
 public int puertas;
 public void sumarpuerta(){
     this.puertas ++;
 }
}