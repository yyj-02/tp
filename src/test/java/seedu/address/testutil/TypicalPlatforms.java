package seedu.address.testutil;

import seedu.address.model.applicant.Applicant;
import seedu.address.model.platform.Platform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static seedu.address.logic.commands.CommandTestUtil.*;

/**
 * A utility class containing a list of {@code Platform} objects to be used in tests.
 */
public class TypicalPlatforms {
    public static final Platform LINKEDIN = new PlatformBuilder().withName("Linkedin").build();

    public static final Platform INDEED = new PlatformBuilder().withName(VALID_PLATFORM_NAME_INDEED).build();
    public static final Platform GLINTS = new PlatformBuilder().withName(VALID_PLATFORM_NAME_GLINTS).build();

    private TypicalPlatforms() {
    } // prevents instantiation

    public static List<Platform> getTypicalPlatforms() {
        return new ArrayList<>(Arrays.asList(LINKEDIN, INDEED, GLINTS));
    }
}
