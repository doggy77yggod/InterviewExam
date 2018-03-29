package softLeader;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TimeClockService {
	
	public static List<TimeClockEntity> getData(){
		List<TimeClockEntity> data = new ArrayList<TimeClockEntity>();
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-02T06:00"),LocalDateTime.parse("2016-05-02T14:30"), "John Cena", 13.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-02T06:00"),LocalDateTime.parse("2016-05-02T15:00"), "Kobe Bryant", 26.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-02T05:00"),LocalDateTime.parse("2016-05-02T12:00"), "Brad Pitt", 19.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-02T07:00"),LocalDateTime.parse("2016-05-02T16:30"), "Tom Cruise", 13.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-02T10:00"),LocalDateTime.parse("2016-05-02T17:00"), "Jay Chou", 15.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-02T14:00"),LocalDateTime.parse("2016-05-02T23:00"), "Doggy Wang", 17.00));
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-03T06:00"),LocalDateTime.parse("2016-05-03T14:30"), "John Cena", 13.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-03T06:00"),LocalDateTime.parse("2016-05-03T15:00"), "Kobe Bryant", 26.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-03T05:00"),LocalDateTime.parse("2016-05-03T12:00"), "Brad Pitt", 19.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-03T07:00"),LocalDateTime.parse("2016-05-03T16:30"), "Tom Cruise", 13.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-03T10:00"),LocalDateTime.parse("2016-05-03T17:00"), "Jay Chou", 15.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-03T14:00"),LocalDateTime.parse("2016-05-03T23:00"), "Doggy Wang", 17.00));
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-04T06:00"),LocalDateTime.parse("2016-05-04T14:30"), "John Cena", 13.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-04T06:00"),LocalDateTime.parse("2016-05-04T15:00"), "Kobe Bryant", 26.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-04T05:00"),LocalDateTime.parse("2016-05-04T19:00"), "Brad Pitt", 19.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-04T07:00"),LocalDateTime.parse("2016-05-04T16:30"), "Tom Cruise", 13.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-04T10:00"),LocalDateTime.parse("2016-05-04T17:00"), "Jay Chou", 15.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-04T14:00"),LocalDateTime.parse("2016-05-04T23:00"), "Doggy Wang", 17.00));
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-05T06:00"),LocalDateTime.parse("2016-05-05T14:30"), "John Cena", 13.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-05T06:00"),LocalDateTime.parse("2016-05-05T15:00"), "Kobe Bryant", 26.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-05T05:00"),LocalDateTime.parse("2016-05-05T12:00"), "Brad Pitt", 19.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-05T07:00"),LocalDateTime.parse("2016-05-05T16:30"), "Tom Cruise", 13.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-05T10:00"),LocalDateTime.parse("2016-05-05T23:00"), "Jay Chou", 15.00)); 
		data.add(new TimeClockEntity(19766L,LocalDateTime.parse("2016-05-05T14:00"),LocalDateTime.parse("2016-05-05T23:00"), "Doggy Wang", 17.00));
		return  data;
	}
}
