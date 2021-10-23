package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String registeredCpf = "123.456.789-00";
		String registeredPassword = "01020304";
		char resp = 0;
		String randomPassword = "";
		int menuChoice = 0;
		double balance = 1000.0;
		double deposit = 0.0;
		double withdraw = 0.0;

		System.out.printf("Bem-vindo(a) ao caixa eletrônico feito em JAVA%n%n");

		System.out.print("Informe um CPF: ");
		String randomCpf = sc.nextLine();

		if (randomCpf.equals(registeredCpf)) {
			System.out.print("Informe a senha: ");
			randomPassword = sc.nextLine();
			if (randomPassword.equals(registeredPassword)) {
				System.out.println("Escolha uma das opções: " + 
						"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
				menuChoice = sc.nextInt();
				sc.nextLine();
					if(menuChoice == 1) {
						System.out.printf("Saldo disponível: %.2f%n", balance);
						System.out.print("Deseja realizar uma nova operação (s/n)? ");
						resp = sc.next().charAt(resp);
						if(resp == 's' || resp == 'S') {
							do {
								System.out.println("Escolha uma das opções: " + 
										"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
								menuChoice = sc.nextInt();
								sc.nextLine();
								
								if(menuChoice < 0 || menuChoice > 3) {
									System.out.printf("Opção inválida%n");
								}
								else if(menuChoice == 0) {
									System.out.print("Volte sempre.");
									System.exit(0);
								}
								else if(menuChoice == 1) {
									System.out.printf("Saldo disponível: %.2f%n", balance);
								}
								else if(menuChoice == 2) {
									System.out.print("Informe um valor para depósito: ");
									deposit = sc.nextDouble();
									sc.nextLine();
									balance += deposit;
									System.out.printf("Saldo atualizado: %.2f%n", balance);
								}
								else if(menuChoice == 3) {
									System.out.print("Informe um valor para saque: ");
									withdraw = sc.nextDouble();
									sc.nextLine();
									balance -= withdraw;
									System.out.printf("Saldo atualizado: %.2f%n", balance);
								}
								resp = 0;
								System.out.print("Deseja realizar uma nova operação (s/n)? ");
								resp = sc.next().charAt(resp);
								
							}while(resp == 's' || resp == 'S');
							System.out.print("Volte sempre.");
							System.exit(0);
						}
						else {
							System.out.print("Volte sempre.");
							System.exit(0);
						}
					}
					else if(menuChoice == 2) {
						System.out.print("Informe um valor para depósito: ");
						deposit = sc.nextDouble();
						sc.nextLine();
						balance += deposit;
						System.out.printf("Saldo atualizado: %.2f%n", balance);
						System.out.print("Deseja realizar uma nova operação (s/n)? ");
						resp = sc.next().charAt(resp);
						if(resp == 's' || resp == 'S') {
							do {
								System.out.println("Escolha uma das opções: " + 
										"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
								menuChoice = sc.nextInt();
								sc.nextLine();
								
								if(menuChoice < 0 || menuChoice > 3) {
									System.out.printf("Opção inválida%n");
								}
								else if(menuChoice == 0) {
									System.out.print("Volte sempre.");
									System.exit(0);
								}
								else if(menuChoice == 1) {
									System.out.printf("Saldo disponível: %.2f%n", balance);
								}
								else if(menuChoice == 2) {
									System.out.print("Informe um valor para depósito: ");
									deposit = sc.nextDouble();
									sc.nextLine();
									balance += deposit;
									System.out.printf("Saldo atualizado: %.2f%n", balance);
								}
								else if(menuChoice == 3) {
									System.out.print("Informe um valor para saque: ");
									withdraw = sc.nextDouble();
									sc.nextLine();
									balance -= withdraw;
									System.out.printf("Saldo atualizado: %.2f%n", balance);
								}
								resp = 0;
								System.out.print("Deseja realizar uma nova operação (s/n)? ");
								resp = sc.next().charAt(resp);
								
							}while(resp == 's' || resp == 'S');
							System.out.print("Volte sempre.");
							System.exit(0);
						}
						else {
							System.out.print("Volte sempre.");
							System.exit(0);
						}
					}
					else if(menuChoice == 3) {
						System.out.print("Informe um valor para saque: ");
						withdraw = sc.nextDouble();
						sc.nextLine();
						balance -= withdraw;
						System.out.printf("Saldo atualizado: %.2f%n", balance);
						System.out.print("Deseja realizar uma nova operação (s/n)? ");
						resp = sc.next().charAt(resp);
						if(resp == 's' || resp == 'S') {
							do {
								System.out.println("Escolha uma das opções: " + 
										"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
								menuChoice = sc.nextInt();
								sc.nextLine();
								
								if(menuChoice < 0 || menuChoice > 3) {
									System.out.printf("Opção inválida%n");
								}
								else if(menuChoice == 0) {
									System.out.print("Volte sempre.");
									System.exit(0);
								}
								else if(menuChoice == 1) {
									System.out.printf("Saldo disponível: %.2f%n", balance);
								}
								else if(menuChoice == 2) {
									System.out.print("Informe um valor para depósito: ");
									deposit = sc.nextDouble();
									sc.nextLine();
									balance += deposit;
									System.out.printf("Saldo atualizado: %.2f%n", balance);
								}
								else if(menuChoice == 3) {
									System.out.print("Informe um valor para saque: ");
									withdraw = sc.nextDouble();
									sc.nextLine();
									balance -= withdraw;
									System.out.printf("Saldo atualizado: %.2f%n", balance);
								}
								resp = 0;
								System.out.print("Deseja realizar uma nova operação (s/n)? ");
								resp = sc.next().charAt(resp);
								
							}while(resp == 's' || resp == 'S');
							System.out.print("Volte sempre.");
							System.exit(0);
						}
						else {
							System.out.print("Volte sempre.");
							System.exit(0);
						}
					}
					else if(menuChoice == 0) {
						System.out.print("Volte sempre.");
						System.exit(0);
					}
			} else {
				System.out.printf("Senha incorreta, 2 tentativas para acessar a conta%n");
				for (int i = 1; i <= 2; i++) {
					System.out.print(i + "° tentativa: ");
					randomPassword = sc.nextLine();
					if (randomPassword.equals(registeredPassword)) {
						System.out.println("Escolha uma das opções: " + 
								"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
						menuChoice = sc.nextInt();
						sc.nextLine();
							if(menuChoice == 1) {
								System.out.printf("Saldo disponível: %.2f%n", balance);
								System.out.print("Deseja realizar uma nova operação (s/n)? ");
								resp = sc.next().charAt(resp);
								if(resp == 's' || resp == 'S') {
									do {
										System.out.println("Escolha uma das opções: " + 
												"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
										menuChoice = sc.nextInt();
										sc.nextLine();
										
										if(menuChoice < 0 || menuChoice > 3) {
											System.out.printf("Opção inválida%n");
										}
										else if(menuChoice == 0) {
											System.out.print("Volte sempre.");
											System.exit(0);
										}
										else if(menuChoice == 1) {
											System.out.printf("Saldo disponível: %.2f%n", balance);
										}
										else if(menuChoice == 2) {
											System.out.print("Informe um valor para depósito: ");
											deposit = sc.nextDouble();
											sc.nextLine();
											balance += deposit;
											System.out.printf("Saldo atualizado: %.2f%n", balance);
										}
										else if(menuChoice == 3) {
											System.out.print("Informe um valor para saque: ");
											withdraw = sc.nextDouble();
											sc.nextLine();
											balance -= withdraw;
											System.out.printf("Saldo atualizado: %.2f%n", balance);
										}
										resp = 0;
										System.out.print("Deseja realizar uma nova operação (s/n)? ");
										resp = sc.next().charAt(resp);
										
									}while(resp == 's' || resp == 'S');
									System.out.print("Volte sempre.");
									System.exit(0);
								}
								else {
									System.out.print("Volte sempre.");
									System.exit(0);
								}
							}
							else if(menuChoice == 2) {
								System.out.print("Informe um valor para depósito: ");
								deposit = sc.nextDouble();
								sc.nextLine();
								balance += deposit;
								System.out.printf("Saldo atualizado: %.2f%n", balance);
								System.out.print("Deseja realizar uma nova operação (s/n)? ");
								resp = sc.next().charAt(resp);
								if(resp == 's' || resp == 'S') {
									do {
										System.out.println("Escolha uma das opções: " + 
												"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
										menuChoice = sc.nextInt();
										sc.nextLine();
										
										if(menuChoice < 0 || menuChoice > 3) {
											System.out.printf("Opção inválida%n");
										}
										else if(menuChoice == 0) {
											System.out.print("Volte sempre.");
											System.exit(0);
										}
										else if(menuChoice == 1) {
											System.out.printf("Saldo disponível: %.2f%n", balance);
										}
										else if(menuChoice == 2) {
											System.out.print("Informe um valor para depósito: ");
											deposit = sc.nextDouble();
											sc.nextLine();
											balance += deposit;
											System.out.printf("Saldo atualizado: %.2f%n", balance);
										}
										else if(menuChoice == 3) {
											System.out.print("Informe um valor para saque: ");
											withdraw = sc.nextDouble();
											sc.nextLine();
											balance -= withdraw;
											System.out.printf("Saldo atualizado: %.2f%n", balance);
										}
										resp = 0;
										System.out.print("Deseja realizar uma nova operação (s/n)? ");
										resp = sc.next().charAt(resp);
										
									}while(resp == 's' || resp == 'S');
									System.out.print("Volte sempre.");
									System.exit(0);
								}
								else {
									System.out.print("Volte sempre.");
									System.exit(0);
								}
							}
							else if(menuChoice == 3) {
								System.out.print("Informe um valor para saque: ");
								withdraw = sc.nextDouble();
								sc.nextLine();
								balance -= withdraw;
								System.out.printf("Saldo atualizado: %.2f%n", balance);
								System.out.print("Deseja realizar uma nova operação (s/n)? ");
								resp = sc.next().charAt(resp);
								if(resp == 's' || resp == 'S') {
									do {
										System.out.println("Escolha uma das opções: " + 
												"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
										menuChoice = sc.nextInt();
										sc.nextLine();
										
										if(menuChoice < 0 || menuChoice > 3) {
											System.out.printf("Opção inválida%n");
										}
										else if(menuChoice == 0) {
											System.out.print("Volte sempre.");
											System.exit(0);
										}
										else if(menuChoice == 1) {
											System.out.printf("Saldo disponível: %.2f%n", balance);
										}
										else if(menuChoice == 2) {
											System.out.print("Informe um valor para depósito: ");
											deposit = sc.nextDouble();
											sc.nextLine();
											balance += deposit;
											System.out.printf("Saldo atualizado: %.2f%n", balance);
										}
										else if(menuChoice == 3) {
											System.out.print("Informe um valor para saque: ");
											withdraw = sc.nextDouble();
											sc.nextLine();
											balance -= withdraw;
											System.out.printf("Saldo atualizado: %.2f%n", balance);
										}
										resp = 0;
										System.out.print("Deseja realizar uma nova operação (s/n)? ");
										resp = sc.next().charAt(resp);
										
									}while(resp == 's' || resp == 'S');
									System.out.print("Volte sempre.");
									System.exit(0);
								}
								else {
									System.out.print("Volte sempre.");
									System.exit(0);
								}
							}
							else if(menuChoice == 0) {
								System.out.print("Volte sempre.");
								System.exit(0);
							}
					}
				}
				System.out.print("0 tentativas restantes, conta bloqueada");
				System.exit(0);
			}
			while (menuChoice < 0 || menuChoice > 3) {
				System.out.print("Opção inválida, tentar novamente (s/n)? ");
				resp = sc.next().charAt(resp);
				if (resp == 's' || resp == 'S') {
					do {
						System.out.println("Escolha uma das opções: " + 
								"1 - Saldo | 2 - Depósito | 3 - Saque | 0 - Sair");
						menuChoice = sc.nextInt();
						sc.nextLine();
						
						if(menuChoice < 0 || menuChoice > 3) {
							System.out.printf("Opção inválida%n");
						}
						else if(menuChoice == 0) {
							System.out.print("Volte sempre.");
							System.exit(0);
						}
						else if(menuChoice == 1) {
							System.out.printf("Saldo disponível: %.2f%n", balance);
						}
						else if(menuChoice == 2) {
							System.out.print("Informe um valor para depósito: ");
							deposit = sc.nextDouble();
							sc.nextLine();
							balance += deposit;
							System.out.printf("Saldo atualizado: %.2f%n", balance);
						}
						else if(menuChoice == 3) {
							System.out.print("Informe um valor para saque: ");
							withdraw = sc.nextDouble();
							sc.nextLine();
							balance -= withdraw;
							System.out.printf("Saldo atualizado: %.2f%n", balance);
						}
						resp = 0;
						System.out.print("Deseja realizar uma nova operação (s/n)? ");
						resp = sc.next().charAt(resp);
						
					}while(resp == 's' || resp == 'S');
					System.out.print("Volte sempre.");
					System.exit(0);
				} else {
					System.out.print("Volte sempre.");
					System.exit(0);
				}
			}
		}
		else {
			System.out.print("CPF não encontrado");
			System.exit(0);
		}
		sc.close();
	}
}
