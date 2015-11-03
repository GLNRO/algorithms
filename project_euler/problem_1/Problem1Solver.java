public class Problem1Solver
{

  public static void main(String[] args )
  {
    Problem1Solver solver = new Problem1Solver();
    solver.iterateSum(3,5,1,1000);
  }

  public void iterateSum(int multiple1, int multiple2, int rangeStart, int rangeFinish)
  {
    int sum = 0;
    for (int i=rangeStart; i<rangeFinish ; i++)
    {
      if( i % multiple1 == 0 || i % multiple2 == 0 )
      {
        sum += i;
      }
    }
    System.out.println(sum);
  }

}