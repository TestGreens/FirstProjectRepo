package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("Savings a/c");

	}
	private void fixed() {
		System.out.println("Fixed a/c");

	}
	public static void main(String[] args) {
		BankInfo bi=new BankInfo();
		bi.deposit();
		bi.fixed();
		bi.saving();
	}
}
