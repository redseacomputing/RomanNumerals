public class Roman {


    public int toArabic(String romanNumber) {
        int[] digits = convertDigits(romanNumber);
        handleSubtractiveForm(digits);
        return sum(digits);
    }

    private int[] convertDigits(String romanNumber) {
        int[] digits = new int[romanNumber.length()];
        for (int i = 0; i < romanNumber.length(); i++) {
            digits[i] = mapLiteral(romanNumber.charAt(i));
        }
        return digits;
    }

    private int mapLiteral(char literal) {
        if (literal == 'I') {
            return 1;
        } else if (literal == 'V') {
            return 5;
        } else if (literal == 'X') {
            return 10;
        }
        throw new IllegalArgumentException("No valid roman char");
    }

    private void handleSubtractiveForm(int[] digits) {
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] < digits[i + 1]) {
                digits[i] *= -1;
            }
        }
    }

    private int sum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}