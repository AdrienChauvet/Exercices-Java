public class Main {
    public static void main(String[] args) {
        int vowels = 0;
        int consonnes = 0;
        int words = 0;
        int phrases = 0;
        String sentence = "Les amis de Martine sont communistes. Ils avaient rendez-vous à la grange.";

        for (int i = 0 ; i < sentence.length() ; i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'y') {
                vowels++;
            }
            // Si espace ou apostrophe ou trait d'union :
            if (ch == ' ' || ch == 39 || ch == 45) {
                words++;
            }
            if (ch == 46) {
                phrases++;
            }
            else {
                consonnes++;
            }
        }
        System.out.println("Voyelles : " + vowels + ", consonnes : " + consonnes + ", mots : " + words + ", phrases : " + phrases );
    }
}
