public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        
        String nome = "Marcos A. da Silva";
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        final float VALOR_DE_PI = 3.14F;    
        double salarioMinimo = 2500.33;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println("O novo número é : " + numero);

        System.out.println("O valor de PI é : " + VALOR_DE_PI);
    }
}
