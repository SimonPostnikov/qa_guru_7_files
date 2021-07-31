package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Files {
    public static String readStringFromFile(File downloaderFile) throws IOException {
        return  FileUtils.readFileToString(downloaderFile, StandardCharsets.UTF_8);
    }
    public static String readStringFromPath(String path) throws IOException {
        File file = new File(path);
        return readStringFromFile(file);
    }
}
