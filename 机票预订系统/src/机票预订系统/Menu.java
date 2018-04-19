package ��ƱԤ��ϵͳ;

import java.util.Scanner;

/**
 * Copyright (c) <2017-2018> <JAVA GROUP5 by Ning Wentao, Wu Yiqiu, Mao Hui>
 * 
 * @Project Ticket Booking System.
 * @author Ning Wentao, Wu Yiqiu, Mao Hui.
 * 
 *         Permission is hereby granted to obtain a copy of this project code if
 *         you got permission of our group members. But you are not allowed to
 *         redistribute it or copy and paste it into your project directly. You
 *         only can use this code for learning how to do a java project.
 * 
 *         All rights reserved.
 *
 */
public class Menu {
	/**
	 * ��ӡһ���˵�
	 */
	public static void printFirstMenu() {
		// ���һ���˵�
		System.out.println("**********************��ӭʹ�û�ƱԤ��ϵͳ*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.����Ա��½                                                                                   ");
		System.out.println();
		System.out.println(
				"                        2.�˿�ע�ἰ��½                                                                          ");
		System.out.println();
		System.out.println(
				"                        3.��ѯ������Ϣ                                                                                ");
		System.out.println();
		System.out.println(
				"                        4.�˳�                                                                                                  ");
		System.out.println("********************************************************");
		System.out.print("��ѡ��Ҫִ�еĲ�����");
	}

	/**
	 * ����˿͵�½��˵�
	 */
	public static void printPassengerMenu() {

		System.out.println("**********************��ӭʹ�û�ƱԤ��ϵͳ*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.��ѯ�Լ�����                                                                                   ");
		System.out.println();
		System.out.println(
				"                        2.Ԥ������                                                                                     ");
		System.out.println();
		System.out.println(
				"                        3.�˶�����                                                                                        ");
		System.out.println();
		System.out.println(
				"                        4.������һ��                                                                                                  ");
		System.out.println("********************************************************");
		System.out.print("��ѡ��Ҫִ�еĲ�����");
	}

	/**
	 * ���������ѯ�˵�
	 */
	public static void printQueryMenu() {

		System.out.println("**********************��ӭʹ�û�ƱԤ��ϵͳ*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.����ɳ��в�ѯ                                                                                   ");
		System.out.println();
		System.out.println(
				"                        2.��������в�ѯ                                                                                     ");
		System.out.println();
		System.out.println(
				"                        3.����������ѯ                                                                                        ");
		System.out.println();
		System.out.println(
				"                        4.�����չ�˾��ѯ                                                            ");
		System.out.println();
		System.out.println(
				"                        5.������Ų�ѯ                                                            ");
		System.out.println();
		System.out.println(
				"                        6.������һ��                                                                                                  ");
		System.out.println("********************************************************");
		System.out.print("��ѡ��Ҫִ�еĲ�����");
	}

	/**
	 * �������Աһ���˵�
	 */
	public static void printAdmin1Menu() {

		System.out.println("**********************��ӭʹ�û�ƱԤ��ϵͳ*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.��������                                                                                   ");
		System.out.println();
		System.out.println(
				"                        2.�޸ĺ���                                                                                     ");
		System.out.println();
		System.out.println(
				"                        3.ɾ������                                                                                        ");
		System.out.println();
		System.out.println(
				"                        4.��������                                                                                         ");
		System.out.println();
		System.out.println(
				"                        5.����Ա�߼���ѯ                                                                                ");
		System.out.println();
		System.out.println(
				"                        6.�û�����                                                                                        ");
		System.out.println();
		System.out.println(
				"                        7.������һ��                                                                                   ");
		System.out.println("********************************************************");
		System.out.print("��ѡ��Ҫִ�еĲ�����");
	}

	/**
	 * �������Ա�߼���ѯ�˵�
	 */
	public static void printAdmin2Menu() {

		System.out.println("**********************��ӭʹ�û�ƱԤ��ϵͳ*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.����ɳ��в�ѯ                                                                           ");
		System.out.println();
		System.out.println(
				"                        2.��������в�ѯ                                                                           ");
		System.out.println();
		System.out.println(
				"                        3.��������ڲ�ѯ                                                                           ");
		System.out.println();
		System.out.println(
				"                        4.�����չ�˾��ѯ                                                            ");
		System.out.println();
		System.out.println(
				"                        5.��ѯĳһ����Ԥ����Ϣ                                                              ");
		System.out.println();
		System.out.println(
				"                        6.��ѯ����                                                                                       ");
		System.out.println();
		System.out.println(
				"                        7.������Ų�ѯ                                                            ");
		System.out.println();
		System.out.println(
				"                        8.������һ��                                                                                   ");
		System.out.println("********************************************************");
		System.out.print("��ѡ��Ҫִ�еĲ�����");
	}

