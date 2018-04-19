package ��ƱԤ��ϵͳ;

import java.util.ArrayList;

public class Flight {

	public enum FlightStatus {
		UNPUBLISHED, AVAILABLE, FULL, TERMINATE
	}// δ��������Ԥ������������ֹ��

	private String FlightID;
	private Time startTime;
	private Time arrivalTime;
	private City startcity;
	private City transfercity;
	private City arrivality;
	private Date departureDate;
	private int price;
	private int currentPassengers;
	private int seatCapacity;
	private Company company;
	private FlightStatus flightStatus;
	private ArrayList<Passenger> passengers;

	public Flight(String flightID, Time startTime, Time arrivalTime, City startcity,City transfercity, City arrivality,
			Date departureDate, int price, int seatCapacity,int currentPassengers,Company company,FlightStatus flightStatus) {
		FlightID = flightID;
		this.startTime = startTime;
		this.arrivalTime = arrivalTime;
		this.startcity = startcity;
		this.transfercity = transfercity;
		this.arrivality = arrivality;
		this.departureDate = departureDate;
		this.price = price;
		this.seatCapacity = seatCapacity;
		this.currentPassengers = currentPassengers;
		this.company = company;
		this.flightStatus = flightStatus;
	}

	public City getTransfercity() {
		return transfercity;
	}

	public void setTransfercity(City transfercity) {
		this.transfercity = transfercity;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getFlightID() {
		return FlightID;
	}

	public void setFlightID(String flightID) {
		FlightID = flightID;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public City getStartcity() {
		return startcity;
	}

	public void setStartcity(City startcity) {
		this.startcity = startcity;
	}

	public City getArrivality() {
		return arrivality;
	}

	public void setArrivality(City arrivality) {
		this.arrivality = arrivality;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCurrentPassengers() {
		return currentPassengers;
	}

	public void setCurrentPassengers(int currentPassengers) {
		this.currentPassengers = currentPassengers;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public FlightStatus getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "���� [����ţ�" + FlightID + ", ���ʱ�䣺" + startTime + ", ����ʱ�䣺" + arrivalTime
				+ ", ��ɳ��У�" + startcity + ", ��ת���У�" + transfercity + ", ������У�" + arrivality
				+ ", ������ڣ�" + departureDate + ", Ʊ�ۣ�" + price + ", ��ǰԤ��������" + currentPassengers
				+ ", ��λ������" + seatCapacity + ", ���չ�˾��" + company + ", ����״̬��" + flightStatus
				+  "]";
	}

}
