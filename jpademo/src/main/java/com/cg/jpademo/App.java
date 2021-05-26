package com.cg.jpademo;

public class App {
	public static void main(String[] args) {

		OddEvenThread oddEvenThread = new OddEvenThread();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				oddEvenThread.printEven();

			}
		}, "EvenThread");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				oddEvenThread.printOdd();

			}
		}, "OddThread");

		t1.start();
		t2.start();
		

	}
}

class OddEvenThread {

	boolean isOdd = true;
	int count = 1;
	static final int MAX = 100;

	synchronized void printOdd() {

		while (count < MAX) {

			while (!isOdd) {
				try {

					wait();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+":" + count);
			//System.out.print(count + " ");
			count++;
			isOdd = false;
			notify();
		}
	}

	synchronized void printEven() {

		while (count < MAX) {

			while (isOdd) {
				try {

					wait();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+":" + count);
			//System.out.print(count + " ");
			count++;
			isOdd = true;
			notify();
		}

	}
}