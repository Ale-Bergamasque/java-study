public class Troco {

    public static void main(String[] args) {

        double valorBrinquedo = 8.5;
        double troco = 0;
        double valorPago = 9;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        double moeda1 = 0.0;
        double moeda50 = 0.0;
        double moeda25 = 0.0;
        double moeda10 = 0.0;
        double moeda5 = 0.0;

        if (valorPago == valorBrinquedo) {
            System.out.println("Não possui troco.");
            return;
        } else {
            troco = valorPago - valorBrinquedo;
            System.out.println("O troco é: " + troco);
        }

        if (troco >= 50) {
            nota50 = (int) troco / 50;
            troco -= 50 * nota50;

        } if ( troco >= 20) {
            nota20 = (int) troco / 20;
            troco -= 20 * nota20;

        } if (troco >= 10) {
            nota10 = (int) troco / 10;
            troco -= 10 * nota10;

        } if (troco >= 5) {
            nota5 = (int) troco / 5;
            troco -= 5 * nota5;

        } if (troco >= 2) {
            nota2 = (int) troco / 2;
            troco -= 5 * nota2;

        } if (troco >= 1) {
            moeda1 = (int) troco / 1;
            troco -= 1 * moeda1;

        } if (troco >= 0.5) {
            moeda50 = troco / 0.5;
            troco -= 0.5 * moeda50;

        } if (troco >= 0.25) {
            moeda25 = troco / 0.25;
            troco -= 0.25 * moeda25;

        } if (troco >= 0.1) {
            moeda10 = troco / 0.1;
            troco -= 0.1 * moeda10;

        } if (troco >= 0.05) {
            moeda5 = troco / 0.05;
            troco -= 0.05 * moeda5;
        }


        System.out.println("Notas de R$50,00: " + nota50);
        System.out.println("Notas de R$20,00: " + nota20);
        System.out.println("Notas de R$10,00: " + nota10);
        System.out.println("Notas de R$5,00: " + nota5);
        System.out.println("Notas de R$2,00: " + nota2);
        System.out.println("Moedas de R$1,00: " + moeda1);
        System.out.println("Moedas de R$0,50 " + moeda50);
        System.out.println("Moedas de R$0,25: " + moeda25);
        System.out.println("Moedas de R$0,10: " + moeda10);
        System.out.println("Moedas de R$0,05: " + moeda5);



    }










}
