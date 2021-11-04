package application;

import java.util.Scanner;

public class Program {
	
	// Autor do algoritmo: Gustavo Yamashita Matimoto

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String registeredCpf = "123.456.789-00";
		String registeredPassword = "01020304";
		char resp = 0;
		char resp2 = 0;
		String randomPassword = "";
		int menuChoice = 0;
		double balance = 1000.0;
		double deposit = 0.0;
		double withdraw = 0.0;
		double transfer = 0.0;
		String randomAccount = "";
		int randomAngency = 0;
		int randomBankNumber = 0;

		System.out.printf("Bem-vindo(a) ao caixa eletrônico feito em JAVA%n%n");

		System.out.print("Informe um CPF: ");
		String randomCpf = sc.nextLine();

		if (randomCpf.equals(registeredCpf)) {
			System.out.print("Informe a senha: ");
			randomPassword = sc.nextLine();
			if (randomPassword.equals(registeredPassword)) {
				System.out.println("Escolha uma das opções: " + 
						"1 - Saldo | 2 - Depósito | 3 - Saque |"
						+ " 4 - Transferência | 0 - Sair");
				menuChoice = sc.nextInt();
				sc.nextLine();
					if(menuChoice == 1) {
						System.out.printf("Saldo disponível: %.2f%n", balance);
						System.out.print("Deseja realizar uma nova operação (s/n)? ");
						resp = sc.next().charAt(resp);
						if(resp == 's' || resp == 'S') {
							do {
								System.out.println("Escolha uma das opções: " + 
										"1 - Saldo | 2 - Depósito | 3 - Saque |"
										+ " 4 - Transferência | 0 - Sair");
								menuChoice = sc.nextInt();
								sc.nextLine();
								
								if(menuChoice < 0 || menuChoice > 4) {
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
									if(withdraw > balance) {
										System.out.printf("Valor para saque excede o saldo em conta.%n");
									}
									else {
										balance -= withdraw;
										System.out.printf("Saldo atualizado: %.2f%n", balance);
									}
								}
								else if(menuChoice == 4) {
									System.out.print("Informe um valor para a transferência: ");
									transfer = sc.nextDouble();
									sc.nextLine();
									System.out.print("Informe a conta de quem irá receber: ");
									randomAccount = sc.nextLine();
									System.out.print("Informe a agência de quem irá receber: ");
									randomAngency = sc.nextInt();
									sc.nextLine();
									System.out.print("Informe o número do banco (padrão: 000): ");
									randomBankNumber = sc.nextInt();
									sc.nextLine();
									System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
											+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
									System.out.print("Os dados estão corretos (s/n)? ");
									resp2 = sc.next().charAt(resp2);
									if(resp2 == 's' || resp == 'S') {
										System.out.printf("Realizado a transferência para a conta %s, "
												+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
									}
									else {
										do {
											resp2 = 0;
											System.out.print("Informe um valor para a transferência: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem irá receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a agência de quem irá receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o número do banco (padrão: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
													+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
											System.out.print("Os dados estão corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
										}while(resp2 == 'n' || resp2 == 'N');
									}
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
										"1 - Saldo | 2 - Depósito | 3 - Saque |"
										+ " 4 - Transferência | 0 - Sair");
								menuChoice = sc.nextInt();
								sc.nextLine();
								
								if(menuChoice < 0 || menuChoice > 4) {
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
									if(withdraw > balance) {
										System.out.printf("Valor para saque excede o saldo em conta.%n");
									}
									else {
										balance -= withdraw;
										System.out.printf("Saldo atualizado: %.2f%n", balance);
									}
								}
								else if(menuChoice == 4) {
									System.out.print("Informe um valor para a transferência: ");
									transfer = sc.nextDouble();
									sc.nextLine();
									System.out.print("Informe a conta de quem irá receber: ");
									randomAccount = sc.nextLine();
									System.out.print("Informe a agência de quem irá receber: ");
									randomAngency = sc.nextInt();
									sc.nextLine();
									System.out.print("Informe o número do banco (padrão: 000): ");
									randomBankNumber = sc.nextInt();
									sc.nextLine();
									System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
											+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
									System.out.print("Os dados estão corretos (s/n)? ");
									resp2 = sc.next().charAt(resp2);
									if(resp2 == 's' || resp == 'S') {
										System.out.printf("Realizado a transferência para a conta %s, "
												+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
									}
									else {
										do {
											resp2 = 0;
											System.out.print("Informe um valor para a transferência: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem irá receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a agência de quem irá receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o número do banco (padrão: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
													+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
											System.out.print("Os dados estão corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
										}while(resp2 == 'n' || resp2 == 'N');
									}
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
						if(withdraw > balance) {
							System.out.printf("Valor para saque excede o saldo em conta.%n");
						}
						else {
							balance -= withdraw;
							System.out.printf("Saldo atualizado: %.2f%n", balance);
						}
						System.out.print("Deseja realizar uma nova operação (s/n)? ");
						resp = sc.next().charAt(resp);
						if(resp == 's' || resp == 'S') {
							do {
								System.out.println("Escolha uma das opções: " + 
										"1 - Saldo | 2 - Depósito | 3 - Saque |"
										+ " 4 - Transferência | 0 - Sair");
								menuChoice = sc.nextInt();
								sc.nextLine();
								
								if(menuChoice < 0 || menuChoice > 4) {
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
									if(withdraw > balance) {
										System.out.printf("Valor para saque excede o saldo em conta.%n");
									}
									else {
										balance -= withdraw;
										System.out.printf("Saldo atualizado: %.2f%n", balance);
									}
								}
								else if(menuChoice == 4) {
									System.out.print("Informe um valor para a transferência: ");
									transfer = sc.nextDouble();
									sc.nextLine();
									System.out.print("Informe a conta de quem irá receber: ");
									randomAccount = sc.nextLine();
									System.out.print("Informe a agência de quem irá receber: ");
									randomAngency = sc.nextInt();
									sc.nextLine();
									System.out.print("Informe o número do banco (padrão: 000): ");
									randomBankNumber = sc.nextInt();
									sc.nextLine();
									System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
											+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
									System.out.print("Os dados estão corretos (s/n)? ");
									resp2 = sc.next().charAt(resp2);
									if(resp2 == 's' || resp == 'S') {
										System.out.printf("Realizado a transferência para a conta %s, "
												+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
									}
									else {
										do {
											resp2 = 0;
											System.out.print("Informe um valor para a transferência: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem irá receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a agência de quem irá receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o número do banco (padrão: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
													+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
											System.out.print("Os dados estão corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
										}while(resp2 == 'n' || resp2 == 'N');
									}
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
					else if(menuChoice == 4) {
						System.out.print("Informe um valor para a transferência: ");
						transfer = sc.nextDouble();
						sc.nextLine();
						System.out.print("Informe a conta de quem irá receber: ");
						randomAccount = sc.nextLine();
						System.out.print("Informe a agência de quem irá receber: ");
						randomAngency = sc.nextInt();
						sc.nextLine();
						System.out.print("Informe o número do banco (padrão: 000): ");
						randomBankNumber = sc.nextInt();
						sc.nextLine();
						System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
								+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
						System.out.print("Os dados estão corretos (s/n)? ");
						resp2 = sc.next().charAt(resp2);
						if(resp2 == 's' || resp2 == 'S') {
							System.out.printf("Realizado a transferência para a conta %s, "
									+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
							System.out.print("Deseja realizar uma nova operação (s/n)? ");
							resp = sc.next().charAt(resp);
							if(resp == 's' || resp == 'S') {
								do {
									System.out.println("Escolha uma das opções: " + 
											"1 - Saldo | 2 - Depósito | 3 - Saque |"
											+ " 4 - Transferência | 0 - Sair");
									menuChoice = sc.nextInt();
									sc.nextLine();
									
									if(menuChoice < 0 || menuChoice > 4) {
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
										if(withdraw > balance) {
											System.out.printf("Valor para saque excede o saldo em conta.%n");
										}
										else {
											balance -= withdraw;
											System.out.printf("Saldo atualizado: %.2f%n", balance);
										}
									}
									else if(menuChoice == 4) {
										System.out.print("Informe um valor para a transferência: ");
										transfer = sc.nextDouble();
										sc.nextLine();
										System.out.print("Informe a conta de quem irá receber: ");
										randomAccount = sc.nextLine();
										System.out.print("Informe a agência de quem irá receber: ");
										randomAngency = sc.nextInt();
										sc.nextLine();
										System.out.print("Informe o número do banco (padrão: 000): ");
										randomBankNumber = sc.nextInt();
										sc.nextLine();
										System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
												+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
										System.out.print("Os dados estão corretos (s/n)? ");
										resp2 = sc.next().charAt(resp2);
										if(resp2 == 's' || resp == 'S') {
											System.out.printf("Realizado a transferência para a conta %s, "
													+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
										}
										else {
											do {
												resp2 = 0;
												System.out.print("Informe um valor para a transferência: ");
												transfer = sc.nextDouble();
												sc.nextLine();
												System.out.print("Informe a conta de quem irá receber: ");
												randomAccount = sc.nextLine();
												System.out.print("Informe a agência de quem irá receber: ");
												randomAngency = sc.nextInt();
												sc.nextLine();
												System.out.print("Informe o número do banco (padrão: 000): ");
												randomBankNumber = sc.nextInt();
												sc.nextLine();
												System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
														+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
												System.out.print("Os dados estão corretos (s/n)? ");
												resp2 = sc.next().charAt(resp2);
											}while(resp2 == 'n' || resp2 == 'N');
										}
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
						else {
							do {
								resp2 = 0;
								System.out.print("Informe um valor para a transferência: ");
								transfer = sc.nextDouble();
								sc.nextLine();
								System.out.print("Informe a conta de quem irá receber: ");
								randomAccount = sc.nextLine();
								System.out.print("Informe a agência de quem irá receber: ");
								randomAngency = sc.nextInt();
								sc.nextLine();
								System.out.print("Informe o número do banco (padrão: 000): ");
								randomBankNumber = sc.nextInt();
								sc.nextLine();
								System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
										+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
								System.out.print("Os dados estão corretos (s/n)? ");
								resp2 = sc.next().charAt(resp2);
								if(resp2 == 's' || resp2 == 'S') {
									System.out.printf("Realizado a transferência para a conta %s, "
											+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
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
												if(withdraw > balance) {
													System.out.printf("Valor para saque excede o saldo em conta.%n");
												}
												else {
													balance -= withdraw;
													System.out.printf("Saldo atualizado: %.2f%n", balance);
												}
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
							}while(resp2 == 'n' || resp2 == 'N');
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
								"1 - Saldo | 2 - Depósito | 3 - Saque |"
								+ " 4 - Transferência | 0 - Sair");
						menuChoice = sc.nextInt();
						sc.nextLine();
							if(menuChoice == 1) {
								System.out.printf("Saldo disponível: %.2f%n", balance);
								System.out.print("Deseja realizar uma nova operação (s/n)? ");
								resp = sc.next().charAt(resp);
								if(resp == 's' || resp == 'S') {
									do {
										System.out.println("Escolha uma das opções: " + 
												"1 - Saldo | 2 - Depósito | 3 - Saque |"
												+ " 4 - Transferência | 0 - Sair");
										menuChoice = sc.nextInt();
										sc.nextLine();
										
										if(menuChoice < 0 || menuChoice > 4) {
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
											if(withdraw > balance) {
												System.out.printf("Valor para saque excede o saldo em conta.%n");
											}
											else {
												balance -= withdraw;
												System.out.printf("Saldo atualizado: %.2f%n", balance);
											}
										}
										else if(menuChoice == 4) {
											System.out.print("Informe um valor para a transferência: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem irá receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a agência de quem irá receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o número do banco (padrão: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
													+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
											System.out.print("Os dados estão corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
											if(resp2 == 's' || resp == 'S') {
												System.out.printf("Realizado a transferência para a conta %s, "
														+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
											}
											else {
												do {
													resp2 = 0;
													System.out.print("Informe um valor para a transferência: ");
													transfer = sc.nextDouble();
													sc.nextLine();
													System.out.print("Informe a conta de quem irá receber: ");
													randomAccount = sc.nextLine();
													System.out.print("Informe a agência de quem irá receber: ");
													randomAngency = sc.nextInt();
													sc.nextLine();
													System.out.print("Informe o número do banco (padrão: 000): ");
													randomBankNumber = sc.nextInt();
													sc.nextLine();
													System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
															+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
													System.out.print("Os dados estão corretos (s/n)? ");
													resp2 = sc.next().charAt(resp2);
												}while(resp2 == 'n' || resp2 == 'N');
											}
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
												"1 - Saldo | 2 - Depósito | 3 - Saque |"
												+ " 4 - Transferência | 0 - Sair");
										menuChoice = sc.nextInt();
										sc.nextLine();
										
										if(menuChoice < 0 || menuChoice > 4) {
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
											if(withdraw > balance) {
												System.out.printf("Valor para saque excede o saldo em conta.%n");
											}
											else {
												balance -= withdraw;
												System.out.printf("Saldo atualizado: %.2f%n", balance);
											}
										}
										else if(menuChoice == 4) {
											System.out.print("Informe um valor para a transferência: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem irá receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a agência de quem irá receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o número do banco (padrão: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
													+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
											System.out.print("Os dados estão corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
											if(resp2 == 's' || resp == 'S') {
												System.out.printf("Realizado a transferência para a conta %s, "
														+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
											}
											else {
												do {
													resp2 = 0;
													System.out.print("Informe um valor para a transferência: ");
													transfer = sc.nextDouble();
													sc.nextLine();
													System.out.print("Informe a conta de quem irá receber: ");
													randomAccount = sc.nextLine();
													System.out.print("Informe a agência de quem irá receber: ");
													randomAngency = sc.nextInt();
													sc.nextLine();
													System.out.print("Informe o número do banco (padrão: 000): ");
													randomBankNumber = sc.nextInt();
													sc.nextLine();
													System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
															+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
													System.out.print("Os dados estão corretos (s/n)? ");
													resp2 = sc.next().charAt(resp2);
												}while(resp2 == 'n' || resp2 == 'N');
											}
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
								if(withdraw > balance) {
									System.out.printf("Valor para saque excede o saldo em conta.%n");
								}
								else {
									balance -= withdraw;
									System.out.printf("Saldo atualizado: %.2f%n", balance);
								}
								System.out.print("Deseja realizar uma nova operação (s/n)? ");
								resp = sc.next().charAt(resp);
								if(resp == 's' || resp == 'S') {
									do {
										System.out.println("Escolha uma das opções: " + 
												"1 - Saldo | 2 - Depósito | 3 - Saque |"
												+ " 4 - Transferência | 0 - Sair");
										menuChoice = sc.nextInt();
										sc.nextLine();
										
										if(menuChoice < 0 || menuChoice > 4) {
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
											if(withdraw > balance) {
												System.out.printf("Valor para saque excede o saldo em conta.%n");
											}
											else {
												balance -= withdraw;
												System.out.printf("Saldo atualizado: %.2f%n", balance);
											}
										}
										else if(menuChoice == 4) {
											System.out.print("Informe um valor para a transferência: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem irá receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a agência de quem irá receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o número do banco (padrão: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
													+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
											System.out.print("Os dados estão corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
											if(resp2 == 's' || resp == 'S') {
												System.out.printf("Realizado a transferência para a conta %s, "
														+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
											}
											else {
												do {
													resp2 = 0;
													System.out.print("Informe um valor para a transferência: ");
													transfer = sc.nextDouble();
													sc.nextLine();
													System.out.print("Informe a conta de quem irá receber: ");
													randomAccount = sc.nextLine();
													System.out.print("Informe a agência de quem irá receber: ");
													randomAngency = sc.nextInt();
													sc.nextLine();
													System.out.print("Informe o número do banco (padrão: 000): ");
													randomBankNumber = sc.nextInt();
													sc.nextLine();
													System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
															+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
													System.out.print("Os dados estão corretos (s/n)? ");
													resp2 = sc.next().charAt(resp2);
												}while(resp2 == 'n' || resp2 == 'N');
											}
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
							else if(menuChoice == 4) {
								System.out.print("Informe um valor para a transferência: ");
								transfer = sc.nextDouble();
								sc.nextLine();
								System.out.print("Informe a conta de quem irá receber: ");
								randomAccount = sc.nextLine();
								System.out.print("Informe a agência de quem irá receber: ");
								randomAngency = sc.nextInt();
								sc.nextLine();
								System.out.print("Informe o número do banco (padrão: 000): ");
								randomBankNumber = sc.nextInt();
								sc.nextLine();
								System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
										+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
								System.out.print("Os dados estão corretos (s/n)? ");
								resp2 = sc.next().charAt(resp2);
								if(resp2 == 's' || resp2 == 'S') {
									System.out.printf("Realizado a transferência para a conta %s, "
											+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
									System.out.print("Deseja realizar uma nova operação (s/n)? ");
									resp = sc.next().charAt(resp);
									if(resp == 's' || resp == 'S') {
										do {
											System.out.println("Escolha uma das opções: " + 
													"1 - Saldo | 2 - Depósito | 3 - Saque |"
													+ " 4 - Transferência | 0 - Sair");
											menuChoice = sc.nextInt();
											sc.nextLine();
											
											if(menuChoice < 0 || menuChoice > 4) {
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
												if(withdraw > balance) {
													System.out.printf("Valor para saque excede o saldo em conta.%n");
												}
												else {
													balance -= withdraw;
													System.out.printf("Saldo atualizado: %.2f%n", balance);
												}
											}
											else if(menuChoice == 4) {
												System.out.print("Informe um valor para a transferência: ");
												transfer = sc.nextDouble();
												sc.nextLine();
												System.out.print("Informe a conta de quem irá receber: ");
												randomAccount = sc.nextLine();
												System.out.print("Informe a agência de quem irá receber: ");
												randomAngency = sc.nextInt();
												sc.nextLine();
												System.out.print("Informe o número do banco (padrão: 000): ");
												randomBankNumber = sc.nextInt();
												sc.nextLine();
												System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
														+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
												System.out.print("Os dados estão corretos (s/n)? ");
												resp2 = sc.next().charAt(resp2);
												if(resp2 == 's' || resp == 'S') {
													System.out.printf("Realizado a transferência para a conta %s, "
															+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
												}
												else {
													do {
														resp2 = 0;
														System.out.print("Informe um valor para a transferência: ");
														transfer = sc.nextDouble();
														sc.nextLine();
														System.out.print("Informe a conta de quem irá receber: ");
														randomAccount = sc.nextLine();
														System.out.print("Informe a agência de quem irá receber: ");
														randomAngency = sc.nextInt();
														sc.nextLine();
														System.out.print("Informe o número do banco (padrão: 000): ");
														randomBankNumber = sc.nextInt();
														sc.nextLine();
														System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
																+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
														System.out.print("Os dados estão corretos (s/n)? ");
														resp2 = sc.next().charAt(resp2);
													}while(resp2 == 'n' || resp2 == 'N');
												}
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
								else {
									do {
										resp2 = 0;
										System.out.print("Informe um valor para a transferência: ");
										transfer = sc.nextDouble();
										sc.nextLine();
										System.out.print("Informe a conta de quem irá receber: ");
										randomAccount = sc.nextLine();
										System.out.print("Informe a agência de quem irá receber: ");
										randomAngency = sc.nextInt();
										sc.nextLine();
										System.out.print("Informe o número do banco (padrão: 000): ");
										randomBankNumber = sc.nextInt();
										sc.nextLine();
										System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
												+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
										System.out.print("Os dados estão corretos (s/n)? ");
										resp2 = sc.next().charAt(resp2);
										if(resp2 == 's' || resp2 == 'S') {
											System.out.printf("Realizado a transferência para a conta %s, "
													+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
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
														if(withdraw > balance) {
															System.out.printf("Valor para saque excede o saldo em conta.%n");
														}
														else {
															balance -= withdraw;
															System.out.printf("Saldo atualizado: %.2f%n", balance);
														}
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
									}while(resp2 == 'n' || resp2 == 'N');
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
			while (menuChoice < 0 || menuChoice > 4) {
				System.out.print("Opção inválida, tentar novamente (s/n)? ");
				resp = sc.next().charAt(resp);
				if (resp == 's' || resp == 'S') {
					do {
						System.out.println("Escolha uma das opções: " + 
								"1 - Saldo | 2 - Depósito | 3 - Saque |"
								+ " 4 - Transferência | 0 - Sair");
						menuChoice = sc.nextInt();
						sc.nextLine();
						
						if(menuChoice < 0 || menuChoice > 4) {
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
							if(withdraw > balance) {
								System.out.printf("Valor para saque excede o saldo em conta.%n");
							}
							else {
								balance -= withdraw;
								System.out.printf("Saldo atualizado: %.2f%n", balance);
							}
						}
						else if(menuChoice == 4) {
							System.out.print("Informe um valor para a transferência: ");
							transfer = sc.nextDouble();
							sc.nextLine();
							System.out.print("Informe a conta de quem irá receber: ");
							randomAccount = sc.nextLine();
							System.out.print("Informe a agência de quem irá receber: ");
							randomAngency = sc.nextInt();
							sc.nextLine();
							System.out.print("Informe o número do banco (padrão: 000): ");
							randomBankNumber = sc.nextInt();
							sc.nextLine();
							System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
									+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
							System.out.print("Os dados estão corretos (s/n)? ");
							resp2 = sc.next().charAt(resp2);
							if(resp2 == 's' || resp == 'S') {
								System.out.printf("Realizado a transferência para a conta %s, "
										+ "agência %d e banco %d, no valor de R$%.2f%n", randomAccount, randomAngency, randomBankNumber, transfer);
							}
							else {
								do {
									resp2 = 0;
									System.out.print("Informe um valor para a transferência: ");
									transfer = sc.nextDouble();
									sc.nextLine();
									System.out.print("Informe a conta de quem irá receber: ");
									randomAccount = sc.nextLine();
									System.out.print("Informe a agência de quem irá receber: ");
									randomAngency = sc.nextInt();
									sc.nextLine();
									System.out.print("Informe o número do banco (padrão: 000): ");
									randomBankNumber = sc.nextInt();
									sc.nextLine();
									System.out.println("Confirme os dados para a transferência: valor R$" + transfer + ", conta " + randomAccount
											+ ", agência " + randomAngency + " e número do banco " + randomBankNumber);
									System.out.print("Os dados estão corretos (s/n)? ");
									resp2 = sc.next().charAt(resp2);
								}while(resp2 == 'n' || resp2 == 'N');
							}
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