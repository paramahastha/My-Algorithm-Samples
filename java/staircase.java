public class Main {
    static void staircase(int n) {
      for (int i = 0; i < n; i++) {
        for (int j = n; j > 0; j--) {                    
          if (j <= i+1) {
            System.out.print("#");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
      staircase(25);
    }
}