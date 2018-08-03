package com.assignment.serializationmyclasstest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import in.co.cg.myclass.Student;

//Test Class
public class TestWrite {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();// Instantiating ArrayList
		Student student1 = new Student(1, "Naik");// Instantiating class
		Student student2 = new Student(2, "Rohit");
		Student student3 = new Student(3, "rishi");
		Student student4 = new Student(4, "Rishav");
		Student student5 = new Student(5, "monu");

		// adding elements to list
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);

		try (FileOutputStream fos = new FileOutputStream("student.txt"); // writing data to file
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {// enable the streams to do replacement of
																		// objects in stream
			oos.writeObject(list);
			System.out.println("Serialization done");

		} catch (FileNotFoundException e) {// catching exceptions

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
