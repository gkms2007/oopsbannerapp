import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp7 {

    // Static Inner Class to encapsulate character and pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Centralized storage
    private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

    // Load patterns
    static void loadPatterns() {

        patternMap.put('O', new CharacterPattern('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****",
                "     ",
                "     "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "     ",
                "     "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****",
                "     ",
                "     "
        }));
    }

    // Dynamic display method
    static void displayBanner(String word) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        loadPatterns();
        displayBanner("OOPS");
    }
}
