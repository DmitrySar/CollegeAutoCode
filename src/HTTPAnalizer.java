class HTTPAnalizer {

    private HTTPReader reader;

    public HTTPAnalizer(HTTPReader reader) {
        this.reader = reader;
    }

    public String getResult() {
        return reader.getHTML();
    }


}
