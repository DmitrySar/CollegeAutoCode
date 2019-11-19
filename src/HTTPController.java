import java.io.*;
import java.util.*;

class HTTPController {

    private HTTPReader reader;

    private HTTPAnalizer analizer;

    private HTTPResult result;

    private String url = "https://www.timeserver.ru/cities/ru/saransk";
    //private String url = "file:///d:/projects/CollegeAutoCode/src/HTTPAnalizer.java";

    public static void main(String[] args) throws IOException {
    	HTTPController controller = new HTTPController();
    	controller.start();
    }

    private void start() throws IOException {
        reader = new HTTPReader(url);
        long startTime = System.currentTimeMillis();
        analizer = new HTTPAnalizer(reader);
        result = new HTTPResult(analizer);
        System.out.print("carrent time: ");
        result.toConsole();
        long stopTime = System.currentTimeMillis();
        System.out.printf("time for work program: %d ms", (stopTime - startTime));
    }

}
