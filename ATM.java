package com.machine.atm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// User
class User {
	private double balance;

	User(double balance) {
		this.balance = balance; // Initial Balance
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		if (amt > 0) {
			balance += amt;
		}
	}

	public boolean withdraw(double amt) {
		if (amt > 0 && amt <= balance) {
			balance -= amt;
			return true;
		}
		return false;
	}
}

// ATM
public class ATM extends User {

	public ATM(double balance) {
		super(balance);
		createAtm();
	}

	private void createAtm() { // method for creating GUI
		JFrame jf = new JFrame("ATM");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300, 200);
		jf.setLayout(null);

		JLabel balanceLabel = new JLabel("Balance: ₹" + getBalance());
		balanceLabel.setBounds(20, 20, 200, 25);
		jf.add(balanceLabel);

		JButton depositBtn = new JButton("Deposit");
		depositBtn.setBounds(20, 60, 100, 25);
		jf.add(depositBtn);

		JButton withdrawBtn = new JButton("Withdraw");
		withdrawBtn.setBounds(150, 60, 100, 25);
		jf.add(withdrawBtn);

		JButton balanceBtn = new JButton("Check Balance");
		balanceBtn.setBounds(20, 100, 230, 25);
		jf.add(balanceBtn);

		// Event handling for 'deposit' button
		depositBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String amtStr = JOptionPane.showInputDialog(jf, "Enter deposit amount:");
				if (amtStr != null && !amtStr.isEmpty()) {
					try {
						double amount = Double.parseDouble(amtStr);
						deposit(amount);
						balanceLabel.setText("Balance: ₹" + getBalance());
						JOptionPane.showMessageDialog(jf, "Deposit successful!", "Success",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(jf, "Enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		// Event handling for 'withdraw' button
		withdrawBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String amtStr = JOptionPane.showInputDialog(jf, "Enter withdrawal amount:");
				if (amtStr != null && !amtStr.isEmpty()) {
					try {
						double amount = Double.parseDouble(amtStr);
						if (withdraw(amount)) {
							balanceLabel.setText("Balance: ₹" + getBalance());
							JOptionPane.showMessageDialog(jf, "Withdrawal successful!", "Success",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(jf, "Insufficient balance!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(jf, "Enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		// Event handling for 'check balance' button
		balanceBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jf, "Your current balance is: ₹" + getBalance(), "Balance",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new ATM(1000.0); // Initial balance = ₹1000
	}
}
