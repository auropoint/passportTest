package passport.tests;

import org.junit.jupiter.api.Test;
import passport.steps.CommonSteps;
import passport.testData.PassportTestData;

public class LoginEnterTest {

  @Test
  public void loggingIn() {
    commonSteps.openMainPage();
    commonSteps.enterToLoginPage();
    commonSteps.loginWithUsernameAndPassword(PassportTestData.username, PassportTestData.password);
  }



  CommonSteps commonSteps = new CommonSteps();

}
