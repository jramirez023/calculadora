public class Calculadora {

    public static void main(String args[]){
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.resto(9,4));

    }
    public int resto(int a, int b){

        if (b == 0){
            return -1;
        }
        return a % b;
    }
}
