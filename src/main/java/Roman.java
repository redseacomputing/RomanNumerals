public class Roman {


    public int toArabic(String romanNumber) {
        int sum= 0;
        int [] digits = new int[romanNumber.length()];

        for (int i = 0 ; i < romanNumber.length(); i++) {
            digits[i]= mapLiteral(romanNumber.charAt(i));
        }

        for (int i = 0 ; i < romanNumber.length(); i++) {
            sum += digits[i];
        }
        return sum;
    }

    private int mapLiteral(char literal) {
        if(literal == 'I') {
            return 1;
        } else if (literal== 'V') {
            return 5;
        } else if(literal== 'X'){
            return 10;
        }
        throw new IllegalArgumentException("No valid roman char");
    }
}