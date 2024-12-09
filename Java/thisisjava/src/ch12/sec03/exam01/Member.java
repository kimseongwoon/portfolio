package ch12.sec03.exam01;

public class Member extends Object {
public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 같은 회원인지를 판단하는 건 id로 체크해서 판단하도록 메소드를 재정의
	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Member target) {
        	if(id.equals(target.id))
        		return true;
        }
        
        return false;
    }

}
