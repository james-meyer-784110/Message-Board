package app.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IsoDate {

    protected static SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy.MMM.dd.hh:mm:ss");

    static String getCurrentTime(){
        Date current = new Date();
        return isoFormat.format(current);
    }

}
