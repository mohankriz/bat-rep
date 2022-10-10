package com.stu.data;

public class Student_Details {
	public static void main(String[] args) {
int a ='m';
System.out.println(a);
		Student_Details call = new Student_Details();
		call.student_Info("ashok kumar");
		call.student_Info(24);
		call.student_Info('M');
		call.student_Info("NO 420 Abase nagar ,govindha street 600028 ");
		call.student_Info("gandhi", 'm');
		call.student_Info(10293847560987890l);

	}

	private void student_Info(String first_Name, String last_Name) {
		System.out.println("student  name: " + first_Name + " " + "last name" + last_Name);
	}

	private void student_Info(int a) {
		System.out.println("student age: " + a);
	}

	private void student_Info(char b) {
		System.out.println("student gender: " + b);

	}

	private void student_Info(String address) {
		System.out.println("student address: " + address);
	}

	private void student_Info(String father_Name, char c) {
		System.out.println("father name: " + father_Name + "." + c);

	}

	private void student_Info(long d) {
		System.out.println("account number: " + d);

	}
}
