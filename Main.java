import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    //variaveis
    double numeroReal =0.0;
    double divisao=0.0;
    //entrada
    System.out.println("Digite o número");
   numeroReal = leitor.nextDouble();
   //processamento
   divisao= numeroReal/3;
   //saida
   System.out.println("Resultado "+divisao);

   
  }
}