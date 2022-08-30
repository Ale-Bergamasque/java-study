public class CalculoIMC {

    public static void main(String[] args) {
        double peso = 64;
        double altura = 1.60;
        double imc = 0;

        imc = peso / (altura * altura);

        System.out.println(imc);
    }
}
