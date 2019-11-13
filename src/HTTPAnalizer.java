import java.io.*;

class HTTPAnalizer {

    private HTTPReader reader;

    public HTTPAnalizer(HTTPReader reader) {
        this.reader = reader;
    }

    public String getResult() throws IOException {
        return reader.getHTML();
    }

}
