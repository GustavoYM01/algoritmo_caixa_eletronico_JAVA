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

		System.out.printf("Bem-vindo(a) ao caixa eletr?nico feito em JAVA%n%n");

		System.out.print("Informe um CPF (no padr?o: 000.000.000-00): ");
		String randomCpf = sc.nextLine();

		if (randomCpf.equals(registeredCpf)) {
			System.out.print("Informe a senha: ");
			randomPassword = sc.nextLine();
			if (randomPassword.equals(registeredPassword)) {
				mostraMenu();
				menuChoice = sc.nextInt();
				sc.nextLine();
				if (menuChoice == 1) {
					mostraSaldo(balance);
					System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
					resp = sc.next().charAt(resp);
					if (resp == 's' || resp == 'S') {
						do {
							mostraMenu();
							menuChoice = sc.nextInt();
							sc.nextLine();

							if (menuChoice < 0 || menuChoice > 4) {
								System.out.printf("Op??o inv?lida%n");
							} else if (menuChoice == 0) {
								System.out.print("Volte sempre.");
								System.exit(0);
							} else if (menuChoice == 1) {
								mostraSaldo(balance);
							} else if (menuChoice == 2) {
								System.out.print("Informe um valor para dep?sito: ");
								deposit = sc.nextDouble();
								sc.nextLine();
								balance += deposit;
								mostraSaldoAtualizado(balance);
							} else if (menuChoice == 3) {
								System.out.print("Informe um valor para saque: ");
								withdraw = sc.nextDouble();
								sc.nextLine();
								if (withdraw > balance) {
									System.out.printf("Valor para saque excede o saldo em conta.%n");
								} else {
									balance -= withdraw;
									mostraSaldoAtualizado(balance);
								}
							} else if (menuChoice == 4) {
								System.out.print("Informe um valor para a transfer?ncia: ");
								transfer = sc.nextDouble();
								sc.nextLine();
								System.out.print("Informe a conta de quem ir? receber: ");
								randomAccount = sc.nextLine();
								System.out.print("Informe a ag?ncia de quem ir? receber: ");
								randomAngency = sc.nextInt();
								sc.nextLine();
								System.out.print("Informe o n?mero do banco (padr?o: 000): ");
								randomBankNumber = sc.nextInt();
								sc.nextLine();
								mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency, randomBankNumber);
								System.out.print("Os dados est?o corretos (s/n)? ");
								resp2 = sc.next().charAt(resp2);
								if (resp2 == 's' || resp2 == 'S') {
									mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
											randomBankNumber, transfer);
								} else {
									do {
										resp2 = 0;
										System.out.print("Informe um valor para a transfer?ncia: ");
										transfer = sc.nextDouble();
										sc.nextLine();
										System.out.print("Informe a conta de quem ir? receber: ");
										randomAccount = sc.nextLine();
										System.out.print("Informe a ag?ncia de quem ir? receber: ");
										randomAngency = sc.nextInt();
										sc.nextLine();
										System.out.print("Informe o n?mero do banco (padr?o: 000): ");
										randomBankNumber = sc.nextInt();
										sc.nextLine();
										mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
												randomBankNumber);
										System.out.print("Os dados est?o corretos (s/n)? ");
										resp2 = sc.next().charAt(resp2);
									} while (resp2 == 'n' || resp2 == 'N');
									mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
											randomBankNumber, transfer);
								}
							}
							resp = 0;
							System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
							resp = sc.next().charAt(resp);

						} while (resp == 's' || resp == 'S');
						System.out.print("Volte sempre.");
						System.exit(0);
					} else {
						System.out.print("Volte sempre.");
						System.exit(0);
					}
				} else if (menuChoice == 2) {
					System.out.print("Informe um valor para dep?sito: ");
					deposit = sc.nextDouble();
					sc.nextLine();
					balance += deposit;
					mostraSaldoAtualizado(balance);
					System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
					resp = sc.next().charAt(resp);
					if (resp == 's' || resp == 'S') {
						do {
							mostraMenu();
							menuChoice = sc.nextInt();
							sc.nextLine();

							if (menuChoice < 0 || menuChoice > 4) {
								System.out.printf("Op??o inv?lida%n");
							} else if (menuChoice == 0) {
								System.out.print("Volte sempre.");
								System.exit(0);
							} else if (menuChoice == 1) {
								mostraSaldo(balance);
							} else if (menuChoice == 2) {
								System.out.print("Informe um valor para dep?sito: ");
								deposit = sc.nextDouble();
								sc.nextLine();
								balance += deposit;
								mostraSaldoAtualizado(balance);
							} else if (menuChoice == 3) {
								System.out.print("Informe um valor para saque: ");
								withdraw = sc.nextDouble();
								sc.nextLine();
								if (withdraw > balance) {
									System.out.printf("Valor para saque excede o saldo em conta.%n");
								} else {
									balance -= withdraw;
									mostraSaldoAtualizado(balance);
								}
							} else if (menuChoice == 4) {
								System.out.print("Informe um valor para a transfer?ncia: ");
								transfer = sc.nextDouble();
								sc.nextLine();
								System.out.print("Informe a conta de quem ir? receber: ");
								randomAccount = sc.nextLine();
								System.out.print("Informe a ag?ncia de quem ir? receber: ");
								randomAngency = sc.nextInt();
								sc.nextLine();
								System.out.print("Informe o n?mero do banco (padr?o: 000): ");
								randomBankNumber = sc.nextInt();
								sc.nextLine();
								mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency, randomBankNumber);
								System.out.print("Os dados est?o corretos (s/n)? ");
								resp2 = sc.next().charAt(resp2);
								if (resp2 == 's' || resp == 'S') {
									mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
											randomBankNumber, transfer);
								} else {
									do {
										resp2 = 0;
										System.out.print("Informe um valor para a transfer?ncia: ");
										transfer = sc.nextDouble();
										sc.nextLine();
										System.out.print("Informe a conta de quem ir? receber: ");
										randomAccount = sc.nextLine();
										System.out.print("Informe a ag?ncia de quem ir? receber: ");
										randomAngency = sc.nextInt();
										sc.nextLine();
										System.out.print("Informe o n?mero do banco (padr?o: 000): ");
										randomBankNumber = sc.nextInt();
										sc.nextLine();
										mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
												randomBankNumber);
										System.out.print("Os dados est?o corretos (s/n)? ");
										resp2 = sc.next().charAt(resp2);
									} while (resp2 == 'n' || resp2 == 'N');
									mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
											randomBankNumber, transfer);
								}
							}
							resp = 0;
							System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
							resp = sc.next().charAt(resp);

						} while (resp == 's' || resp == 'S');
						System.out.print("Volte sempre.");
						System.exit(0);
					} else {
						System.out.print("Volte sempre.");
						System.exit(0);
					}
				} else if (menuChoice == 3) {
					System.out.print("Informe um valor para saque: ");
					withdraw = sc.nextDouble();
					sc.nextLine();
					if (withdraw > balance) {
						System.out.printf("Valor para saque excede o saldo em conta.%n");
					} else {
						balance -= withdraw;
						mostraSaldoAtualizado(balance);
					}
					System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
					resp = sc.next().charAt(resp);
					if (resp == 's' || resp == 'S') {
						do {
							mostraMenu();
							menuChoice = sc.nextInt();
							sc.nextLine();

							if (menuChoice < 0 || menuChoice > 4) {
								System.out.printf("Op??o inv?lida%n");
							} else if (menuChoice == 0) {
								System.out.print("Volte sempre.");
								System.exit(0);
							} else if (menuChoice == 1) {
								mostraSaldo(balance);
							} else if (menuChoice == 2) {
								System.out.print("Informe um valor para dep?sito: ");
								deposit = sc.nextDouble();
								sc.nextLine();
								balance += deposit;
								mostraSaldoAtualizado(balance);
							} else if (menuChoice == 3) {
								System.out.print("Informe um valor para saque: ");
								withdraw = sc.nextDouble();
								sc.nextLine();
								if (withdraw > balance) {
									System.out.printf("Valor para saque excede o saldo em conta.%n");
								} else {
									balance -= withdraw;
									mostraSaldoAtualizado(balance);
								}
							} else if (menuChoice == 4) {
								System.out.print("Informe um valor para a transfer?ncia: ");
								transfer = sc.nextDouble();
								sc.nextLine();
								System.out.print("Informe a conta de quem ir? receber: ");
								randomAccount = sc.nextLine();
								System.out.print("Informe a ag?ncia de quem ir? receber: ");
								randomAngency = sc.nextInt();
								sc.nextLine();
								System.out.print("Informe o n?mero do banco (padr?o: 000): ");
								randomBankNumber = sc.nextInt();
								sc.nextLine();
								mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency, randomBankNumber);
								System.out.print("Os dados est?o corretos (s/n)? ");
								resp2 = sc.next().charAt(resp2);
								if (resp2 == 's' || resp == 'S') {
									mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
											randomBankNumber, transfer);
								} else {
									do {
										resp2 = 0;
										System.out.print("Informe um valor para a transfer?ncia: ");
										transfer = sc.nextDouble();
										sc.nextLine();
										System.out.print("Informe a conta de quem ir? receber: ");
										randomAccount = sc.nextLine();
										System.out.print("Informe a ag?ncia de quem ir? receber: ");
										randomAngency = sc.nextInt();
										sc.nextLine();
										System.out.print("Informe o n?mero do banco (padr?o: 000): ");
										randomBankNumber = sc.nextInt();
										sc.nextLine();
										mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
												randomBankNumber);
										System.out.print("Os dados est?o corretos (s/n)? ");
										resp2 = sc.next().charAt(resp2);
									} while (resp2 == 'n' || resp2 == 'N');
									mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
											randomBankNumber, transfer);
								}
							}
							resp = 0;
							System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
							resp = sc.next().charAt(resp);

						} while (resp == 's' || resp == 'S');
						System.out.print("Volte sempre.");
						System.exit(0);
					} else {
						System.out.print("Volte sempre.");
						System.exit(0);
					}
				} else if (menuChoice == 4) {
					System.out.print("Informe um valor para a transfer?ncia: ");
					transfer = sc.nextDouble();
					sc.nextLine();
					System.out.print("Informe a conta de quem ir? receber: ");
					randomAccount = sc.nextLine();
					System.out.print("Informe a ag?ncia de quem ir? receber: ");
					randomAngency = sc.nextInt();
					sc.nextLine();
					System.out.print("Informe o n?mero do banco (padr?o: 000): ");
					randomBankNumber = sc.nextInt();
					sc.nextLine();
					mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency, randomBankNumber);
					System.out.print("Os dados est?o corretos (s/n)? ");
					resp2 = sc.next().charAt(resp2);
					if (resp2 == 's' || resp2 == 'S') {
						mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency, randomBankNumber,
								transfer);
						System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
						resp = sc.next().charAt(resp);
						if (resp == 's' || resp == 'S') {
							do {
								mostraMenu();
								menuChoice = sc.nextInt();
								sc.nextLine();

								if (menuChoice < 0 || menuChoice > 4) {
									System.out.printf("Op??o inv?lida%n");
								} else if (menuChoice == 0) {
									System.out.print("Volte sempre.");
									System.exit(0);
								} else if (menuChoice == 1) {
									mostraSaldo(balance);
								} else if (menuChoice == 2) {
									System.out.print("Informe um valor para dep?sito: ");
									deposit = sc.nextDouble();
									sc.nextLine();
									balance += deposit;
									mostraSaldoAtualizado(balance);
								} else if (menuChoice == 3) {
									System.out.print("Informe um valor para saque: ");
									withdraw = sc.nextDouble();
									sc.nextLine();
									if (withdraw > balance) {
										System.out.printf("Valor para saque excede o saldo em conta.%n");
									} else {
										balance -= withdraw;
										mostraSaldoAtualizado(balance);
									}
								} else if (menuChoice == 4) {
									System.out.print("Informe um valor para a transfer?ncia: ");
									transfer = sc.nextDouble();
									sc.nextLine();
									System.out.print("Informe a conta de quem ir? receber: ");
									randomAccount = sc.nextLine();
									System.out.print("Informe a ag?ncia de quem ir? receber: ");
									randomAngency = sc.nextInt();
									sc.nextLine();
									System.out.print("Informe o n?mero do banco (padr?o: 000): ");
									randomBankNumber = sc.nextInt();
									sc.nextLine();
									mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
											randomBankNumber);
									System.out.print("Os dados est?o corretos (s/n)? ");
									resp2 = sc.next().charAt(resp2);
									if (resp2 == 's' || resp == 'S') {
										mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
												randomBankNumber, transfer);
									} else {
										do {
											resp2 = 0;
											System.out.print("Informe um valor para a transfer?ncia: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem ir? receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a ag?ncia de quem ir? receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o n?mero do banco (padr?o: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
													randomBankNumber);
											System.out.print("Os dados est?o corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
										} while (resp2 == 'n' || resp2 == 'N');
										mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
												randomBankNumber, transfer);
									}
								}
								resp = 0;
								System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
								resp = sc.next().charAt(resp);

							} while (resp == 's' || resp == 'S');
							System.out.print("Volte sempre.");
							System.exit(0);
						} else {
							System.out.print("Volte sempre.");
							System.exit(0);
						}
					} else {
						do {
							resp2 = 0;
							System.out.print("Informe um valor para a transfer?ncia: ");
							transfer = sc.nextDouble();
							sc.nextLine();
							System.out.print("Informe a conta de quem ir? receber: ");
							randomAccount = sc.nextLine();
							System.out.print("Informe a ag?ncia de quem ir? receber: ");
							randomAngency = sc.nextInt();
							sc.nextLine();
							System.out.print("Informe o n?mero do banco (padr?o: 000): ");
							randomBankNumber = sc.nextInt();
							sc.nextLine();
							mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency, randomBankNumber);
							System.out.print("Os dados est?o corretos (s/n)? ");
							resp2 = sc.next().charAt(resp2);
							if (resp2 == 's' || resp2 == 'S') {
								mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency, randomBankNumber,
										transfer);
								System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
								resp = sc.next().charAt(resp);
								if (resp == 's' || resp == 'S') {
									do {
										mostraMenu();
										menuChoice = sc.nextInt();
										sc.nextLine();

										if (menuChoice < 0 || menuChoice > 3) {
											System.out.printf("Op??o inv?lida%n");
										} else if (menuChoice == 0) {
											System.out.print("Volte sempre.");
											System.exit(0);
										} else if (menuChoice == 1) {
											mostraSaldo(balance);
										} else if (menuChoice == 2) {
											System.out.print("Informe um valor para dep?sito: ");
											deposit = sc.nextDouble();
											sc.nextLine();
											balance += deposit;
											mostraSaldoAtualizado(balance);
										} else if (menuChoice == 3) {
											System.out.print("Informe um valor para saque: ");
											withdraw = sc.nextDouble();
											sc.nextLine();
											if (withdraw > balance) {
												System.out.printf("Valor para saque excede o saldo em conta.%n");
											} else {
												balance -= withdraw;
												mostraSaldoAtualizado(balance);
											}
										} else if (menuChoice == 4) {
											System.out.print("Informe um valor para a transfer?ncia: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem ir? receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a ag?ncia de quem ir? receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o n?mero do banco (padr?o: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
													randomBankNumber);
											System.out.print("Os dados est?o corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
											if (resp2 == 's' || resp == 'S') {
												mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
														randomBankNumber, transfer);
											} else {
												do {
													resp2 = 0;
													System.out.print("Informe um valor para a transfer?ncia: ");
													transfer = sc.nextDouble();
													sc.nextLine();
													System.out.print("Informe a conta de quem ir? receber: ");
													randomAccount = sc.nextLine();
													System.out.print("Informe a ag?ncia de quem ir? receber: ");
													randomAngency = sc.nextInt();
													sc.nextLine();
													System.out.print("Informe o n?mero do banco (padr?o: 000): ");
													randomBankNumber = sc.nextInt();
													sc.nextLine();
													mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
															randomBankNumber);
													System.out.print("Os dados est?o corretos (s/n)? ");
													resp2 = sc.next().charAt(resp2);
												} while (resp2 == 'n' || resp2 == 'N');
												mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
														randomBankNumber, transfer);
											}
										}
										resp = 0;
										System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
										resp = sc.next().charAt(resp);

									} while (resp == 's' || resp == 'S');
									System.out.print("Volte sempre.");
									System.exit(0);
								} else {
									System.out.print("Volte sempre.");
									System.exit(0);
								}
							}
						} while (resp2 == 'n' || resp2 == 'N');
						mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency, randomBankNumber,
								transfer);
					}
				} else if (menuChoice == 0) {
					System.out.print("Volte sempre.");
					System.exit(0);
				}
			} else {
				System.out.printf("Senha incorreta, 2 tentativas para acessar a conta%n");
				for (int i = 1; i <= 2; i++) {
					System.out.print(i + "? tentativa: ");
					randomPassword = sc.nextLine();
					if (randomPassword.equals(registeredPassword)) {
						mostraMenu();
						menuChoice = sc.nextInt();
						sc.nextLine();
						if (menuChoice == 1) {
							mostraSaldo(balance);
							System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
							resp = sc.next().charAt(resp);
							if (resp == 's' || resp == 'S') {
								do {
									mostraMenu();
									menuChoice = sc.nextInt();
									sc.nextLine();

									if (menuChoice < 0 || menuChoice > 4) {
										System.out.printf("Op??o inv?lida%n");
									} else if (menuChoice == 0) {
										System.out.print("Volte sempre.");
										System.exit(0);
									} else if (menuChoice == 1) {
										mostraSaldo(balance);
									} else if (menuChoice == 2) {
										System.out.print("Informe um valor para dep?sito: ");
										deposit = sc.nextDouble();
										sc.nextLine();
										balance += deposit;
										mostraSaldoAtualizado(balance);
									} else if (menuChoice == 3) {
										System.out.print("Informe um valor para saque: ");
										withdraw = sc.nextDouble();
										sc.nextLine();
										if (withdraw > balance) {
											System.out.printf("Valor para saque excede o saldo em conta.%n");
										} else {
											balance -= withdraw;
											mostraSaldoAtualizado(balance);
										}
									} else if (menuChoice == 4) {
										System.out.print("Informe um valor para a transfer?ncia: ");
										transfer = sc.nextDouble();
										sc.nextLine();
										System.out.print("Informe a conta de quem ir? receber: ");
										randomAccount = sc.nextLine();
										System.out.print("Informe a ag?ncia de quem ir? receber: ");
										randomAngency = sc.nextInt();
										sc.nextLine();
										System.out.print("Informe o n?mero do banco (padr?o: 000): ");
										randomBankNumber = sc.nextInt();
										sc.nextLine();
										mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
												randomBankNumber);
										System.out.print("Os dados est?o corretos (s/n)? ");
										resp2 = sc.next().charAt(resp2);
										if (resp2 == 's' || resp == 'S') {
											mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
													randomBankNumber, transfer);
										} else {
											do {
												resp2 = 0;
												System.out.print("Informe um valor para a transfer?ncia: ");
												transfer = sc.nextDouble();
												sc.nextLine();
												System.out.print("Informe a conta de quem ir? receber: ");
												randomAccount = sc.nextLine();
												System.out.print("Informe a ag?ncia de quem ir? receber: ");
												randomAngency = sc.nextInt();
												sc.nextLine();
												System.out.print("Informe o n?mero do banco (padr?o: 000): ");
												randomBankNumber = sc.nextInt();
												sc.nextLine();
												mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
														randomBankNumber);
												System.out.print("Os dados est?o corretos (s/n)? ");
												resp2 = sc.next().charAt(resp2);
											} while (resp2 == 'n' || resp2 == 'N');
											mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
													randomBankNumber, transfer);
										}
									}
									resp = 0;
									System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
									resp = sc.next().charAt(resp);

								} while (resp == 's' || resp == 'S');
								System.out.print("Volte sempre.");
								System.exit(0);
							} else {
								System.out.print("Volte sempre.");
								System.exit(0);
							}
						} else if (menuChoice == 2) {
							System.out.print("Informe um valor para dep?sito: ");
							deposit = sc.nextDouble();
							sc.nextLine();
							balance += deposit;
							mostraSaldoAtualizado(balance);
							System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
							resp = sc.next().charAt(resp);
							if (resp == 's' || resp == 'S') {
								do {
									mostraMenu();
									menuChoice = sc.nextInt();
									sc.nextLine();

									if (menuChoice < 0 || menuChoice > 4) {
										System.out.printf("Op??o inv?lida%n");
									} else if (menuChoice == 0) {
										System.out.print("Volte sempre.");
										System.exit(0);
									} else if (menuChoice == 1) {
										mostraSaldo(balance);
									} else if (menuChoice == 2) {
										System.out.print("Informe um valor para dep?sito: ");
										deposit = sc.nextDouble();
										sc.nextLine();
										balance += deposit;
										mostraSaldoAtualizado(balance);
									} else if (menuChoice == 3) {
										System.out.print("Informe um valor para saque: ");
										withdraw = sc.nextDouble();
										sc.nextLine();
										if (withdraw > balance) {
											System.out.printf("Valor para saque excede o saldo em conta.%n");
										} else {
											balance -= withdraw;
											mostraSaldoAtualizado(balance);
										}
									} else if (menuChoice == 4) {
										System.out.print("Informe um valor para a transfer?ncia: ");
										transfer = sc.nextDouble();
										sc.nextLine();
										System.out.print("Informe a conta de quem ir? receber: ");
										randomAccount = sc.nextLine();
										System.out.print("Informe a ag?ncia de quem ir? receber: ");
										randomAngency = sc.nextInt();
										sc.nextLine();
										System.out.print("Informe o n?mero do banco (padr?o: 000): ");
										randomBankNumber = sc.nextInt();
										sc.nextLine();
										mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
												randomBankNumber);
										System.out.print("Os dados est?o corretos (s/n)? ");
										resp2 = sc.next().charAt(resp2);
										if (resp2 == 's' || resp == 'S') {
											mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
													randomBankNumber, transfer);
										} else {
											do {
												resp2 = 0;
												System.out.print("Informe um valor para a transfer?ncia: ");
												transfer = sc.nextDouble();
												sc.nextLine();
												System.out.print("Informe a conta de quem ir? receber: ");
												randomAccount = sc.nextLine();
												System.out.print("Informe a ag?ncia de quem ir? receber: ");
												randomAngency = sc.nextInt();
												sc.nextLine();
												System.out.print("Informe o n?mero do banco (padr?o: 000): ");
												randomBankNumber = sc.nextInt();
												sc.nextLine();
												mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
														randomBankNumber);
												System.out.print("Os dados est?o corretos (s/n)? ");
												resp2 = sc.next().charAt(resp2);
											} while (resp2 == 'n' || resp2 == 'N');
											mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
													randomBankNumber, transfer);
										}
									}
									resp = 0;
									System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
									resp = sc.next().charAt(resp);

								} while (resp == 's' || resp == 'S');
							} else {
								System.out.print("Volte sempre.");
								System.exit(0);
							}
						} else if (menuChoice == 3) {
							System.out.print("Informe um valor para saque: ");
							withdraw = sc.nextDouble();
							sc.nextLine();
							if (withdraw > balance) {
								System.out.printf("Valor para saque excede o saldo em conta.%n");
							} else {
								balance -= withdraw;
								mostraSaldoAtualizado(balance);
							}
							System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
							resp = sc.next().charAt(resp);
							if (resp == 's' || resp == 'S') {
								do {
									mostraMenu();
									menuChoice = sc.nextInt();
									sc.nextLine();

									if (menuChoice < 0 || menuChoice > 4) {
										System.out.printf("Op??o inv?lida%n");
									} else if (menuChoice == 0) {
										System.out.print("Volte sempre.");
										System.exit(0);
									} else if (menuChoice == 1) {
										mostraSaldo(balance);
									} else if (menuChoice == 2) {
										System.out.print("Informe um valor para dep?sito: ");
										deposit = sc.nextDouble();
										sc.nextLine();
										balance += deposit;
										mostraSaldoAtualizado(balance);
									} else if (menuChoice == 3) {
										System.out.print("Informe um valor para saque: ");
										withdraw = sc.nextDouble();
										sc.nextLine();
										if (withdraw > balance) {
											System.out.printf("Valor para saque excede o saldo em conta.%n");
										} else {
											balance -= withdraw;
											mostraSaldoAtualizado(balance);
										}
									} else if (menuChoice == 4) {
										System.out.print("Informe um valor para a transfer?ncia: ");
										transfer = sc.nextDouble();
										sc.nextLine();
										System.out.print("Informe a conta de quem ir? receber: ");
										randomAccount = sc.nextLine();
										System.out.print("Informe a ag?ncia de quem ir? receber: ");
										randomAngency = sc.nextInt();
										sc.nextLine();
										System.out.print("Informe o n?mero do banco (padr?o: 000): ");
										randomBankNumber = sc.nextInt();
										sc.nextLine();
										mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
												randomBankNumber);
										System.out.print("Os dados est?o corretos (s/n)? ");
										resp2 = sc.next().charAt(resp2);
										if (resp2 == 's' || resp == 'S') {
											mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
													randomBankNumber, transfer);
										} else {
											do {
												resp2 = 0;
												System.out.print("Informe um valor para a transfer?ncia: ");
												transfer = sc.nextDouble();
												sc.nextLine();
												System.out.print("Informe a conta de quem ir? receber: ");
												randomAccount = sc.nextLine();
												System.out.print("Informe a ag?ncia de quem ir? receber: ");
												randomAngency = sc.nextInt();
												sc.nextLine();
												System.out.print("Informe o n?mero do banco (padr?o: 000): ");
												randomBankNumber = sc.nextInt();
												sc.nextLine();
												mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
														randomBankNumber);
												System.out.print("Os dados est?o corretos (s/n)? ");
												resp2 = sc.next().charAt(resp2);
											} while (resp2 == 'n' || resp2 == 'N');
											mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
													randomBankNumber, transfer);
										}
									}
									resp = 0;
									System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
									resp = sc.next().charAt(resp);

								} while (resp == 's' || resp == 'S');
								System.out.print("Volte sempre.");
								System.exit(0);
							} else {
								System.out.print("Volte sempre.");
								System.exit(0);
							}
						} else if (menuChoice == 4) {
							System.out.print("Informe um valor para a transfer?ncia: ");
							transfer = sc.nextDouble();
							sc.nextLine();
							System.out.print("Informe a conta de quem ir? receber: ");
							randomAccount = sc.nextLine();
							System.out.print("Informe a ag?ncia de quem ir? receber: ");
							randomAngency = sc.nextInt();
							sc.nextLine();
							System.out.print("Informe o n?mero do banco (padr?o: 000): ");
							randomBankNumber = sc.nextInt();
							sc.nextLine();
							mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency, randomBankNumber);
							System.out.print("Os dados est?o corretos (s/n)? ");
							resp2 = sc.next().charAt(resp2);
							if (resp2 == 's' || resp2 == 'S') {
								mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency, randomBankNumber,
										transfer);
								System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
								resp = sc.next().charAt(resp);
								if (resp == 's' || resp == 'S') {
									do {
										mostraMenu();
										menuChoice = sc.nextInt();
										sc.nextLine();

										if (menuChoice < 0 || menuChoice > 4) {
											System.out.printf("Op??o inv?lida%n");
										} else if (menuChoice == 0) {
											System.out.print("Volte sempre.");
											System.exit(0);
										} else if (menuChoice == 1) {
											mostraSaldo(balance);
										} else if (menuChoice == 2) {
											System.out.print("Informe um valor para dep?sito: ");
											deposit = sc.nextDouble();
											sc.nextLine();
											balance += deposit;
											mostraSaldoAtualizado(balance);
										} else if (menuChoice == 3) {
											System.out.print("Informe um valor para saque: ");
											withdraw = sc.nextDouble();
											sc.nextLine();
											if (withdraw > balance) {
												System.out.printf("Valor para saque excede o saldo em conta.%n");
											} else {
												balance -= withdraw;
												mostraSaldoAtualizado(balance);
											}
										} else if (menuChoice == 4) {
											System.out.print("Informe um valor para a transfer?ncia: ");
											transfer = sc.nextDouble();
											sc.nextLine();
											System.out.print("Informe a conta de quem ir? receber: ");
											randomAccount = sc.nextLine();
											System.out.print("Informe a ag?ncia de quem ir? receber: ");
											randomAngency = sc.nextInt();
											sc.nextLine();
											System.out.print("Informe o n?mero do banco (padr?o: 000): ");
											randomBankNumber = sc.nextInt();
											sc.nextLine();
											mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
													randomBankNumber);
											System.out.print("Os dados est?o corretos (s/n)? ");
											resp2 = sc.next().charAt(resp2);
											if (resp2 == 's' || resp == 'S') {
												mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
														randomBankNumber, transfer);
											} else {
												do {
													resp2 = 0;
													System.out.print("Informe um valor para a transfer?ncia: ");
													transfer = sc.nextDouble();
													sc.nextLine();
													System.out.print("Informe a conta de quem ir? receber: ");
													randomAccount = sc.nextLine();
													System.out.print("Informe a ag?ncia de quem ir? receber: ");
													randomAngency = sc.nextInt();
													sc.nextLine();
													System.out.print("Informe o n?mero do banco (padr?o: 000): ");
													randomBankNumber = sc.nextInt();
													sc.nextLine();
													mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
															randomBankNumber);
													System.out.print("Os dados est?o corretos (s/n)? ");
													resp2 = sc.next().charAt(resp2);
												} while (resp2 == 'n' || resp2 == 'N');
												mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
														randomBankNumber, transfer);
											}
										}
										resp = 0;
										System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
										resp = sc.next().charAt(resp);

									} while (resp == 's' || resp == 'S');
									System.out.print("Volte sempre.");
									System.exit(0);
								} else {
									System.out.print("Volte sempre.");
									System.exit(0);
								}
							} else {
								do {
									resp2 = 0;
									System.out.print("Informe um valor para a transfer?ncia: ");
									transfer = sc.nextDouble();
									sc.nextLine();
									System.out.print("Informe a conta de quem ir? receber: ");
									randomAccount = sc.nextLine();
									System.out.print("Informe a ag?ncia de quem ir? receber: ");
									randomAngency = sc.nextInt();
									sc.nextLine();
									System.out.print("Informe o n?mero do banco (padr?o: 000): ");
									randomBankNumber = sc.nextInt();
									sc.nextLine();
									mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
											randomBankNumber);
									System.out.print("Os dados est?o corretos (s/n)? ");
									resp2 = sc.next().charAt(resp2);
									if (resp2 == 's' || resp2 == 'S') {
										mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency,
												randomBankNumber, transfer);
										System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
										resp = sc.next().charAt(resp);
										if (resp == 's' || resp == 'S') {
											do {
												mostraMenu();
												menuChoice = sc.nextInt();
												sc.nextLine();

												if (menuChoice < 0 || menuChoice > 3) {
													System.out.printf("Op??o inv?lida%n");
												} else if (menuChoice == 0) {
													System.out.print("Volte sempre.");
													System.exit(0);
												} else if (menuChoice == 1) {
													mostraSaldo(balance);
												} else if (menuChoice == 2) {
													System.out.print("Informe um valor para dep?sito: ");
													deposit = sc.nextDouble();
													sc.nextLine();
													balance += deposit;
													mostraSaldoAtualizado(balance);
												} else if (menuChoice == 3) {
													System.out.print("Informe um valor para saque: ");
													withdraw = sc.nextDouble();
													sc.nextLine();
													if (withdraw > balance) {
														System.out
																.printf("Valor para saque excede o saldo em conta.%n");
													} else {
														balance -= withdraw;
														mostraSaldoAtualizado(balance);
													}
												} else if (menuChoice == 4) {
													System.out.print("Informe um valor para a transfer?ncia: ");
													transfer = sc.nextDouble();
													sc.nextLine();
													System.out.print("Informe a conta de quem ir? receber: ");
													randomAccount = sc.nextLine();
													System.out.print("Informe a ag?ncia de quem ir? receber: ");
													randomAngency = sc.nextInt();
													sc.nextLine();
													System.out.print("Informe o n?mero do banco (padr?o: 000): ");
													randomBankNumber = sc.nextInt();
													sc.nextLine();
													mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
															randomBankNumber);
													System.out.print("Os dados est?o corretos (s/n)? ");
													resp2 = sc.next().charAt(resp2);
													if (resp2 == 's' || resp == 'S') {
														mostraMensagemDeTransferenciaRealizada(randomAccount,
																randomAngency, randomBankNumber, transfer);
													} else {
														do {
															resp2 = 0;
															System.out.print("Informe um valor para a transfer?ncia: ");
															transfer = sc.nextDouble();
															sc.nextLine();
															System.out.print("Informe a conta de quem ir? receber: ");
															randomAccount = sc.nextLine();
															System.out.print("Informe a ag?ncia de quem ir? receber: ");
															randomAngency = sc.nextInt();
															sc.nextLine();
															System.out
																	.print("Informe o n?mero do banco (padr?o: 000): ");
															randomBankNumber = sc.nextInt();
															sc.nextLine();
															mostraMensagemDeConfirmacao(transfer, randomAccount,
																	randomAngency, randomBankNumber);
															System.out.print("Os dados est?o corretos (s/n)? ");
															resp2 = sc.next().charAt(resp2);
														} while (resp2 == 'n' || resp2 == 'N');
														mostraMensagemDeTransferenciaRealizada(randomAccount,
																randomAngency, randomBankNumber, transfer);
													}
												}
												resp = 0;
												System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
												resp = sc.next().charAt(resp);

											} while (resp == 's' || resp == 'S');
											System.out.print("Volte sempre.");
											System.exit(0);
										} else {
											System.out.print("Volte sempre.");
											System.exit(0);
										}
									}
								} while (resp2 == 'n' || resp2 == 'N');
								mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency, randomBankNumber,
										transfer);
							}
						} else if (menuChoice == 0) {
							System.out.print("Volte sempre.");
							System.exit(0);
						}
					}
				}
				System.out.print("0 tentativas restantes, conta bloqueada");
				System.exit(0);
			}
			while (menuChoice < 0 || menuChoice > 4) {
				System.out.print("Op??o inv?lida, tentar novamente (s/n)? ");
				resp = sc.next().charAt(resp);
				if (resp == 's' || resp == 'S') {
					do {
						mostraMenu();
						menuChoice = sc.nextInt();
						sc.nextLine();

						if (menuChoice < 0 || menuChoice > 4) {
							System.out.printf("Op??o inv?lida%n");
						} else if (menuChoice == 0) {
							System.out.print("Volte sempre.");
							System.exit(0);
						} else if (menuChoice == 1) {
							mostraSaldo(balance);
						} else if (menuChoice == 2) {
							System.out.print("Informe um valor para dep?sito: ");
							deposit = sc.nextDouble();
							sc.nextLine();
							balance += deposit;
							mostraSaldoAtualizado(balance);
						} else if (menuChoice == 3) {
							System.out.print("Informe um valor para saque: ");
							withdraw = sc.nextDouble();
							sc.nextLine();
							if (withdraw > balance) {
								System.out.printf("Valor para saque excede o saldo em conta.%n");
							} else {
								balance -= withdraw;
								mostraSaldoAtualizado(balance);
							}
						} else if (menuChoice == 4) {
							System.out.print("Informe um valor para a transfer?ncia: ");
							transfer = sc.nextDouble();
							sc.nextLine();
							System.out.print("Informe a conta de quem ir? receber: ");
							randomAccount = sc.nextLine();
							System.out.print("Informe a ag?ncia de quem ir? receber: ");
							randomAngency = sc.nextInt();
							sc.nextLine();
							System.out.print("Informe o n?mero do banco (padr?o: 000): ");
							randomBankNumber = sc.nextInt();
							sc.nextLine();
							mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency, randomBankNumber);
							System.out.print("Os dados est?o corretos (s/n)? ");
							resp2 = sc.next().charAt(resp2);
							if (resp2 == 's' || resp == 'S') {
								mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency, randomBankNumber,
										transfer);
							} else {
								do {
									resp2 = 0;
									System.out.print("Informe um valor para a transfer?ncia: ");
									transfer = sc.nextDouble();
									sc.nextLine();
									System.out.print("Informe a conta de quem ir? receber: ");
									randomAccount = sc.nextLine();
									System.out.print("Informe a ag?ncia de quem ir? receber: ");
									randomAngency = sc.nextInt();
									sc.nextLine();
									System.out.print("Informe o n?mero do banco (padr?o: 000): ");
									randomBankNumber = sc.nextInt();
									sc.nextLine();
									mostraMensagemDeConfirmacao(transfer, randomAccount, randomAngency,
											randomBankNumber);
									System.out.print("Os dados est?o corretos (s/n)? ");
									resp2 = sc.next().charAt(resp2);
								} while (resp2 == 'n' || resp2 == 'N');
								mostraMensagemDeTransferenciaRealizada(randomAccount, randomAngency, randomBankNumber,
										transfer);
							}
						}
						resp = 0;
						System.out.print("Deseja realizar uma nova opera??o (s/n)? ");
						resp = sc.next().charAt(resp);

					} while (resp == 's' || resp == 'S');
					System.out.print("Volte sempre.");
					System.exit(0);
				} else {
					System.out.print("Volte sempre.");
					System.exit(0);
				}
			}
		} else {
			System.out.print("CPF n?o encontrado");
			System.exit(0);
		}
		sc.close();
	}

	public static void mostraMenu() {
		System.out.println("Escolha uma das op??es: " + "1 - Saldo | 2 - Dep?sito | 3 - Saque |"
				+ " 4 - Transfer?ncia | 0 - Sair");
	}

	public static void mostraSaldo(double b) {
		System.out.printf("Saldo dispon?vel: %.2f%n", b);
	}

	public static void mostraSaldoAtualizado(double b) {
		System.out.printf("Saldo atualizado: %.2f%n", b);
	}

	public static void mostraMensagemDeConfirmacao(double t, String rA, int rA2, int rBN) {
		System.out.println("Confirme os dados para a transfer?ncia: valor R$" + t + ", conta " + rA + ", ag?ncia " + rA2
				+ " e n?mero do banco " + rBN);
	}

	public static void mostraMensagemDeTransferenciaRealizada(String rA, int rA2, int rBN, double t) {
		System.out.printf("Realizado a transfer?ncia para a conta %s, " + "ag?ncia %d e banco %d, no valor de R$%.2f%n", 
				rA, rA2, rBN, t);
	}
}