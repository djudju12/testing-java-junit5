package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("Entity")
public interface EntityTest {

    @BeforeEach
    // default void beforeEachMethod(TestInfo testInfo, RepetitionInfo pInfo) {
    default void beforeEachMethod(TestInfo testInfo) {
        // System.out.println(testInfo.getDisplayName() + " : " + pInfo.getCurrentRepetition());
        System.out.println(testInfo.getDisplayName());
    }
}
