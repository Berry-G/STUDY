package kr.co.ezenac.set02;

import java.util.Iterator;
import java.util.TreeSet;

import kr.co.ezenac.list.Member;

public class MemberTreeSet
{
	private TreeSet<Member> treeSet;

	public MemberTreeSet()
	{
		treeSet = new TreeSet<>();
	}

	public void addMember(Member member)
	{
		treeSet.add(member);
	}

	public boolean removeMember(int memberId)
	{
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext())
		{
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId)
				return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

}
