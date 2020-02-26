
public class Time {
	
	
	private int hour; //private 같은 클래스 내에서만 가능
	int minute;
	int second;
	
	//source -> generate getter and setter
	
	public int getHour() { //getHour 읽기만 가능
		return hour;
	}
	public void setHour(int hour) { //setHour 읽기,쓰기 다 가능
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	
	
	
	

}
