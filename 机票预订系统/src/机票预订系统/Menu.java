package 机票预订系统;

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
	 * 打印一级菜单
	 */
	public static void printFirstMenu() {
		// 输出一级菜单
		System.out.println("**********************欢迎使用机票预订系统*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.管理员登陆                                                                                   ");
		System.out.println();
		System.out.println(
				"                        2.乘客注册及登陆                                                                          ");
		System.out.println();
		System.out.println(
				"                        3.查询航班信息                                                                                ");
		System.out.println();
		System.out.println(
				"                        4.退出                                                                                                  ");
		System.out.println("********************************************************");
		System.out.print("请选择要执行的操作：");
	}

	/**
	 * 输出乘客登陆后菜单
	 */
	public static void printPassengerMenu() {

		System.out.println("**********************欢迎使用机票预订系统*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.查询自己订单                                                                                   ");
		System.out.println();
		System.out.println(
				"                        2.预定航班                                                                                     ");
		System.out.println();
		System.out.println(
				"                        3.退订航班                                                                                        ");
		System.out.println();
		System.out.println(
				"                        4.返回上一级                                                                                                  ");
		System.out.println("********************************************************");
		System.out.print("请选择要执行的操作：");
	}

	/**
	 * 输出基本查询菜单
	 */
	public static void printQueryMenu() {

		System.out.println("**********************欢迎使用机票预订系统*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.按起飞城市查询                                                                                   ");
		System.out.println();
		System.out.println(
				"                        2.按到达城市查询                                                                                     ");
		System.out.println();
		System.out.println(
				"                        3.按起飞日起查询                                                                                        ");
		System.out.println();
		System.out.println(
				"                        4.按航空公司查询                                                            ");
		System.out.println();
		System.out.println(
				"                        5.按航班号查询                                                            ");
		System.out.println();
		System.out.println(
				"                        6.返回上一级                                                                                                  ");
		System.out.println("********************************************************");
		System.out.print("请选择要执行的操作：");
	}

	/**
	 * 输出管理员一级菜单
	 */
	public static void printAdmin1Menu() {

		System.out.println("**********************欢迎使用机票预订系统*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.创建航班                                                                                   ");
		System.out.println();
		System.out.println(
				"                        2.修改航班                                                                                     ");
		System.out.println();
		System.out.println(
				"                        3.删除航班                                                                                        ");
		System.out.println();
		System.out.println(
				"                        4.发布航班                                                                                         ");
		System.out.println();
		System.out.println(
				"                        5.管理员高级查询                                                                                ");
		System.out.println();
		System.out.println(
				"                        6.用户管理                                                                                        ");
		System.out.println();
		System.out.println(
				"                        7.返回上一级                                                                                   ");
		System.out.println("********************************************************");
		System.out.print("请选择要执行的操作：");
	}

	/**
	 * 输出管理员高级查询菜单
	 */
	public static void printAdmin2Menu() {

		System.out.println("**********************欢迎使用机票预订系统*********************");
		System.out.println("********************************************************");
		System.out.println(
				"                        1.按起飞城市查询                                                                           ");
		System.out.println();
		System.out.println(
				"                        2.按到达城市查询                                                                           ");
		System.out.println();
		System.out.println(
				"                        3.按起飞日期查询                                                                           ");
		System.out.println();
		System.out.println(
				"                        4.按航空公司查询                                                            ");
		System.out.println();
		System.out.println(
				"                        5.查询某一航班预定信息                                                              ");
		System.out.println();
		System.out.println(
				"                        6.查询订单                                                                                       ");
		System.out.println();
		System.out.println(
				"                        7.按航班号查询                                                            ");
		System.out.println();
		System.out.println(
				"                        8.返回上一级                                                                                   ");
		System.out.println("********************************************************");
		System.out.print("请选择要执行的操作：");
	}

	public static void main(String[] args) {
		Admin.initialFlightData();
		Admin.initialAdminData();
		Admin a = new Admin();
		boolean f1 = false;// 标记位，据此决定是否退出一级菜单
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
							System.out.print("输入0返回上一菜单——>:");
							int back1 = in.nextInt();
							if (back1 == 0) {
								break;
							}
							break;
						case 2:
							Admin.modifyflight();
							System.out.print("输入0返回上一菜单——>:");
							int back2 = in.nextInt();
							if (back2 == 0) {
								break;
							}
							break;
						case 3:
							Admin.deleteflight();
							System.out.print("输入0返回上一菜单——>:");
							int back3 = in.nextInt();
							if (back3 == 0) {
								break;
							}
							break;
						case 4:
							Admin.claimFlight();
							System.out.print("输入0返回上一菜单——>:");
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
									System.out.print("输入0返回上一菜单——>:");
									int back5 = in.nextInt();
									if (back5 == 0) {
										break;
									}
									break;
								case 2:
									Admin.queryArrivality();
									System.out.print("输入0返回上一菜单——>:");
									int back6 = in.nextInt();
									if (back6 == 0) {
										break;
									}
									break;
								case 3:
									Admin.queryDepartureDate();
									System.out.print("输入0返回上一菜单——>:");
									int back7 = in.nextInt();
									if (back7 == 0) {
										break;
									}
									break;
								case 4:
									Admin.queryCompany();
									System.out.print("输入0返回上一菜单——>:");
									int back8 = in.nextInt();
									if (back8 == 0) {
										break;
									}
									break;
								case 5:
									Admin.queryFlight();
									System.out.print("输入0返回上一菜单——>:");
									int back9 = in.nextInt();
									if (back9 == 0) {
										break;
									}
									break;
								case 6:
									Admin.queryOrder();
									System.out.print("输入0返回上一菜单——>:");
									int back10 = in.nextInt();
									if (back10 == 0) {
										break;
									}
									break;
								case 7:
									Admin.queryFlightID();
									System.out.print("输入0返回上一菜单——>:");
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
							System.out.print("输入0返回上一菜单——>:");
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
				System.out.print("输入0返回上一菜单——>:");
				int back12 = in.nextInt();
				if (back12 == 0) {
					break;
				}
				break;

			case 2:
				Passenger.register();
				System.out.println("注册成功，现在登录:");
				if (Passenger.passengerLogin()) {
					System.out.println("登陆成功！");
					while (true) {
						boolean f4 = true;
						printPassengerMenu();
						int i4 = in.nextInt();
						switch (i4) {
						case 1:
							Passenger.allpassenger.get(Passenger.allpassenger.size() - 1).queryOwnOrder();
							System.out.print("输入0返回上一菜单——>:");
							int back1 = in.nextInt();
							if (back1 == 0) {
								break;
							}
							break;
						case 2:
							Passenger.allpassenger.get(Passenger.allpassenger.size() - 1).reserveFlight();
							System.out.print("输入0返回上一菜单——>:");
							int back2 = in.nextInt();
							if (back2 == 0) {
								break;
							}
							break;
						case 3:
							Passenger.allpassenger.get(Passenger.allpassenger.size() - 1).unsubscribeFlight();
							System.out.print("输入0返回上一菜单——>:");
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
						System.out.print("输入0返回上一菜单——>:");
						int back1 = in.nextInt();
						if (back1 == 0) {
							break;
						}
						break;
					case 2:
						Passenger.queryArrivality();
						System.out.print("输入0返回上一菜单——>:");
						int back2 = in.nextInt();
						if (back2 == 0) {
							break;
						}
						break;
					case 3:
						Passenger.queryDepartureDate();
						System.out.print("输入0返回上一菜单——>:");
						int back3 = in.nextInt();
						if (back3 == 0) {
							break;
						}
						break;
					case 4:
						Admin.queryCompany();
						System.out.print("输入0返回上一菜单——>:");
						int back4 = in.nextInt();
						if (back4 == 0) {
							break;
						}
						break;
					case 5:
						Passenger.queryFlightID();
						System.out.print("输入0返回上一菜单——>:");
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
		System.out.println("***********************谢谢使用****************************");
	}
}
