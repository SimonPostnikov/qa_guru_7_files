package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readStringFromPath;

public class TxtFileTest {
    @Test
    public void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/Files/1.txt";
        String  expectedData = "some test here";

        String actualData = readStringFromPath(txtFilePath);
        assertThat(actualData , containsString(expectedData));
    }
}
