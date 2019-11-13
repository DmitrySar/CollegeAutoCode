import java.util.Scanner;
import java.net.*;
import java.io.*;

class HTTPReader {

    private String url;

    private String codePage = "UTF-8";

    public HTTPReader(String url) {
        this.url = url;
    }

    public String getHTML() throws IOException {
        return new Scanner(new URL(url).openStream(), codePage).useDelimiter("\\A").next();
    }


}
