class HTTPController {

    private HTTPReader reader;

    private HTTPAnalizer analizer;

    private HTTPResult result;

    private String url = "https://ya.ru";

    public static void main(String[] args) {
    	HTTPController controller = new HTTPController();
    	controller.start();
    }

    private void start() {
        reader = new HTTPReader(url);
        analizer = new HTTPAnalizer(reader);
        result = new HTTPResult(analizer);
        result.toConsole();
    }

}
