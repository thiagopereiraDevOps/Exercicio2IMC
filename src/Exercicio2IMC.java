import java.util.Scanner;

public class Exercicio2IMC {

    /*Calcular o IMC
     *etec sm 13/03/2023
     *criado por Thiago Pereira
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Todo Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        float imc, peso, altura;
        System.out.println("Digite seu peso em kg (70,0)");
        peso = entrada.nextFloat();
        System.out.println("Digite sua altura em m (1,70)");
        altura = entrada.nextFloat();
        imc = peso/(altura*altura);
        System.out.println("Seu IMC é de %.2f" , imc);
    }
}
