import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String[] chains={
                "La ruta natural", "Esto no es", "Parzibyte", "Hola", "Sol", "Ana", "Oro", "Oso",
                "A ti no, bonita",
                "Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida",
                "A mamá, Roma le aviva el amor a papá y a papá, Roma le aviva el amor a Mamá", "Me gusta programar en Java" };
        for(String chain : chains){
            System.out.println("¿'" + chain + "' es palíndromo? " + isPalindrome(chain));

        }
    }

    //Check for palindrome in Java

    public static Boolean isPalindrome(String chain){
        //convert to lowercase and remove blanks between letters
        //also replace accents and punctuation

        chain =chain.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");

        //invert the text string

        String invert = new StringBuilder(chain).reverse().toString();

        return invert.equals(chain);
    }
}