import java.util.Random;

public class galleta {

     static String[] palabras = {"Invente",
                                "Roman",
                                "Goool"};

    public static void main(String[] args)  {
        Random rand = new Random();
        int r = rand.nextInt(palabras.length);
        System.out.println(palabras[r]);
    }
}