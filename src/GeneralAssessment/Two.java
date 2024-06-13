package Book.GeneralAssessment;

public class Two {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("vam");
        System.out.println(s1 == s2);//Compara contenido
        System.out.println(s1.equals(s2));// compara contenido
        System.out.println(sb1.toString() == s1.toString()); //
        System.out.println(sb1.equals(s1));//Compara el tipo de dato
    }
}
