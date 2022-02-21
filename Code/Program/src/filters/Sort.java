package filters;

import java.util.ArrayList;
import java.util.Collections;


public class Sort extends Filter{

    private ArrayList<String> s, si;

    public Sort() {
        s = new ArrayList<String>();
    }

    public void run() {
        s = readBuffer();
        si = readIgnore();
        Collections.sort(s);
        writeBuffer(s);
        writeIgnore(si);
    }
}
