package Book.ChapterI;

import java.util.Random;

public class Imports {
    public static void main(String[] args) {
        Random r = new Random(); // DOES NOT COMPILE
        System.out.println(r.nextInt(10));
    }
}
