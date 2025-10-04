package org.example.kafkaspringcloudstream.events;

import javax.xml.crypto.Data;
import java.util.Date;

public record PageEvent(String name, String user, Date date, long duration) {

}
