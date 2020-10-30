package com.company;

import java.awt.event.TextListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Введите размер ArrayList:");
	    TestArray test1 = new TestArray(scan.nextInt());
	    test1.adding();
	    test1.out();
	    test1.outSize();
	    test1.arrayRemove(0);
	    test1.out();
	    test1.arrayClear();

		System.out.println("Введите размер LinledList:");
		TestLinked test2 = new TestLinked(scan.nextInt());
		test2.additing();
		System.out.println("Введите номер добавляемого элемента:");
		test2.addElement(scan.nextInt());
		test2.firstLast();
		test2.out();
		test2.outDelFL();
		test2.out();
    }
}