	public static void main(String[] args) {
		Admin.initialFlightData();
		Admin.initialAdminData();
		Admin a = new Admin();
		boolean f1 = false;// ���λ���ݴ˾����Ƿ��˳�һ���˵�
		Scanner in = new Scanner(System.in);
		while (true) {
			printFirstMenu();
			int i1 = in.nextInt();
			switch (i1) {
			case 1:
				if (a.adminLogin()) {
					boolean f2 = true;
					do {
						printAdmin1Menu();
						int i2 = in.nextInt();
						switch (i2) {
						case 1:
							Admin.addFlight();
							System.out.print("����0������һ�˵�����>:");
							int back1 = in.nextInt();
							if (back1 == 0) {
								break;
							}
							break;
						case 2:
							Admin.modifyflight();
							System.out.print("����0������һ�˵�����>:");
							int back2 = in.nextInt();
							if (back2 == 0) {
								break;
							}
							break;
						case 3:
							Admin.deleteflight();
							System.out.print("����0������һ�˵�����>:");
							int back3 = in.nextInt();
							if (back3 == 0) {
								break;
							}
							break;
						case 4:
							Admin.claimFlight();
							System.out.print("����0������һ�˵�����>:");
							int back4 = in.nextInt();
							if (back4 == 0) {
								break;
							}
							break;
						case 5:
							while (true) {
								printAdmin2Menu();
								boolean f3 = true;
								int i3 = in.nextInt();
								switch (i3) {
								case 1:
									Admin.queryStartCity();
									System.out.print("����0������һ�˵�����>:");
									int back5 = in.nextInt();
									if (back5 == 0) {
										break;
									}
									break;
								case 2:
									Admin.queryArrivality();
									System.out.print("����0������һ�˵�����>:");
									int back6 = in.nextInt();
									if (back6 == 0) {
										break;
									}
									break;
								case 3:
									Admin.queryDepartureDate();
									System.out.print("����0������һ�˵�����>:");
									int back7 = in.nextInt();
									if (back7 == 0) {
										break;
									}
									break;
								case 4:
									Admin.queryCompany();
									System.out.print("����0������һ�˵�����>:");
									int back8 = in.nextInt();
									if (back8 == 0) {
										break;
									}
									break;
								case 5:
									Admin.queryFlight();
									System.out.print("����0������һ�˵�����>:");
									int back9 = in.nextInt();
									if (back9 == 0) {
										break;
									}
									break;
								case 6:
									Admin.queryOrder();
									System.out.print("����0������һ�˵�����>:");
									int back10 = in.nextInt();
									if (back10 == 0) {
										break;
									}
									break;
								case 7:
									Admin.queryFlightID();
									System.out.print("����0������һ�˵�����>:");
									int back11 = in.nextInt();
									if (back11 == 0) {
										break;
									}
									break;
								case 8:
									f3 = false;
									break;
								}
								if (!f3)
									break;
							}
							break;
						case 6:
							a.userManagement();
							System.out.print("����0������һ�˵�����>:");
							int back10 = in.nextInt();
							if (back10 == 0) {
								break;
							}
							break;
						case 7:
							f2 = false;
							break;
						}
						if (!f2)
							break;

					} while (f2);
					break;

				}
				System.out.print("����0������һ�˵�����>:");
				int back12 = in.nextInt();
				if (back12 == 0) {
					break;
				}
				break;

			case 2:
				Passenger.register();
				System.out.println("ע��ɹ������ڵ�¼:");
				if (Passenger.passengerLogin()) {
					System.out.println("��½�ɹ���");
					while (true) {
						boolean f4 = true;
						printPassengerMenu();
						int i4 = in.nextInt();
						switch (i4) {
						case 1:
							Passenger.allpassenger.get(Passenger.allpassenger.size() - 1).queryOwnOrder();
							System.out.print("����0������һ�˵�����>:");
							int back1 = in.nextInt();
							if (back1 == 0) {
								break;
							}
							break;
						case 2:
							Passenger.allpassenger.get(Passenger.allpassenger.size() - 1).reserveFlight();
							System.out.print("����0������һ�˵�����>:");
							int back2 = in.nextInt();
							if (back2 == 0) {
								break;
							}
							break;
						case 3:
							Passenger.allpassenger.get(Passenger.allpassenger.size() - 1).unsubscribeFlight();
							System.out.print("����0������һ�˵�����>:");
							int back3 = in.nextInt();
							if (back3 == 0) {
								break;
							}
							break;
						case 4:
							f4 = false;
							break;
						default:
							break;
						}
						if (!f4)
							break;
					}
				}
				break;
			case 3:
				while (true) {
					printQueryMenu();
					boolean f5 = false;
					int i5 = in.nextInt();
					switch (i5) {
					case 1:
						Passenger.queryStartCity();
						System.out.print("����0������һ�˵�����>:");
						int back1 = in.nextInt();
						if (back1 == 0) {
							break;
						}
						break;
					case 2:
						Passenger.queryArrivality();
						System.out.print("����0������һ�˵�����>:");
						int back2 = in.nextInt();
						if (back2 == 0) {
							break;
						}
						break;
					case 3:
						Passenger.queryDepartureDate();
						System.out.print("����0������һ�˵�����>:");
						int back3 = in.nextInt();
						if (back3 == 0) {
							break;
						}
						break;
					case 4:
						Admin.queryCompany();
						System.out.print("����0������һ�˵�����>:");
						int back4 = in.nextInt();
						if (back4 == 0) {
							break;
						}
						break;
					case 5:
						Passenger.queryFlightID();
						System.out.print("����0������һ�˵�����>:");
						int back5 = in.nextInt();
						if (back5 == 0) {
							break;
						}
						break;
					case 6:
						f5 = true;
						break;
					default:
						break;

					}
					if (f5)
						break;
				}
				break;
			case 4:
				f1 = true;
				break;
			default:
				break;
			}
			if (f1)
				break;

		}
		System.out.println("***********************ллʹ��****************************");
	}
}
