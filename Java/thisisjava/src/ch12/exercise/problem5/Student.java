package ch12.exercise.problem5;

import ch12.sec03.exam01.Member;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		//return Integer.parseInt(studentNum);
		return studentNum.hashCode(); // 문자열이 같으면 hashCode값도 같음
	}
	
	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Student target) {
        	if(studentNum.equals(target.getStudentNum()))
        		return true;
        }
        
        return false;
    }

}
