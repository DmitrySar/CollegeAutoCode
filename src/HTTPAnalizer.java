import java.io.*;
import java.util.*;

class HTTPAnalizer {

    private HTTPReader reader;

    private final int TIME_ZONE = 4;

    public HTTPAnalizer(HTTPReader reader) {
        this.reader = reader;
    }

    public String getResult() throws IOException {
    	String result = "";
    	String[] doc = reader.getHTML().split("\n");
    	for (String s: doc) {
    		if (s.matches(".*utcTime:.*")) {
    			result = s;
    		}
    	}
    	result = result.replaceAll(".*: ", "");
    	result = result.replaceAll(",.*", "");
    	GregorianCalendar calendar = new GregorianCalendar();
    	//TimeZone tz = TimeZone.getTimeZone("Russia/Saransk");
    	calendar.setGregorianChange(new Date(new Long(result)));
    	calendar.setTimeZone(TimeZone.getTimeZone("Russia/Saransk"));
    	result = calendar.HOUR + ":" + calendar.MINUTE + ":" + calendar.SECOND;
        return result;
    }

}
