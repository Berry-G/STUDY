package kr.co.ezenac.set;

import java.lang.reflect.Member;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MemberHashSet
{
	private HashSet<Member> hashSet;
	
	public MemberHashSet()
	{
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member)
	{
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId)
	{
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext())
		{
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId)
			{
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

}
