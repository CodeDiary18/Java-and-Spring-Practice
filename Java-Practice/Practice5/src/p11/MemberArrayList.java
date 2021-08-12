package p11;

import java.util.ArrayList;
import java.util.Iterator;


public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<Member>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId==memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		return false;
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}