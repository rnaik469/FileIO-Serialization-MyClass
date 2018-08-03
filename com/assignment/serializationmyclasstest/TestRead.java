package com.assignment.serializationmyclasstest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import in.co.cg.myclass.Student;

//Test class 
public class TestRead {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream("student.txt"); // reading data from file
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			list = (List<Student>) ois.readObject();// storing ObjectInputStream objects in the list
			for (Student li : list)
				System.out.println(li);// printing student details

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
