import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) { // Loop to prompt twice
            String sentence = getSentenceInput(scanner); 
            int wordCount = countWords(sentence); 
            System.out.println("The sentence has " + wordCount + " words."); 
        }
        
        scanner.close();
    }

    
    public static String getSentenceInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); 
    }

    
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; 
        }
        String[] words = sentence.trim().split("\\s+"); 
        return words.length;
    }
}
