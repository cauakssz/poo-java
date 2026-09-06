package strings;

public class Word {
    public static void main(String[] args){
    String word = "Java";

    int length = word.length();
    char firstLetter = word.charAt(0);
    char lastLetter = word.charAt(length - 1);

    String result = "Word: " + word + "| Length: " + length + "| First letter: " + firstLetter + "| Last letter: " + lastLetter;
        System.out.println(result);
    }
}
