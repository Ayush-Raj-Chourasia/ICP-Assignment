public class q4a {
    public static void main(String[] args) {
        String word = "HELEN";
        String code = encodeWord(word);
        System.out.println("The code for " + word + " is " + code);
    }

    public static String encodeWord(String word) {
        String code = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            switch (letter) {
                case 'H':
                    code+="3";
                    break;
                case 'O':
                    code+="5";
                    break;
                case 'U':
                    code+="8";
                    break;
                case 'S':
                    code+="4";
                    break;
                case 'E':
                    code+="2";
                    break;
                case 'L':
                    code+="1";
                    break;
                case 'M':
                    code+="6";
                    break;
                case 'N':
                    code+="9";
                    break;
            }
        }
        return code;

    }
}
