package lacos;

public class Ex2SomatorioFuncao {

    public static void main(String[] args) {

            double soma = 0;

        for (double x = 1 ; x <= 20 ; x++) {
            double resultado = (double) ((Math.sqrt(x/3))*4000+(x/2))/2;
            soma += resultado;
        }
        System.out.println(soma);
    }
}