import java.io.*;
import java.util.*;

class HTTPAnalizer {

    private HTTPReader reader;

    public HTTPAnalizer(HTTPReader reader) {
        this.reader = reader;
    }
    
    public String getResult() throws IOException {
    	String result = "";
    	String[] doc = reader.getHTML().split("\n");
    	for (String s: doc) {
    		if (s.matches(".*hours.*")) {
    			result = s;
    		}
    	}
    	result = result.replaceAll(".*\"hours\">", "");
    	result = result.replaceAll("class=\"timeview-info\".*", "");
    	result = result.replaceAll("\\D*","");
    	result = result.substring(0, 2) + ":" + result.substring(2, 4) + ":" + result.substring(4, 6);
        return result;
    }

}
