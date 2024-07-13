public class SistemaMedida {

    public static void main(String[] args) {
        
        String sigla = "G";

        switch (sigla) {
            case "P":
                System.out.println("PEQUINO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("IDEFINIDO");
        }
    }
    
}
