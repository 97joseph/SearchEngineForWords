package filters;

import ui.Controller;

import java.util.ArrayList;
import java.util.Scanner;


public class Input extends Filter{

    public void run(ArrayList<String> titles, ArrayList<String> ignore) {
        // Write the data to the pipe
        writeBuffer(titles);
        writeIgnore(ignore);
    }
}
