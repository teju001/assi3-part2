package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ countA.class, divtest.class, Stest.class })
public class AllTests {

}
