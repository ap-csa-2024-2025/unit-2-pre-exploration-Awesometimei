public class WarmUp
{
  public static void main(String[] args)
  {
    System.out.println(isEven(1));
    System.out.println(isEven(2));
    System.out.println(isDivisible(2, 1));
  }

  public static boolean isEven(int n)
  {
    return (n%2 == 0);
  }

  public static boolean isDivisible(int dividend, int divisor)
  {
    return (dividend%divisor == 0);
  }

  
}
