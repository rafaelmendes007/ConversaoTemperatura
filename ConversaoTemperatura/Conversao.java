// 14. Leia uma temperatura a qual o usuário irá digitar o valor e a escala atual: (Fahrenheit, Celsius, Kelvin), e informar a escala para qual deseja converter.


import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {

        // Criação do Scanner para entrada de dados
        Scanner teclado = new Scanner(System.in);

        // Solicitar a temperatura atual
        System.out.println("Digite a temperatura: ");
        double temperatura = teclado.nextDouble();

        // Solicitar a escala atual
        System.out.println("Escalas, \n1 - Celsius, \n2 - Farenheit, \n3 - Kelvin, \nDigite a escala atual: ");
        int escalaAtual = teclado.nextInt();

        // Solicitar a escala para conversão
        System.out.println("Escalas, \n1 - Celsius, \n2 - Farenheit, \n3 - Kelvin, \nDigite a escala para conversão: ");
        int escalaFinal = teclado.nextInt();

        // Condicionais para conversão de temperatura
        switch (escalaAtual) {
            case 1: // Celsius
                if (escalaFinal == 2) { // To Farenheit
                    temperatura = temperatura*(1.8) + 32;
                    System.out.println("Temperatura em Farenheit: " + temperatura);

                } else if (escalaFinal == 3) { //To kelvin
                    temperatura += 273.15;
                    System.out.println("Temperatura em Kelvin: " + temperatura);

                } else {
                    System.out.println("Número inválido");
                }
                break;

            case 2: // Farenheit
                if (escalaFinal == 1) { // To Celsius
                    temperatura = (temperatura - 32) / 1.8;
                    System.out.println("Temperatura em Celsius: " + temperatura);

                } else if (escalaFinal == 3) { // To Kelvin
                    temperatura = (temperatura - 32) / 1.8;
                    temperatura += 273.15;
                    System.out.println("Temperatura em Kelvin: " + temperatura);

                } else {
                    System.out.println("Número inválido");

                }
                break;

            case 3: // Kelvin
                if (escalaFinal == 1) { // To Celsius
                    temperatura -= 273.15;
                    System.out.println("Temperatura em Celsius: " + temperatura);

                } else if (escalaFinal == 2) { // To Farenheit
                    temperatura = 1.8*(temperatura - 273) + 32;
                    System.out.println("Temperatura em Farenheit: " + temperatura);

                } else {
                    System.out.println("Número inválido");

                }
                break;

        }
    }

}
