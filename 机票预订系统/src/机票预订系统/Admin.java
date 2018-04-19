package 机票预订系统;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Admin {
	private String userName;
	private String password;

	public Admin() {
		super();
	}

	public Admin(String uname, String pword) {
		userName = uname;
		password = pword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static ArrayList<Flight> flight = new ArrayList<Flight>();

	public static void initialFlightData() {
		Time t1 = new Time(8);
		Time t2 = new Time(11);
		Time t3 = new Time(14);
		Time t4 = new Time(17);
		Time t5 = new Time(20);
		Time t6 = new Time(23);
		Date d1 = new Date(2017, 6, 3);
		Date d2 = new Date(2017, 6, 4);
		Date d3 = new Date(2017, 6, 5);
		Date d4 = new Date(2017, 5, 16);

		Flight f1 = new Flight("SZ0011", t1, t4, City.Shenzhen, City.NewYork, City.Beijing, d1, 800, 1500, 0,
				Company.CA, Flight.FlightStatus.AVAILABLE);
		Flight f2 = new Flight("SZ0022", t2, t5, City.Shenzhen, City.Beijing, City.Shanghai, d1, 700, 1500, 0,
				Company.HU, Flight.FlightStatus.AVAILABLE);
		Flight f3 = new Flight("SZ0013", t1, t4, City.Shenzhen, City.London, City.Beijing, d2, 800, 1500, 0, Company.MU,
				Flight.FlightStatus.AVAILABLE);
		Flight f4 = new Flight("SZ0024", t2, t5, City.Shenzhen, City.Beijing, City.Shanghai, d2, 700, 1500, 0,
				Company.HU, Flight.FlightStatus.AVAILABLE);
		Flight f5 = new Flight("SZ0015", t1, t4, City.Shenzhen, null, City.Beijing, d3, 800, 1500, 0, Company.CZ,
				Flight.FlightStatus.AVAILABLE);
		Flight f6 = new Flight("SZ0026", t2, t5, City.Shenzhen, null, City.Shanghai, d3, 700, 1500, 0, Company.HU,
				Flight.FlightStatus.AVAILABLE);
		Flight f7 = new Flight("BJ0011", t1, t4, City.Beijing, null, City.Shenzhen, d1, 1000, 1500, 0, Company.ZH,
				Flight.FlightStatus.AVAILABLE);
		Flight f8 = new Flight("BJ0022", t2, t5, City.Beijing, null, City.Shanghai, d1, 600, 1500, 0, Company.CZ,
				Flight.FlightStatus.AVAILABLE);
		Flight f9 = new Flight("BJ0013", t1, t4, City.Beijing, null, City.Shenzhen, d2, 1000, 1500, 0, Company.CA,
				Flight.FlightStatus.AVAILABLE);
		Flight f10 = new Flight("BJ0024", t2, t5, City.Beijing, City.Shenzhen, City.Shanghai, d2, 600, 1500, 0,
				Company.ZH, Flight.FlightStatus.UNPUBLISHED);
		Flight f11 = new Flight("BJ0015", t1, t4, City.Beijing, City.Shanghai, City.Shenzhen, d3, 1000, 1500, 0,
				Company.MU, Flight.FlightStatus.UNPUBLISHED);
		Flight f12 = new Flight("BJ0026", t2, t5, City.Beijing, null, City.Shanghai, d3, 600, 1500, 0, Company.HU,
				Flight.FlightStatus.AVAILABLE);
		Flight f13 = new Flight("SH0011", t1, t4, City.Shanghai, null, City.Shenzhen, d1, 1200, 1500, 0, Company.ZH,
				Flight.FlightStatus.AVAILABLE);
		Flight f14 = new Flight("SH0022", t3, t6, City.Shanghai, City.Shenzhen, City.Beijing, d1, 800, 1500, 0,
				Company.CZ, Flight.FlightStatus.AVAILABLE);
		Flight f15 = new Flight("SH0013", t1, t4, City.Shanghai, null, City.Shenzhen, d2, 1200, 1500, 0, Company.HU,
				Flight.FlightStatus.AVAILABLE);
		Flight f16 = new Flight("SH0024", t3, t6, City.Shanghai, null, City.Beijing, d2, 800, 1500, 0, Company.CA,
				Flight.FlightStatus.AVAILABLE);
		Flight f17 = new Flight("SH0015", t1, t4, City.Shanghai, null, City.Shenzhen, d3, 1200, 1500, 0, Company.ZH,
				Flight.FlightStatus.AVAILABLE);
		Flight f18 = new Flight("SH0026", t3, t6, City.Shanghai, City.Shenzhen, City.Beijing, d3, 800, 1500, 0,
				Company.MU, Flight.FlightStatus.UNPUBLISHED);
		Flight f19 = new Flight("NY0026", t2, t5, City.NewYork, City.Beijing, City.Shanghai, d3, 2600, 1500, 0,
				Company.CZ, Flight.FlightStatus.AVAILABLE);
		Flight f20 = new Flight("LD0011", t1, t4, City.London, City.Shanghai, City.Shenzhen, d1, 2200, 1500, 0,
				Company.ZH, Flight.FlightStatus.AVAILABLE);
		Flight f21 = new Flight("SH0033", t3, t6, City.Shanghai, City.Beijing, City.NewYork, d2, 2800, 1500, 0,
				Company.HU, Flight.FlightStatus.UNPUBLISHED);
		Flight f22 = new Flight("LD0013", t1, t4, City.London, City.Shanghai, City.Shenzhen, d3, 3000, 1500, 0,
				Company.CA, Flight.FlightStatus.AVAILABLE);
		Flight f23 = new Flight("NY0024", t3, t6, City.NewYork, City.Shanghai, City.Beijing, d2, 800, 1500, 0,
				Company.ZH, Flight.FlightStatus.AVAILABLE);
		Flight f24 = new Flight("NY0015", t1, t4, City.NewYork, City.Shanghai, City.Shenzhen, d1, 3200, 1500, 0,
				Company.MU, Flight.FlightStatus.AVAILABLE);
		Flight f25 = new Flight("SH0036", t3, t6, City.Shanghai, City.Shenzhen, City.London, d4, 2800, 1500, 0,
				Company.CZ, Flight.FlightStatus.TERMINATE);

		flight.add(f1);
		flight.add(f2);
		flight.add(f3);
		flight.add(f4);
		flight.add(f5);
		flight.add(f6);
		flight.add(f7);
		flight.add(f8);
		flight.add(f9);
		flight.add(f10);
		flight.add(f11);
		flight.add(f12);
		flight.add(f13);
		flight.add(f14);
		flight.add(f15);
		flight.add(f16);
		flight.add(f17);
		flight.add(f18);
		flight.add(f19);
		flight.add(f20);
		flight.add(f21);
		flight.add(f22);
		flight.add(f23);
		flight.add(f24);
		flight.add(f25);

		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightStatus().equals(Flight.FlightStatus.AVAILABLE)) {
				// 在此区分是否满定
				if ((flight.get(i).getDepartureDate().getYear() == year
						&& flight.get(i).getDepartureDate().getMonth() == month
						&& flight.get(i).getDepartureDate().getDay() == date
						&& flight.get(i).getStartTime().getHour() < (hour + 2))
						|| (flight.get(i).getDepartureDate().getYear() == year
								&& flight.get(i).getDepartureDate().getMonth() == month
								&& flight.get(i).getDepartureDate().getDay() == date
								&& flight.get(i).getStartTime().getHour() == (hour + 2)
								&& flight.get(i).getStartTime().getMinute() < minute)
						|| (flight.get(i).getDepartureDate().getYear() == year
								&& flight.get(i).getDepartureDate().getMonth() == month
								&& flight.get(i).getDepartureDate().getDay() == date
								&& flight.get(i).getStartTime().getHour() == (hour + 2)
								&& flight.get(i).getStartTime().getMinute() == minute
								&& flight.get(i).getStartTime().getSecond() < second)) {
					flight.get(i).setFlightStatus(Flight.FlightStatus.TERMINATE);

				}
			}
		}
	}

	// 当前时间
	static Calendar c1 = Calendar.getInstance();

	static int year = c1.get(Calendar.YEAR);
	static int month = c1.get(Calendar.MONTH);
	static int date = c1.get(Calendar.DATE);
	static int hour = c1.get(Calendar.HOUR_OF_DAY);
	static int minute = c1.get(Calendar.MINUTE);
	static int second = c1.get(Calendar.SECOND);
	static Scanner input = new Scanner(System.in);

	// 管理员登陆
	public boolean adminLogin() {
		boolean flag = false;
		do {
			System.out.println("请输入您的用户名");
			String username = input.next();
			System.out.println("请输入您的密码");
			String password = input.next();
			for (int i = 0; i < mana.size(); i++) {
				if (mana.get(i).getUserName().equals(username) && mana.get(i).getPassword().equals(password)) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("错误，请重新输入");
		} while (!flag);

		return flag;
	}

	// 发布航班
	public static void claimFlight() {
		System.out.println("以下是未发布的航班");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (flight.get(i).getFlightStatus() == Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入需要发布的航班号：");
		Scanner scanner = new Scanner(System.in);
		String claimNo = scanner.next();

		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightID().equals(claimNo)) {
				flight.get(i).setFlightStatus(Flight.FlightStatus.AVAILABLE);
			}

		}
		System.out.print("发布成功！");

	}

	// 添加航班
	public static void addFlight() {
		City Newscity = null;
		City Newtcity = null;
		City Newacity = null;
		Company Newcom = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入新的航班号：");
		String NewId = scanner.next();
		System.out.print("请输入新的起飞时间：");
		System.out.print("时：");
		int a = scanner.nextInt();
		System.out.print("分：");
		int b = scanner.nextInt();
		System.out.print("秒：");
		int c = scanner.nextInt();
		Time Newstime = new Time(a, b, c);
		System.out.print("请输入新的降落时间：");
		System.out.print("时：");
		int d = scanner.nextInt();
		System.out.print("分：");
		int e = scanner.nextInt();
		System.out.print("秒：");
		int f = scanner.nextInt();
		Time Newatime = new Time(d, e, f);
		System.out.print("请输入新的起飞城市：");
		String s1 = scanner.next();
		Newtcity = City.getCity(s1);
		System.out.print("请输入新的中转城市：");
		String s3 = scanner.next();
		Newscity = City.getCity(s3);
		System.out.print("请输入新的降落城市：");
		String s2 = scanner.next();
		Newacity = City.getCity(s2);
		System.out.print("请输入新的日期：");
		System.out.print("年：");
		int g = scanner.nextInt();
		System.out.print("月：");
		int h = scanner.nextInt();
		System.out.print("日：");
		int i = scanner.nextInt();
		Date Newdate = new Date(g, h, i);
		System.out.print("请输入新的价格：");
		int Newprice = scanner.nextInt();
		System.out.print("请输入新的座位容量：");
		int Newseat = scanner.nextInt();
		System.out.print("请输入新的公司：");
		String s4 = scanner.next();
		Newcom = Company.getCompany(s4);
		Flight fnew = new Flight(NewId, Newstime, Newatime, Newtcity, Newscity, Newacity, Newdate, Newprice, Newseat, 0,
				Newcom, Flight.FlightStatus.UNPUBLISHED);
		if (g < year || (g == year && h < month) || (g == year && h == month && i < date)
				|| (g == year && h == month && i == date && a < (hour + 2))
				|| (g == year && h == month && i == date && a == (hour + 2) && b < minute)
				|| (g == year && h == month && i == date && a == (hour + 2) && b == minute && c < second))
			System.out.print("对不起，航班距离起飞时间太近，无法发布");
		else {
			if (!(Newscity == null) && ((Newscity.equals(Newtcity)) || (Newacity.equals(Newtcity))))
				System.out.print("对不起，中转站不能是始发站或终点站");
			else {
				if (Newtcity == null || Newacity == null)
					System.out.print("对不起，未输入能通航的始发站或终点站");
				else {
					Admin.flight.add(fnew);
					System.out.print("\n航班添加成功！");
				}
			}
		}
	}
	// 修改航班

	public static void modifyflight() {
		System.out.println("目前有以下航班，其中已终止的航班不可修改：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.println("请输入需要修改的航班号：");
		Scanner scanner = new Scanner(System.in);
		String changeNo = scanner.next();
		boolean changeFlag = false;
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightID().equals(changeNo)) {
				System.out.println("找到，信息如下：");
				System.out.println(flight.get(i) + "\n");
				changeFlag = true;
			}

			if (changeFlag) {
				if (flight.get(i).getFlightStatus() == Flight.FlightStatus.UNPUBLISHED) {
					City Newscity = null;
					City Newacity = null;
					City Newtcity = null;
					Company Newcom = null;
					System.out.println("该航班未发布，请输入您需要修改内容的序号");
					System.out.println("1.航班号  2.起飞时间  3.降落时间  4.起飞城市  5.降落城市 6.中转城市 7.起飞日期  8.票价  9.座位容量 10.公司");
					int num = scanner.nextInt();
					switch (num) {
					case 1:
						System.out.println("请输入航班号");
						String NewId = scanner.next();
						flight.get(i).setFlightID(NewId);
						System.out.print("\n修改成功！");
						break;
					case 2:
						System.out.print("请输入新的起飞时间：");
						System.out.print("时：");
						int a = scanner.nextInt();
						System.out.print("分：");
						int b = scanner.nextInt();
						System.out.print("秒：");
						int c = scanner.nextInt();
						Time Newstime = new Time(a, b, c);
						flight.get(i).setStartTime(Newstime);
						System.out.print("\n修改成功！");
						break;
					case 3:
						System.out.print("请输入新的降落时间：");
						System.out.print("时：");
						int d = scanner.nextInt();
						System.out.print("分：");
						int e = scanner.nextInt();
						System.out.print("秒：");
						int f = scanner.nextInt();
						Time Newatime = new Time(d, e, f);
						flight.get(i).setArrivalTime(Newatime);
						System.out.print("\n修改成功！");
						break;
					case 4:
						System.out.print("请输入新的起飞城市：");
						String s1 = scanner.next();
						Newscity = City.getCity(s1);
						if (Newscity == null) {
							System.out.print("对不起，未输入能通航的终点站");
							break;
						} else {
							flight.get(i).setStartcity(Newscity);
							System.out.print("\n修改成功！");
						}
						break;
					case 5:
						System.out.print("请输入新的降落城市：");
						String s2 = scanner.next();
						Newacity = City.getCity(s2);
						if (Newacity == null) {
							System.out.print("对不起，未输入能通航的终点站");
							break;
						} else {
							flight.get(i).setArrivality(Newacity);
							System.out.print("\n修改成功！");
						}
						break;
					case 6:
						System.out.print("请输入新的中转城市：");
						String s3 = scanner.next();
						Newtcity = City.getCity(s3);
						if ((flight.get(i).getStartcity().equals(Newtcity))
								|| (flight.get(i).getArrivality().equals(Newtcity))) {
							System.out.print("对不起，中转站不能是始发站或终点站");
							break;
						} else {
							flight.get(i).setTransfercity(Newtcity);
							System.out.print("\n修改成功！");
						}
						break;
					case 7:
						System.out.print("请输入新的日期：");
						System.out.print("年：");
						int g = scanner.nextInt();
						System.out.print("月：");
						int h = scanner.nextInt();
						System.out.print("日：");
						int j = scanner.nextInt();
						Date newDate = new Date(g, h, j);
						flight.get(i).setDepartureDate(newDate);
						System.out.print("\n修改成功！");
						break;
					case 8:
						System.out.print("请输入新的价格：");
						int newprice = scanner.nextInt();
						flight.get(i).setPrice(newprice);
						System.out.print("\n修改成功！");
						break;
					case 9:
						System.out.print("请输入新的座位容量：");
						int newseat = scanner.nextInt();
						flight.get(i).setSeatCapacity(newseat);
						System.out.print("\n修改成功！");
						break;
					case 10:
						System.out.print("请输入新的公司：");
						String s4 = scanner.next();
						Newcom = Company.getCompany(s4);
						flight.get(i).setCompany(Newcom);
						System.out.print("\n修改成功！");
						break;
					}
					break;
				} else {
					if (flight.get(i).getFlightStatus() == Flight.FlightStatus.TERMINATE) {
						System.out.println("对不起，航班已终止，您不能修改它.");
						break;
					}

					else {
						System.out.print("此航班已发布，您只能修改其价格或容量。\n请选择您要修改的内容：1、价格2、座位容量");
						int a = scanner.nextInt();
						switch (a) {
						case 1:
							System.out.print("请输入新的价格：");
							int Newprice = scanner.nextInt();
							flight.get(i).setPrice(Newprice);
							System.out.print("\n修改成功！");
							break;
						case 2:
							System.out.print("请输入新的座位容量：");
							int Newseat = scanner.nextInt();
							flight.get(i).setSeatCapacity(Newseat);
							System.out.print("\n修改成功！");
							break;
						}
						break;
					}
				}
			}
		}
		if (!changeFlag) {
			System.out.println("没找到！！！请核实输入数据！");
			System.out.println();
		}
	}

	// 删除航班
	public static void deleteflight() {
		System.out.println("目前有以下航班可删除：");
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightStatus() == Flight.FlightStatus.TERMINATE
					|| flight.get(i).getFlightStatus() == Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.println("请输入需要删除的航班号：");
		Scanner scanner1 = new Scanner(System.in);
		String deleteNo = scanner1.next();

		boolean deleteFlag = false;
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightID().equals(deleteNo)) {
				System.out.println("找到，信息如下：");
				System.out.println(flight.get(i) + "\n");
				deleteFlag = true;
			}
			if (deleteFlag) {
				if (flight.get(i).getFlightStatus() == Flight.FlightStatus.TERMINATE
						|| flight.get(i).getFlightStatus() == Flight.FlightStatus.UNPUBLISHED) {
					flight.remove(flight.get(i));
					System.out.println("该航班删除成功！");
				} else {
					System.out.println("航班已发布、现在无法删除航班");
				}
				break;
			}
		}
		if (!deleteFlag) {
			System.out.println("没找到！！！请核实输入数据！");
			System.out.println();
		}
	}

	// 高级查询
	// 查询某一航班预定信息
	public static void queryFlight() {
		System.out.println("目前有以下航班：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入航班号查询：");
		Scanner scanner = new Scanner(System.in);
		String ID = scanner.next();
		boolean findFlag1 = true;// 标记，用来显示是否找到
		for (int i = 0; i < Passenger.allpassenger.size(); i++) {
			for (int j = 0; j < Passenger.allpassenger.get(i).getOrderList().size(); j++) {
				if (Passenger.allpassenger.get(i).getOrderList().get(j).getFlight().getFlightID().equals(ID)) {
					System.out.println(Passenger.allpassenger.get(i).getRealName());
					System.out.println(Passenger.allpassenger.get(i).getIdentityID());
					System.out.println(Passenger.allpassenger.get(i).getOrderList().get(j).getSeat());
					System.out.println(Passenger.allpassenger.get(i).getOrderList().get(j).getCreateDate());
					System.out.println(Passenger.allpassenger.get(i).getOrderList().get(j).getStatus());
					findFlag1 = false;
					System.out.println();
				}
			}
		}
		if (!findFlag1) {
			System.out.println("找到，信息如上所示！");
		}

		if (findFlag1) {
			System.out.println("抱歉，没有乘客预定此航班！");
			System.out.println();
		}
	}

	// 查询订单
	public static void queryOrder() {
		System.out.println("目前有以下航班：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入航班号查询：");
		Scanner scanner = new Scanner(System.in);
		String ID = scanner.next();
		boolean findFlag1 = true;// 标记，用来显示是否找到
		for (int i = 0; i < Passenger.allpassenger.size(); i++) {
			for (int j = 0; j < Passenger.allpassenger.get(i).getOrderList().size(); j++)
				if (Passenger.allpassenger.get(i).getOrderList().get(j).getFlight().getFlightID().equals(ID)) {
					System.out.println(Passenger.allpassenger.get(i).getOrderList().get(j) + "\n");
					findFlag1 = false;
					System.out.println();
				}
		}
		if (!findFlag1) {
			System.out.println("找到，信息如上所示！");
		}
		if (findFlag1) {
			System.out.println("抱歉，没有此订单！");
			System.out.println();
		}
	}

	// 根据起飞城市查询航班
	public static void queryStartCity() {
		System.out.println("目前有以下航班：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入起飞城市查询：");
		Scanner scanner = new Scanner(System.in);
		String findStartCity = scanner.next();
		boolean findFlag1 = true;// 标记，用来显示是否找到
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getStartcity().getCity().equals(findStartCity)) {
				System.out.println(flight.get(i) + "\n");
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
		System.out.println("目前有以下航班：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入到达城市查询：");
		Scanner scanner = new Scanner(System.in);
		String findArrivality = scanner.next();
		boolean findFlag2 = true;// 标记，用来显示是否找到
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getArrivality().getCity().equals(findArrivality)) {
				System.out.println(flight.get(i) + "\n");
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

	// 根据航空公司查询航班
	public static void queryCompany() {
		System.out.println("目前有以下航班：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入航空公司查询：");
		Scanner scanner = new Scanner(System.in);
		String findCompany = scanner.next();
		boolean findFlag2 = true;// 标记，用来显示是否找到
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getCompany().getCompany().equals(findCompany)) {
				System.out.println(flight.get(i) + "\n");
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
		System.out.println("目前有以下航班：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入起飞日期查询：");
		Scanner scanner = new Scanner(System.in);
		String findDepartureDate = scanner.next();
		boolean findFlag3 = true;// 标记，用来显示是否找到
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getDepartureDate().toString().equals(findDepartureDate)) {
				System.out.println(flight.get(i) + "\n");
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
		System.out.println("目前有以下航班：");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("请输入航班号查询：");
		Scanner scanner = new Scanner(System.in);
		String findFlightID = scanner.next();
		boolean findFlag4 = true;// 标记，用来显示是否找到
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightID().contains(findFlightID)) {
				System.out.println(flight.get(i) + "\n");
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

	// 用户管理
	public static ArrayList<Admin> mana = new ArrayList<Admin>();

	public static void initialAdminData() {
		Admin a1 = new Admin("admin", "admin");
		mana.add(a1);
	}

	// 创建新管理员
	public void userManagement() {
		System.out.println("1.添加管理员\t2.更新自己信息\n请输入1或2进行选择：");

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		switch (m) {
		case 1:
			System.out.print("创建新管理员\n");
			System.out.print("请输入新的管理员用户名：");
			String AdminNo2 = scanner.next();
			System.out.print("请输入新的密码：");
			String AdimnKey2 = scanner.next();
			Admin anew = new Admin(AdminNo2, AdimnKey2);
			Admin.mana.add(anew);
			System.out.print("添加完成\n");
			break;
		case 2:
			System.out.print("修改您的信息\n");
			System.out.print("请输入新的用户名：");
			String AdminNo1 = scanner.next();
			userName = AdminNo1;
			System.out.print("请输入新的密码：");
			String AdimnKey1 = scanner.next();
			password = AdimnKey1;
			System.out.print("更新完成\n");
			break;
		default:
			System.out.print("输入错误");
			break;
		}
	}
}
