package face1.face1;

import org.testng.annotations.Test;

public class GroupingtestNG {
  @Test(groups = {"sanity" , "regression"})
  public void login() {
	  System.out.println("code for login");
  }
  @Test(groups = {"sanity" })
  public void registration() {
	  System.out.println("code for  registration");
  }
  @Test(groups = { "regression"})
  public void logout() {
	  System.out.println("code for logout");
  }
}
