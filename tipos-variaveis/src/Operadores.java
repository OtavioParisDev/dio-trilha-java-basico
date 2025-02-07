public class Operadores {
    
      /*  

        int numero = 1;
        numero = -numero; // torna-lo negativo
        System.out.println(numero);
        numero = numero * -1; // torna-lo positivo
        System.out.println(numero); 

        */
        
        /*
                             Resumo Operadores 
        Operadores relacionais avaliam a relação entre duas variáveis ou expressões,
        retornando um valor booleano como resultado.

        == variavel IGUAL A outra
        != variavel DIFERENTE da outra
        >  variavel MAIOR QUE a outra 
        >= variavel MAIOR OU IGUAL a outra
        <  variavel MENOR QUE a outra
        <= variavel MENOR OU IGUAL a outra 

    
        */

    public static void main(String[] args) throws Exception {
      
        String nomeUm = "Gabriel";
        String nomeDois = new String("Gabriel");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

     boolean simNao = numero1 == numero2;

     if (numero1 == numero2){ //true
        System.out.println("a nossa condição é verdadeira");
     }

     System.out.println("numeroUm é igual a numeroDois? " + simNao);

     simNao = numero1 != numero2;
     
     System.out.println("numeroUm é igual a numeroDois? " + simNao);

     simNao = numero1 > numero2;
     
     System.out.println("numeroUm é maior que o numeroDois? " + simNao);

     simNao = numero1 < numero2;
     
     System.out.println("numeroUm é menor que o numeroDois? " + simNao);
        
        
        


    }   




      
}