package ��ƱԤ��ϵͳ;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Passenger {
	private int passengerID;
	private String realName;
	private String identityID;
	private String password;
	// ��ǰʱ��
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
		System.out.printf("���ı��Ϊ��%d\n", passengerID);
		System.out.println("������������ʵ����:");
		realname = input.next();
		System.out.println("�������������֤��:");
		String identityID = input.next();
		do {
			System.out.println("��������������");
			password1 = input.next();
			System.out.println("���ٴ���������");
			password2 = input.next();
			if (!password1.equals(password2))
				System.out.println("��������������");
		} while (!password1.equals(password2));
		System.out.println("��ã� " + realname);
		Passenger passenger = new Passenger(passengerID, identityID, realname, password1);
		allpassenger.add(passenger);
	}

	// ��½�˿��û���
	public static boolean passengerLogin() {
		boolean flag = false;
		do {
			System.out.println("���������ı��");
			int passengerID = input.nextInt();
			System.out.println("��������������");
			String password = input.next();
			for (int i = 0; i < allpassenger.size(); i++) {
				if (passengerID == allpassenger.get(i).getPassengerID()
						&& allpassenger.get(i).getPassword().equals(password)) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("��������������");
		} while (!flag);

		return flag;
	}

	public static void queryStartCity() {
		System.out.println("Ŀǰ�����º����ѷ�����");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("��������ɳ��в�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findStartCity = scanner.next();
		boolean findFlag1 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getStartcity().getCity().equals(findStartCity)
					&& Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED) {
				System.out.println(Admin.flight.get(i) + "\n");
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
		System.out.println("Ŀǰ�����º����ѷ�����");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("�����뵽����в�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findArrivality = scanner.next();
		boolean findFlag2 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getArrivality().getCity().equals(findArrivality)
					&& Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED) {
				System.out.println(Admin.flight.get(i) + "\n");
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
		System.out.println("Ŀǰ�����º����ѷ�����");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("������������ڲ�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findDepartureDate = scanner.next();
		boolean findFlag3 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getDepartureDate().toString().equals(findDepartureDate)
					&& Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED) {
				System.out.println(Admin.flight.get(i));
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
		System.out.println("Ŀǰ�����º����ѷ�����");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED)
				System.out.println(Admin.flight.get(i));
		}
		System.out.print("�����뺽��Ų�ѯ��");
		Scanner scanner = new Scanner(System.in);
		String findFlightID = scanner.next();
		boolean findFlag4 = true;// ��ǣ�������ʾ�Ƿ��ҵ�
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightID().contains(findFlightID)
					&& Admin.flight.get(i).getFlightStatus() != Flight.FlightStatus.UNPUBLISHED) {
				System.out.println(Admin.flight.get(i) + "\n");
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

	// ��ѯ�Լ��Ķ���
	public void queryOwnOrder() {
		if (orderList.size() == 0)
			System.out.println("����û��Ԥ������");
		if (orderList.size() > 0) {
			System.out.println("�ҵ����º��ࣺ");
			for (int i = 0; i < orderList.size(); i++)
				System.out.println(orderList.get(i));
		}
	}

	// Ԥ������
	public void reserveFlight() {
		int count = 0;
		boolean flag = false;
		System.out.println("�������ѷ����ĺ�����Ϣ��");
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightStatus() == Flight.FlightStatus.AVAILABLE) {
				System.out.println(Admin.flight.get(i));
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Ŀǰû�к��౻������");
		}

		System.out.println("��������ҪԤ���ĺ���ţ�");
		String a = input.next();
		for (int i = 0; i < Admin.flight.size(); i++) {
			if (Admin.flight.get(i).getFlightID().equals(a)) {
				if (Admin.flight.get(i).getFlightStatus() == Flight.FlightStatus.AVAILABLE) {
					flag = true;
					Order o = new Order(this, "seat" + passengerID, Admin.flight.get(i), nowday,
							Order.OrderStatus.UNPAID);
					orderList.add(o);
					System.out.println("�Ƿ�֧��������֧������Y��");
					String a2 = input.next();
					if (a2.equals("Y")) {
						o.setStatus(Order.OrderStatus.PAID);
						Admin.flight.get(i).setCurrentPassengers(Admin.flight.get(i).getCurrentPassengers() + 1);
						System.out.println("Ԥ���ɹ�");
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
			System.out.println("���಻���ڻ�δ����");
		}

	}

	// �˶�����
	public void unsubscribeFlight() {
		for (int i = 0; i < orderList.size(); i++) {
			System.out.println(orderList.get(i).getFlight());
		}
		System.out.println("��������Ҫ�˶��ĺ���ţ�");
		String a = input.next();
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getFlight().getFlightID().equals(a)) {
				orderList.get(i).setStatus(Order.OrderStatus.CANCEL);
				Admin.flight.get(i).setCurrentPassengers(Admin.flight.get(i).getCurrentPassengers() - 1);
				System.out.println("�˶��ɹ����˿��ѷ���");
			}
			if (orderList.get(i).getFlight().getCurrentPassengers() == orderList.get(i).getFlight().getSeatCapacity()) {
				orderList.get(i).getFlight().setFlightStatus(Flight.FlightStatus.AVAILABLE);
			}
		}
	}

	@Override
	public String toString() {
		return "[�˿ͱ�ţ�" + passengerID + ", ��ʵ������" + realName + ", ���֤�ţ�" + identityID + "]";
	}
}
