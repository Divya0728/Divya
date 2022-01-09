package org.college;

public class College {
	private void collegeName() {
		System.out.println("College Name is Hindustan");
	}

	private void collegeCode() {
		System.out.println("College Code is 0163");
	}
	private void collegeRank() {
		System.out.println("College Rank is 5");
	}


	public static void main(String[] args) {
		College c=new College();
		Student s=new Student();
		Hostel h=new Hostel();
		Dept d=new Dept();	

		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		s.studentName();
		s.studentDept();
		s.studentId();
		h.hostelName();
		d.deptName();






	}





}
