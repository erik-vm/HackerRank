public class EncryptionAndDecryption {

    public static void main(String[] args) {

        String longSentence = "This is one long sentence";

        int wordCount = 1;

        for (int i = 0; i<longSentence.length(); i++){
            if (longSentence.charAt(i) == ' '){
                wordCount++;
            }
        }
        System.out.println(wordCount);

        String reversedString = longSentence.substring(0, ' ');

//create system that takes a string and reverses it word by word and if the there are two or more same letters, it is replaces with a number
        // example = "This is my ball" --> "bal2 my is This"
        System.out.println(reversedString);
    }
}
