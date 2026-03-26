public class OOPSBannerApp5 {

    public static void main(String[] args) {

        String[] bannerLines = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", "O", "O", " ", "*"),
            String.join("", "*", " ", "O", " ", " ", "O", "*"),
            String.join("", "*", " ", "O", " ", " ", "O", "*"),
            String.join("", "*", " ", " ", "O", "O", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
