import DataProvider.DataProvider;
import Test.Test;

public  class DataProviderExample {

  @Test(dataProvider = "LoginDataProvider")
  public void loginTest(String login, String pwd)
  {
    System.out.println(login+"   "+pwd);
  }

  @DataProvider(name="LoginDataProvider")
  public Object[][] getData()
  {
    Object[][] data={{" https://www.shino.de/parkcalc/ ","shino"}};
    return data;

  }
}
