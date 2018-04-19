package ��ƱԤ��ϵͳ;

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
				// �ڴ������Ƿ�����
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

	// ��ǰʱ��
	static Calendar c1 = Calendar.getInstance();

	static int year = c1.get(Calendar.YEAR);
	static int month = c1.get(Calendar.MONTH);
	static int date = c1.get(Calendar.DATE);
	static int hour = c1.get(Calendar.HOUR_OF_DAY);
	static int minute = c1.get(Calendar.MINUTE);
	static int second = c1.get(Calendar.SECOND);
	static Scanner input = new Scanner(System.in);

	// ����Ա��½
	public boolean adminLogin() {
		boolean flag = false;
		do {
			System.out.println("�����������û���");
			String username = input.next();
			System.out.println("��������������");
			String password = input.next();
			for (int i = 0; i < mana.size(); i++) {
				if (mana.get(i).getUserName().equals(username) && mana.get(i).getPassword().equals(password)) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("��������������");
		} while (!flag);

		return flag;
	}

	// ��������
	public static void claimFlight() {
		System.out.println("������δ�����ĺ���");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (flight.get(i).getFlightStatus() == Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("��������Ҫ�����ĺ���ţ�");
		Scanner scanner = new Scanner(System.in);
		String claimNo = scanner.next();

		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightID().equals(claimNo)) {
				flight.get(i).setFlightStatus(Flight.FlightStatus.AVAILABLE);
			}

		}
		System.out.print("�����ɹ���");

	}

	// ��Ӻ���
	public static void addFlight() {
		City Newscity = null;
		City Newtcity = null;
		City Newacity = null;
		Company Newcom = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������µĺ���ţ�");
		String NewId = scanner.next();
		System.out.print("�������µ����ʱ�䣺");
		System.out.print("ʱ��");
		int a = scanner.nextInt();
		System.out.print("�֣�");
		int b = scanner.nextInt();
		System.out.print("�룺");
		int c = scanner.nextInt();
		Time Newstime = new Time(a, b, c);
		System.out.print("�������µĽ���ʱ�䣺");
		System.out.print("ʱ��");
		int d = scanner.nextInt();
		System.out.print("�֣�");
		int e = scanner.nextInt();
		System.out.print("�룺");
		int f = scanner.nextInt();
		Time Newatime = new Time(d, e, f);
		System.out.print("�������µ���ɳ��У�");
		String s1 = scanner.next();
		Newtcity = City.getCity(s1);
		System.out.print("�������µ���ת���У�");
		String s3 = scanner.next();
		Newscity = City.getCity(s3);
		System.out.print("�������µĽ�����У�");
		String s2 = scanner.next();
		Newacity = City.getCity(s2);
		System.out.print("�������µ����ڣ�");
		System.out.print("�꣺");
		int g = scanner.nextInt();
		System.out.print("�£�");
		int h = scanner.nextInt();
		System.out.print("�գ�");
		int i = scanner.nextInt();
		Date Newdate = new Date(g, h, i);
		System.out.print("�������µļ۸�");
		int Newprice = scanner.nextInt();
		System.out.print("�������µ���λ������");
		int Newseat = scanner.nextInt();
		System.out.print("�������µĹ�˾��");
		String s4 = scanner.next();
		Newcom = Company.getCompany(s4);
		Flight fnew = new Flight(NewId, Newstime, Newatime, Newtcity, Newscity, Newacity, Newdate, Newprice, Newseat, 0,
				Newcom, Flight.FlightStatus.UNPUBLISHED);
		if (g < year || (g == year && h < month) || (g == year && h == month && i < date)
				|| (g == year && h == month && i == date && a < (hour + 2))
				|| (g == year && h == month && i == date && a == (hour + 2) && b < minute)
				|| (g == year && h == month && i == date && a == (hour + 2) && b == minute && c < second))
			System.out.print("�Բ��𣬺���������ʱ��̫�����޷�����");
		else {
			if (!(Newscity == null) && ((Newscity.equals(Newtcity)) || (Newacity.equals(Newtcity))))
				System.out.print("�Բ�����תվ������ʼ��վ���յ�վ");
			else {
				if (Newtcity == null || Newacity == null)
					System.out.print("�Բ���δ������ͨ����ʼ��վ���յ�վ");
				else {
					Admin.flight.add(fnew);
					System.out.print("\n������ӳɹ���");
				}
			}
		}
	}
	// �޸ĺ���

	public static void modifyflight() {
		System.out.println("Ŀǰ�����º��࣬��������ֹ�ĺ��಻���޸ģ�");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.println("��������Ҫ�޸ĵĺ���ţ�");
		Scanner scanner = new Scanner(System.in);
		String changeNo = scanner.next();
		boolean changeFlag = false;
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightID().equals(changeNo)) {
				System.out.println("�ҵ�����Ϣ���£�");
				System.out.println(flight.get(i) + "\n");
				changeFlag = true;
			}

			if (changeFlag) {
				if (flight.get(i).getFlightStatus() == Flight.FlightStatus.UNPUBLISHED) {
					City Newscity = null;
					City Newacity = null;
					City Newtcity = null;
					Company Newcom = null;
					System.out.println("�ú���δ����������������Ҫ�޸����ݵ����");
					System.out.println("1.�����  2.���ʱ��  3.����ʱ��  4.��ɳ���  5.������� 6.��ת���� 7.�������  8.Ʊ��  9.��λ���� 10.��˾");
					int num = scanner.nextInt();
					switch (num) {
					case 1:
						System.out.println("�����뺽���");
						String NewId = scanner.next();
						flight.get(i).setFlightID(NewId);
						System.out.print("\n�޸ĳɹ���");
						break;
					case 2:
						System.out.print("�������µ����ʱ�䣺");
						System.out.print("ʱ��");
						int a = scanner.nextInt();
						System.out.print("�֣�");
						int b = scanner.nextInt();
						System.out.print("�룺");
						int c = scanner.nextInt();
						Time Newstime = new Time(a, b, c);
						flight.get(i).setStartTime(Newstime);
						System.out.print("\n�޸ĳɹ���");
						break;
					case 3:
						System.out.print("�������µĽ���ʱ�䣺");
						System.out.print("ʱ��");
						int d = scanner.nextInt();
						System.out.print("�֣�");
						int e = scanner.nextInt();
						System.out.print("�룺");
						int f = scanner.nextInt();
						Time Newatime = new Time(d, e, f);
						flight.get(i).setArrivalTime(Newatime);
						System.out.print("\n�޸ĳɹ���");
						break;
					case 4:
						System.out.print("�������µ���ɳ��У�");
						String s1 = scanner.next();
						Newscity = City.getCity(s1);
						if (Newscity == null) {
							System.out.print("�Բ���δ������ͨ�����յ�վ");
							break;
						} else {
							flight.get(i).setStartcity(Newscity);
							System.out.print("\n�޸ĳɹ���");
						}
						break;
					case 5:
						System.out.print("�������µĽ�����У�");
						String s2 = scanner.next();
						Newacity = City.getCity(s2);
						if (Newacity == null) {
							System.out.print("�Բ���δ������ͨ�����յ�վ");
							break;
						} else {
							flight.get(i).setArrivality(Newacity);
							System.out.print("\n�޸ĳɹ���");
						}
						break;
					case 6:
						System.out.print("�������µ���ת���У�");
						String s3 = scanner.next();
						Newtcity = City.getCity(s3);
						if ((flight.get(i).getStartcity().equals(Newtcity))
								|| (flight.get(i).getArrivality().equals(Newtcity))) {
							System.out.print("�Բ�����תվ������ʼ��վ���յ�վ");
							break;
						} else {
							flight.get(i).setTransfercity(Newtcity);
							System.out.print("\n�޸ĳɹ���");
						}
						break;
					case 7:
						System.out.print("�������µ����ڣ�");
						System.out.print("�꣺");
						int g = scanner.nextInt();
						System.out.print("�£�");
						int h = scanner.nextInt();
						System.out.print("�գ�");
						int j = scanner.nextInt();
						Date newDate = new Date(g, h, j);
						flight.get(i).setDepartureDate(newDate);
						System.out.print("\n�޸ĳɹ���");
						break;
					case 8:
						System.out.print("�������µļ۸�");
						int newprice = scanner.nextInt();
						flight.get(i).setPrice(newprice);
						System.out.print("\n�޸ĳɹ���");
						break;
					case 9:
						System.out.print("�������µ���λ������");
						int newseat = scanner.nextInt();
						flight.get(i).setSeatCapacity(newseat);
						System.out.print("\n�޸ĳɹ���");
						break;
					case 10:
						System.out.print("�������µĹ�˾��");
						String s4 = scanner.next();
						Newcom = Company.getCompany(s4);
						flight.get(i).setCompany(Newcom);
						System.out.print("\n�޸ĳɹ���");
						break;
					}
					break;
				} else {
					if (flight.get(i).getFlightStatus() == Flight.FlightStatus.TERMINATE) {
						System.out.println("�Բ��𣬺�������ֹ���������޸���.");
						break;
					}

					else {
						System.out.print("�˺����ѷ�������ֻ���޸���۸��������\n��ѡ����Ҫ�޸ĵ����ݣ�1���۸�2����λ����");
						int a = scanner.nextInt();
						switch (a) {
						case 1:
							System.out.print("�������µļ۸�");
							int Newprice = scanner.nextInt();
							flight.get(i).setPrice(Newprice);
							System.out.print("\n�޸ĳɹ���");
							break;
						case 2:
							System.out.print("�������µ���λ������");
							int Newseat = scanner.nextInt();
							flight.get(i).setSeatCapacity(Newseat);
							System.out.print("\n�޸ĳɹ���");
							break;
						}
						break;
					}
				}
			}
		}
		if (!changeFlag) {
			System.out.println("û�ҵ����������ʵ�������ݣ�");
			System.out.println();
		}
	}

	// ɾ������
	public static void deleteflight() {
		System.out.println("Ŀǰ�����º����ɾ����");
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightStatus() == Flight.FlightStatus.TERMINATE
					|| flight.get(i).getFlightStatus() == Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.println("��������Ҫɾ���ĺ���ţ�");
		Scanner scanner1 = new Scanner(System.in);
		String deleteNo = scanner1.next();

		boolean deleteFlag = false;
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightID().equals(deleteNo)) {
				System.out.println("�ҵ�����Ϣ���£�");
				System.out.println(flight.get(i) + "\n");
				deleteFlag = true;
			}
			if (deleteFlag) {
				if (flight.get(i).getFlightStatus() == Flight.FlightStatus.TERMINATE
						|| flight.get(i).getFlightStatus() == Flight.FlightStatus.UNPUBLISHED) {
					flight.remove(flight.get(i));
					System.out.println("�ú���ɾ���ɹ���");
				} else {
					System.out.println("�����ѷ����������޷�ɾ������");
				}
				break;
			}
		}
		if (!deleteFlag) {
			System.out.println("û�ҵ����������ʵ�������ݣ�");
			System.out.println();
		}
	}

	// �߼���ѯ
	// ��ѯĳһ����Ԥ����Ϣ
	public static void queryFlight() {
		System.out.println("Ŀǰ�����º��ࣺ");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("�����뺽��Ų�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String ID = scanner.next();
		boolean findFlag1 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
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
			System.out.println("�ҵ�����Ϣ������ʾ��");
		}

		if (findFlag1) {
			System.out.println("��Ǹ��û�г˿�Ԥ���˺��࣡");
			System.out.println();
		}
	}

	// ��ѯ����
	public static void queryOrder() {
		System.out.println("Ŀǰ�����º��ࣺ");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("�����뺽��Ų�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String ID = scanner.next();
		boolean findFlag1 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < Passenger.allpassenger.size(); i++) {
			for (int j = 0; j < Passenger.allpassenger.get(i).getOrderList().size(); j++)
				if (Passenger.allpassenger.get(i).getOrderList().get(j).getFlight().getFlightID().equals(ID)) {
					System.out.println(Passenger.allpassenger.get(i).getOrderList().get(j) + "\n");
					findFlag1 = false;
					System.out.println();
				}
		}
		if (!findFlag1) {
			System.out.println("�ҵ�����Ϣ������ʾ��");
		}
		if (findFlag1) {
			System.out.println("��Ǹ��û�д˶�����");
			System.out.println();
		}
	}

	// ������ɳ��в�ѯ����
	public static void queryStartCity() {
		System.out.println("Ŀǰ�����º��ࣺ");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("��������ɳ��в�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findStartCity = scanner.next();
		boolean findFlag1 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getStartcity().getCity().equals(findStartCity)) {
				System.out.println(flight.get(i) + "\n");
				findFlag1 = false;
				System.out.println();
			}
		}
		if (!findFlag1) {
			System.out.println("�ҵ�����Ϣ������ʾ��");
		}
		if (findFlag1) {
			System.out.println("��Ǹ��û�д˺��࣡");
			System.out.println();
		}
	}

	// ���ݵ�����в�ѯ����
	public static void queryArrivality() {
		System.out.println("Ŀǰ�����º��ࣺ");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("�����뵽����в�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findArrivality = scanner.next();
		boolean findFlag2 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getArrivality().getCity().equals(findArrivality)) {
				System.out.println(flight.get(i) + "\n");
				findFlag2 = false;
				System.out.println();
			}
		}
		if (!findFlag2) {
			System.out.println("�ҵ�����Ϣ������ʾ��");
		}
		if (findFlag2) {
			System.out.println("��Ǹ��û�д˺��࣡");
			System.out.println();
		}
	}

	// ���ݺ��չ�˾��ѯ����
	public static void queryCompany() {
		System.out.println("Ŀǰ�����º��ࣺ");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("�����뺽�չ�˾��ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findCompany = scanner.next();
		boolean findFlag2 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getCompany().getCompany().equals(findCompany)) {
				System.out.println(flight.get(i) + "\n");
				findFlag2 = false;
				System.out.println();
			}
		}
		if (!findFlag2) {
			System.out.println("�ҵ�����Ϣ������ʾ��");
		}
		if (findFlag2) {
			System.out.println("��Ǹ��û�д˺��࣡");
			System.out.println();
		}
	}

	// ����������ڲ�ѯ����
	public static void queryDepartureDate() {
		System.out.println("Ŀǰ�����º��ࣺ");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("������������ڲ�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findDepartureDate = scanner.next();
		boolean findFlag3 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getDepartureDate().toString().equals(findDepartureDate)) {
				System.out.println(flight.get(i) + "\n");
				findFlag3 = false;
				System.out.println();
			}
		}
		if (!findFlag3) {
			System.out.println("�ҵ�����Ϣ������ʾ��");
		}
		if (findFlag3) {
			System.out.println("��Ǹ��û�д˺��࣡");
			System.out.println();
		}
	}

	// ���ݺ���Ų�ѯ����
	public static void queryFlightID() {
		System.out.println("Ŀǰ�����º��ࣺ");
		for (int i = 0; i < Admin.flight.size(); i++) {
			System.out.println(Admin.flight.get(i));
		}
		System.out.print("�����뺽��Ų�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findFlightID = scanner.next();
		boolean findFlag4 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < flight.size(); i++) {
			if (flight.get(i).getFlightID().contains(findFlightID)) {
				System.out.println(flight.get(i) + "\n");
				findFlag4 = false;
				System.out.println();
			}
		}
		if (!findFlag4) {
			System.out.println("�ҵ�����Ϣ������ʾ��");
		}
		if (findFlag4) {
			System.out.println("��Ǹ��û�д˺��࣡");
			System.out.println();
		}
	}

	// �û�����
	public static ArrayList<Admin> mana = new ArrayList<Admin>();

	public static void initialAdminData() {
		Admin a1 = new Admin("admin", "admin");
		mana.add(a1);
	}

	// �����¹���Ա
	public void userManagement() {
		System.out.println("1.��ӹ���Ա\t2.�����Լ���Ϣ\n������1��2����ѡ��");

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		switch (m) {
		case 1:
			System.out.print("�����¹���Ա\n");
			System.out.print("�������µĹ���Ա�û�����");
			String AdminNo2 = scanner.next();
			System.out.print("�������µ����룺");
			String AdimnKey2 = scanner.next();
			Admin anew = new Admin(AdminNo2, AdimnKey2);
			Admin.mana.add(anew);
			System.out.print("������\n");
			break;
		case 2:
			System.out.print("�޸�������Ϣ\n");
			System.out.print("�������µ��û�����");
			String AdminNo1 = scanner.next();
			userName = AdminNo1;
			System.out.print("�������µ����룺");
			String AdimnKey1 = scanner.next();
			password = AdimnKey1;
			System.out.print("�������\n");
			break;
		default:
			System.out.print("�������");
			break;
		}
	}
}
