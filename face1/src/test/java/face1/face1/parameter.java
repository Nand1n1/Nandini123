package face1.face1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	@Parameters({"tester","location"})
  @Test
  public void primemember(String tester , String location) {
	  System.out.println("code for primemember");
	  System.out.println("its excuted by" +tester);
	  System.out.println("its excuted from" +location);
  }
  @Test
  public void renewal() {
	  System.out.println("code for renewal");
	  
}
  @Test
  public void termination() {
	  System.out.println("code for termination");
  }
}