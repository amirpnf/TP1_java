
public record Point(int x, int y) {
  public static void main(String[] args) {
    int abscissa = Integer.parseInt(args[0]);
    int ordinate = Integer.parseInt(args[1]);
    System.out.println("Point[x=" + abscissa + ", " + "y=" + ordinate + "]");

    var origin = new Point(abscissa, ordinate);
    origin.toString();
    System.out.println("dist = " + distance(origin));
  }

  private static double distance(Point p) {
    double res = Math.sqrt(Math.pow(p.x(), 2) + Math.pow(p.y(), 2));
    return res;
  }

  @Override // Peut-être pas nécessaire.
  public String toString() {
    return "Point[x=" + x + ", " + "y=" + y + "]" ;
  }
}
