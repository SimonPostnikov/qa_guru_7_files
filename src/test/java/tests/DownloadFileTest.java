package tests;
import com.codeborne.selenide.Configuration;
import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Test;
import utils.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DownloadFileTest {
    @Test
    void selenideDownloadReadmeTest() throws IOException {
        Configuration.downloadsFolder = "downloads";
        open("https://github.com/selenide/selenide/blob/master/README.md");
        File downloaderFile = $("#raw-url").download();
        String fileContent = Files.readStringFromFile(downloaderFile);
       // assertTrue(fileContent.contains(" # Selenide = UI Testing Framework powered by Selenium WebDriver"));
        System.out.println(fileContent);
        assertThat(fileContent, containsString("Selenide = UI Testing Framework powered by Selenium WebDriver"));

     //   # Selenide = UI Testing Framework powered by Selenium WebDriver

    }
}
