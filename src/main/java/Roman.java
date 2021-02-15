public class Roman {


    public int toArabic(String romanNumber) {
        if(romanNumber.equals("I")) {
            return 1;
        } else if (romanNumber.equals("V")) {
            return 5;
        } else if(romanNumber.equals("X")){
            return 10;
        }
        throw new IllegalArgumentException("No valid roman char");
    }
}