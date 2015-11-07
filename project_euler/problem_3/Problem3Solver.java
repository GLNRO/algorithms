import java.util.stream.IntStream;

public class Problem3Solver
{

  public static void main( String[] args )
  {
    Problem3Solver solver = new Problem3Solver();
    solver.largest_factor();

  }


  public void largest_factor()
  {
    IntStream.rangeClosed(1,15).forEach(i -> System.out.println(i));

  }

}