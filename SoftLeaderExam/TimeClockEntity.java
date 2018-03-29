package softLeader;

import java.time.LocalDateTime;

public class TimeClockEntity {
	private long id;
	private LocalDateTime TimeIn;
	private LocalDateTime TimeOut;
	private String empName;
	private double hourWage;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getTimeIn() {
		return TimeIn;
	}
	public void setTimeIn(LocalDateTime timeIn) {
		TimeIn = timeIn;
	}
	public LocalDateTime getTimeOut() {
		return TimeOut;
	}
	public void setTimeOut(LocalDateTime timeOut) {
		TimeOut = timeOut;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getHourWage() {
		return hourWage;
	}
	public void setHourWage(double hourWage) {
		this.hourWage = hourWage;
	}
	public TimeClockEntity(long id, LocalDateTime timeIn, LocalDateTime timeOut, String empName, double hourWage) {
		super();
		this.id = id;
		TimeIn = timeIn;
		TimeOut = timeOut;
		this.empName = empName;
		this.hourWage = hourWage;
	}

}
