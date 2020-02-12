package face1.face1;

import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void login() {
	  System.out.println("some 5 lines of code for login");
  }
  @Before
  public void launch() {
	  System.out.println("some 3 lines of code for launch");
  }
  @Test
  public void register() {
	  System.out.println("some 5 lines of code for register");
  }
}
