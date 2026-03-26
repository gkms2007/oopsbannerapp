public class OOPSBannerApp6 {

    // Helper method for letter O
    static String[] buildO() {
        return new String[] {
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", " ", " ", " ", " ", " "),
            String.join("", " ", " ", " ", " ", " ")
        };
    }

    // Helper method for letter P
    static String[] buildP() {
        return new String[] {
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " "),
            String.join("", "*", " ", " ", " ", " "),
            String.join("", " ", " ", " ", " ", " "),
            String.join("", " ", " ", " ", " ", " ")
        };
    }

    // Helper method for letter S
    static String[] buildS() {
        return new String[] {
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " "),
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*"),
            String.join("", " ", " ", " ", " ", " "),
            String.join("", " ", " ", " ", " ", " ")
        };
    }

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Render OOPS banner
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}
