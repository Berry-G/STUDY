package kr.co.ezenac.set;

public class MemberHashSetTest
{
	public static void main(String[] args)
	{
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberS = new Member(2021, "신사임당");
		Member memberW = new Member(2023, "원균");
		Member memberN = new Member(2024, "나대용");
		Member memberK = new Member(2025, "권율");

		memberHashSet.addMember(memberS);
		memberHashSet.addMember(memberW);
		memberHashSet.addMember(memberN);
		memberHashSet.addMember(memberK);
//		memberHashSet.showAllmember();
	}

}
