public class Roman {


    public int toArabic(String romanNumber) {
        int sum= 0;
        for (char literal : romanNumber.toCharArray()) {
            sum += mapLiteral(literal);
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