import java.io.*;

class HTTPController {

    private HTTPReader reader;

    private HTTPAnalizer analizer;

    private HTTPResult result;

    private String url = "https://ya.ru";

    public static void main(String[] args) throws IOException {
    	HTTPController controller = new HTTPController();
    	controller.start();
    }

    private void start() throws IOException {
        reader = new HTTPReader(url);
        analizer = new HTTPAnalizer(reader);
        result = new HTTPResult(analizer);
        result.toConsole();
    }

}
