public class App {
    public static void main(String[] args) throws Exception {
        var estacion = "Primavera";

        switch(estacion){
            case "Invierno":
                System.out.println ("Estamos en la escacion Invierno");
                break;
            case "Otoño":
                System.out.println("Estamos en la escacion Otoño");
                break;
            case "Primavera":
                System.out.println("Estamos en la escacion Primavera");
                break;    
            case "Verano":
                System.out.println("Estamos en la escacion Verano");
                break;
            default:
                System.out.println("Default");
        }
        
    }
}
