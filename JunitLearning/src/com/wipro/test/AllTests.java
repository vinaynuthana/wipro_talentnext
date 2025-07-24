package com.wipro.test;
import com.wipro.test.TestStringConcat;
import assertMethods.TestSort;
import assertMethods.TestCheckPresence;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})
public class AllTests {
    // This class remains empty.
    // It is used only as a holder for the above annotations.
}
