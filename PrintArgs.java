public class PrintArgs {
  public static void main(String[] args) {
    for (var element : args) {
      System.out.format("%s \n", element);
    }
  }
}
