public class Encremento {

    static int numero = 5;

    public static void main(String[] args) {
        
        // repeticao
        numero = encrementar(numero);
            System.out.println(numero);

    }

    public static int encrementar(int n){
        n++;
        return n;
        
    }

    
}
