package 机票预订系统;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Passenger {
	private int passengerID;
	private String realName;
	private String identityID;
	private String password;
	// 当前时间
	static Calendar c1 = Calendar.getInstance();

	static int year = c1.get(Calendar.YEAR);
	static int month = c1.get(Calendar.MONTH) + 1;
	static int date = c1.get(Calendar.DATE);
	static int hour = c1.get(Calendar.HOUR_OF_DAY);
	static int minute = c1.get(Calendar.MINUTE);
	static int second = c1.get(Calendar.SECOND);
	static Date nowday = new Date(year, month, date);

	public Passenger(int passengerID, String identityID, String realName, String password) {
		this.passengerID = passengerID;
		this.identityID = identityID;
		this.realName = realName;
		this.password = password;
	}

	public int getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdentityID() {
		return identityID;
	}

	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	ArrayList<Order> orderList = new ArrayList<Order>();
	static Scanner input = new Scanner(System.in);
	static ArrayList<Passenger> allpassenger = new ArrayList<Passenger>();
	String realname;

	public static void register() {
		String password1, password2;
		String realname;
		int passengerID = allpassenger.size() + 1;
		System.out.printf("您的编号为：%d\n", passengerID);
		System.out.println("请输入您的真实姓名:");
		realname = input.next();
		System.out.println("请输入您的身份证号:");
		String identityID = input.next();
		do {
			System.out.println("请输入您的密码");
			password1 = input.next();
			System.out.println("请再次输入密码");
			password2 = input.next();
			if (!password1.equals(password2))
				System.out.println("错误，请重新输入");
		} while (!password1.equals(password2));
		System.out.println("你好， " + realname);
		Passenger passenger = new Passenger(passengerID, identityID, realname, password1);
		allpassenger.add(passenger);
	}

	// 登陆乘客用户名
	public static boolean passengerLogin() {
		boolean flag = false;
		do {
			System.out.println("请输入您的编号");
			int passengerID = input.nextInt();
			System.out.println("请输入您的密码");
			String password = input.next();
			for (int i = 0; i < allpassenger.size(); i++) {
				if (passengerID == allpassenger.get(i).getPassengerID()
						&& allpassenger.get(i).getPassword().equals(password)) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("错误，请重新输入");
		} while (!flag);

		return flag;
	}

	public static void queryStartCity() {
		System.out.println("目前有以下航班已发布：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入起飞城市查询：");
		Scanner scanner = new Scanner(System.in);
		String findStartCity = scanner.next();
		boolean findFlag1 = true;// 标记，用来显示是否找到
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getStartcity().getCity().equals(findStartCity)
					&& Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED) {
				System.out.println(Admin.flight.get(i) + "\n");
				findFlag1 = false;
				System.out.println();
			}
		}
		if (!findFlag1) {
			System.out.println("找到，信息如上所示！");
		}
		if (findFlag1) {
			System.out.println("抱歉，没有此航班！");
			System.out.println();
		}
	}

	// 根据到达城市查询航班
	public static void queryArrivality() {
		System.out.println("目前有以下航班已发布：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入到达城市查询：");
		Scanner scanner = new Scanner(System.in);
		String findArrivality = scanner.next();
		boolean findFlag2 = true;// 标记，用来显示是否找到
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getArrivality().getCity().equals(findArrivality)
					&& Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED) {
				System.out.println(Admin.flight.get(i) + "\n");
				findFlag2 = false;
				System.out.println();
			}
		}
		if (!findFlag2) {
			System.out.println("找到，信息如上所示！");
		}
		if (findFlag2) {
			System.out.println("抱歉，没有此航班！");
			System.out.println();
		}
	}

	// 根据起飞日期查询航班
	public static void queryDepartureDate() {
		System.out.println("目前有以下航班已发布：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入起飞日期查询：");
		Scanner scanner = new Scanner(System.in);
		String findDepartureDate = scanner.next();
		boolean findFlag3 = true;// 标记，用来显示是否找到
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getDepartureDate().toString().equals(findDepartureDate)
					&& Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED) {
				System.out.println(Admin.flight.get(i));
				findFlag3 = false;
				System.out.println();
			}
		}
		if (!findFlag3) {
			System.out.println("找到，信息如上所示！");
		}
		if (findFlag3) {
			System.out.println("抱歉，没有此航班！");
			System.out.println();
		}
	}

	// 根据航班号查询航班
	public static void queryFlightID() {
		System.out.println("目前有以下航班已发布：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入航班号查询：");
		Scanner scanner = new Scanner(System.in);
		String findFlightID = scanner.next();
		boolean findFlag4 = true;// 标记，用来显示是否找到
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightID().contains(findFlightID)
					&& Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED) {
				System.out.println(Admin.flight.get(i) + "\n");
				findFlag4 = false;
				System.out.println();
			}
		}
		if (!findFlag4) {
			System.out.println("找到，信息如上所示！");
		}
		if (findFlag4) {
			System.out.println("抱歉，没有此航班！");
			System.out.println();
		}

	}

	// 查询自己的订单
	public void queryOwnOrder() {
		if (orderList.size() == 0)
			System.out.println("您还没有预定航班");
		if (orderList.size() > 0) {
			System.out.println("找到如下航班：");
			for (int i = 0; i < orderList.size(); i++)
				System.out.println(orderList.get(i));
		}
	}

	// 预定航班
	public void reserveFlight() {
		int count = 0;
		boolean flag = false;
		System.out.println("以下是已发布的航班信息：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() == Flight.FlightStatus.AVAILABLE) {
				System.out.println(Admin.flight.get(i));
				count++;
			}
		}
		if (count == 0) {
			System.out.println("目前没有航班被发布：");
		}

		System.out.println("请输入您要预定的航班号：");
		String a = input.next();
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightID().equals(a)) {
				if (Admin.flight.get(i).getFlightStatus() == Flight.FlightStatus.AVAILABLE) {
					flag = true;
					Order o = new Order(this, "seat" + passengerID, Admin.flight.get(i), nowday,
							Order.OrderStatus.UNPAID);
					orderList.add(o);
					System.out.println("是否支付，若已支付输入Y。");
					String a2 = input.next();
					if (a2.equals("Y")) {
						o.setStatus(Order.OrderStatus.PAID);
						Admin.flight.get(i).setCurrentPassengers(Admin.flight.get(i).getCurrentPassengers() + 1);
						System.out.println("预订成功");
						break;
					}
					if (Admin.flight.get(i).getCurrentPassengers() == Admin.flight.get(i).getSeatCapacity()) {
						Admin.flight.get(i).setFlightStatus(Flight.FlightStatus.FULL);
						break;
					}
				}

			}

		}
		if (!flag) {
			System.out.println("航班不存在或未发布");
		}

	}

	// 退订航班
	public void unsubscribeFlight() {
		for (int i = 0; i < orderList.size(); i++) {
			System.out.println(orderList.get(i).getFlight());
		}
		System.out.println("请输入您要退订的航班号：");
		String a = input.next();
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getFlight().getFlightID().equals(a)) {
				orderList.get(i).setStatus(Order.OrderStatus.CANCEL);
				Admin.flight.get(i).setCurrentPassengers(Admin.flight.get(i).getCurrentPassengers() - 1);
				System.out.println("退订成功，退款已返还");
			}
			if (orderList.get(i).getFlight().getCurrentPassengers() == orderList.get(i).getFlight().getSeatCapacity()) {
				orderList.get(i).getFlight().setFlightStatus(Flight.FlightStatus.AVAILABLE);
			}
		}
	}

	@Override
	public String toString() {
		return "[乘客编号：" + passengerID + ", 真实姓名：" + realName + ", 身份证号：" + identityID + "]";
	}
}
