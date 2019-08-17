import java.util.Scanner;

class Imc{
    Scanner input = new Scanner(System.in);
    float peso, altura, imc;
    String classifica;

    public void imcinfo(){
        System.out.println("Digite o Peso:");
        this.peso = input.nextFloat();

        System.out.println("Digite a Altura:");
        this.altura= input.nextFloat();
        imc = calcularIMC(peso, altura);
        classifica = resultadoIMC(imc);
        System.out.printf("IMC da Pessoa: = %.1f - %s\n",imc,classifica);
    }

    public float calcularIMC(float p, float a){
        return p/(a*a);
    }

    static String resultadoIMC(float imc)
   {
      String result;
      if (imc <= 18.5)
         result = "Abaixo do Peso";
      else
         if (imc >= 18.6 && imc <= 24.9)
            result = "Peso ideal";
         else
            if (imc >= 25 && imc <= 29.9)
               result = "Levemente Acima do Peso";
            else
               if (imc >= 30 && imc <= 34.9)
                  result = "Obesidade Grau 1";
               else
                if(imc >= 35 && imc <= 39.9)
                  result = "Obesidade Grau 2";
                  else 
                  result = "Obesidade Grau 3";
      
      return result;
      
   }

}

public class imcfinal{
    public static void main( String[] args){
        Imc imc = new Imc();
        imc.imcinfo();
    }
}