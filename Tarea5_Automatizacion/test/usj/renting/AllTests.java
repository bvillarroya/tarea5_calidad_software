package usj.renting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testCaseCoupe.class, testCaseLimousine.class,
		testCaseSedan.class })
public class AllTests {

}
