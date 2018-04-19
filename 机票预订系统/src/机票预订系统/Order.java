package 机票预订系统;

public class Order {
	
	public enum OrderStatus { UNPAID,  PAID,  CANCEL}//未支付，已支付，已取消。
	
	private Passenger pasenger;
	private String seat;
	private Flight flight;
	private Date createDate;
	private OrderStatus status;
	public Order(Passenger pasenger, String seat, Flight flight, Date createDate, OrderStatus status) {
		super();
		this.pasenger = pasenger;
		this.seat = seat;
		this.flight = flight;
		this.createDate = createDate;
		this.status = status;
	}
	public Passenger getPasenger() {
		return pasenger;
	}
	public void setPasenger(Passenger pasenger) {
		this.pasenger = pasenger;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return " [乘客：" + pasenger + "\n座位号：" + seat + "\n航班：" + flight + "\n创建日期" + createDate
				+ "\n状态：" + status + "]";
	}

}
