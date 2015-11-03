public class Problem2Solver
{
  public static void main(String[] args)
  {
    Problem2Solver solver = new Problem2Solver();
    solver.sumEvens(4000000);
  }

  public void sumEvens( int limit )
  {
    int previousN = 1;
    int currentN = 1;
    int nextN = 0;
    int sum = 0;

    while ( nextN < limit )
    {
      nextN = previousN + currentN;
      if ( nextN % 2 == 0 )
      {
        sum += nextN;
      }
      previousN = currentN;
      currentN = nextN;
    }
    System.out.println(sum);
  }
}