package Book.GeneralAssessment;

public class QuestionOne {
    private static int $; //La inicialización de la variable instancia por defecto se pone en cero

    public static void main(String[] main) {
        String a_b = "Hola"; //Sino se inicia aquí, ell error sale al momento de usar la variable.
        System.out.print($); // El signo dólar es válido y la variable general se puede usar sin inicializar porque está inicializado en cero.
        System.out.print("\n" + a_b);
    }
}
