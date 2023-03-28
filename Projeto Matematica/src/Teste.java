public class Teste {
    public static void main(String[] args) {

        Equacao eq = new Equacao ();
    int delta, x1, x2;
  
    eq.seta(3);
    eq.setb(1);
    eq.setc(2);

    delta = eq.calculaDelta();

    x1 = eq.calculaX1();
    x2 = eq.calculaX2();
    
    System.out.println("Delta = " + delta + \n "x1 =" + x1 \n "x2 =" + x2);

        
    }
}
