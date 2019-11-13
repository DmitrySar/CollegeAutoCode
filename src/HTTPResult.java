class HTTPResult {

    private HTTPAnalizer analizer;

    public HTTPResult(HTTPAnalizer analizer) {
        this.analizer = analizer;
    }

    public void toConsole() {
        System.out.println(analizer.getResult());
    }


}
