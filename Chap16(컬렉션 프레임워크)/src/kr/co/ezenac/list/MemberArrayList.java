package kr.co.ezenac.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList
{
	private ArrayList<Member> arrayList;
	
	public MemberArrayList()
	{
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member)
	{
		arrayList.add(member);
	}
	
	//Iterator<E>
	
	public boolean removeMember(int memberId)
	{
		for(int i=0; i<arrayList.size(); i++)
		{
			Member member =	arrayList.get(i);
			//멤버 아이디가 매개변수와 같으면 삭제
			if (member.getMemberId() == memberId)
			{
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "는 존재하지 않는 ID 입니다.");
		return false;
	}
	
	public void showAllMembers()
	{
		for(Member member : arrayList)
			System.out.println(member);
		System.out.println();
	}

}
