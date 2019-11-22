import java.io.*;

class HTTPResult {

    private HTTPAnalizer analizer;

    public HTTPResult(HTTPAnalizer analizer) {
        this.analizer = analizer;
    }

    public void toConsole() throws IOException {
        System.out.println(analizer.getResult());
    }

}
