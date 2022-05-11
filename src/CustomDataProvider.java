import DataProvider.DataProvider;

public class CustomDataProvider {
  @DataProvider(name="LoginDataProvider")
  public Object[][] getData()
  {
    Object[][] data={{" https://www.shino.de/parkcalc/ ","shino"}};
    return data;

  }
}
