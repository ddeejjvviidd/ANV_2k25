/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projekt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ddeejjvviidd
 */
class OrderSubjectTest {
    
	@Test
	void testAddObserverAndNotify_usingEmployeeObserverOutput() {
		OrderSubject subject = new OrderSubject();
		EmployeeObserver obs = new EmployeeObserver("Barista");
		subject.addObserver(obs);

		java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
		java.io.PrintStream oldOut = System.out;
		System.setOut(new java.io.PrintStream(baos));
		try {
			subject.notifyAll("Ordered Coffee");
		} finally {
			System.out.flush();
			System.setOut(oldOut);
		}

		String out = baos.toString().trim();
		assertEquals("Barista notified: Ordered Coffee", out);
	}

	@Test
	void testRemoveObserver_usingEmployeeObserverOutput() {
		OrderSubject subject = new OrderSubject();
		EmployeeObserver obs = new EmployeeObserver("Waiter");
		subject.addObserver(obs);
		subject.removeObserver(obs);

		java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
		java.io.PrintStream oldOut = System.out;
		System.setOut(new java.io.PrintStream(baos));
		try {
			subject.notifyAll("Ordered Cola");
		} finally {
			System.out.flush();
			System.setOut(oldOut);
		}

		String out = baos.toString().trim();
		assertEquals("", out, "Removed observer should not produce output");
	}

	@Test
	void testMultipleObserversReceiveNotification_usingEmployeeObserverOutput() {
		OrderSubject subject = new OrderSubject();
		EmployeeObserver a = new EmployeeObserver("A1");
		EmployeeObserver b = new EmployeeObserver("B2");
		subject.addObserver(a);
		subject.addObserver(b);

		java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
		java.io.PrintStream oldOut = System.out;
		System.setOut(new java.io.PrintStream(baos));
		try {
			subject.notifyAll("Ordered Coffee");
		} finally {
			System.out.flush();
			System.setOut(oldOut);
		}

		String out = baos.toString().trim();
		// Two lines expected, order preserved
		String[] lines = out.split("\\r?\\n");
		assertEquals(2, lines.length);
		assertEquals("A1 notified: Ordered Coffee", lines[0].trim());
		assertEquals("B2 notified: Ordered Coffee", lines[1].trim());
	}
}

