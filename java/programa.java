import java.util.Scanner;




public class programa {

public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
calculadora calculadora = new calculadora();
System.out.println("Calculadora");

System.out.println("Informe o primeiro numero");
calculadora.setNumeroUM(scanner.nextInt());

System.out.println("Informe o segundo numero");
calculadora.setNumeroDOIS(scanner.nextInt());

System.out.println("Informe a operação : ");
int operacao = scanner.nextInt();

switch (operacao)
{
    case 1 :    {int resultadoSOMA = calculadora.somar();
                System.out.println("Resultado da soma é : " + resultadoSOMA);}
                break;
    case 2 :   {double resultadoSubtrair = calculadora.subtrair();
                System.out.println("Resultado da soma é : " + resultadoSubtrair);} 
                break;
    case 3 :   {double resultadoMultiplicar = calculadora.multiplicar();
                System.out.println("Resultado da soma é : " + resultadoMultiplicar);}
                break;
    case 4 :   {double resultadoDividir = calculadora.dividir();
                System.out.println("Resultado da soma é : " + resultadoDividir);}
                break;
    case 5 :   {double resultadoPotencia = calculadora.potencia();
                System.out.println("Resultado da soma é : " + resultadoPotencia);}
                break;
    case 6 :   {double resultadoRaiz = calculadora.raiz();
                System.out.println("Resultado da soma é : " + resultadoRaiz);}

                break;

}



}






}