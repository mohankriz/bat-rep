package com.stu.data;

public class Student {
	int student_Id;
	String student_name;
	int sub1;
	int sub2;
	int sub3;

	public static void main(String[] args) {
		Student kal = new Student();
		kal.student_Data(1001, "mohan");
		kal.student_Marks(333, 333, 333);

		System.out.println(kal.student_Id);
		System.out.println(kal.student_name);
		System.out.println(kal.sub1);
		System.out.println(kal.sub2);
		System.out.println(kal.sub3);
		kal.totalMarks();

	}

	private void student_Data(int id, String name) {
		student_Id = id;
		student_name = name;
	}

	private void student_Marks(int s1, int s2, int s3) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;

	}

	private void totalMarks() {
		int total = sub1 + sub2 + sub3;
		System.out.println(total);

	}
}
