public class Main {
    public static void main(String[] args) {
        //Usando un if...
        int numeroIf = -30;
        if(numeroIf < 0) {
            System.out.println(numeroIf + " Es negativo.");
        } else if(numeroIf > 0) {
            System.out.println(numeroIf + " Es positivo.");
        } else {
            System.out.println("Es cero.");
        }

        //-------------------------------------------------
        //Bucle while...
        //Siguiendo el orden especificado en la consigna de incrementar primero y mostrar después:
        int numeroWhile = 0;
        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //-------------------------------------------------
        //Bucle do while...
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while(numeroDoWhile > 2);

        //-------------------------------------------------
        //Bucle for...
        int numeroFor = 0;
        for(int i = 0; i <= 3; i++) {
            System.out.println(numeroFor);
            numeroFor++;
        }

        //-------------------------------------------------
        //Statement switch...
        var estacion = "INVIERNO";
        switch(estacion) {
            case "PRIMAVERA":
                System.out.println("Estamos en primavera.");
                break;
            case "VERANO":
                System.out.println("Estamos en verano.");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño.");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno.");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}