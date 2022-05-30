public class Principal {

    public static void main(String [] args) {

        Quadrado quadrado = new Quadrado();
        Quadrilatero quadrilatero = new Quadrilatero();
        Retangulo retangulo = new Retangulo();
        Trapezio trapezio = new Trapezio();
        Losango losango = new Losango();

       
        quadrilatero.calcularArea();
        quadrado.calcularArea();
        retangulo.calcularArea();
        trapezio.calcularArea();
        losango.calcularArea();

        
    }
    
}
