import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        tags = {"~@Ignore"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
//    private TestNGCucumberRunner testNGCucumberRunner;
//
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass(){
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
//
//    @Test(groups = "cucumber", description = "Run test with Cucumber", dataProvider = "features")
//    public void feature(CucumberFeatureWrapper cucumberFeature){
//        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//    }
//
//    @DataProvider
//    public Object[][] features(){
//        return testNGCucumberRunner.provideFeatures();
//    }
//
//
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass(){
//        testNGCucumberRunner.finish();
//    }
}
