public class oopsbannerappuc4 {
    public oopsbannerappuc4() {
   }

   public static void main(String[] var0) {
      String[] var1 = new String[]{String.join("", "  **  ", "  **  ", "  **  ", "  **  "), String.join("", " *     * ", " *     * ", " *     * ", " *       "), String.join("", " *     * ", " *     * ", " *     * ", " *       "), String.join("", " *     * ", " *     * ", "  **  ", "  **  "), String.join("", " *     * ", " *     * ", " *       ", "       * "), String.join("", " *     * ", " *     * ", " *       ", "       * "), String.join("", "  **  ", "  **  ", " *       ", "  ***  ")};
      String[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         System.out.println(var5);
      }

   }
}
