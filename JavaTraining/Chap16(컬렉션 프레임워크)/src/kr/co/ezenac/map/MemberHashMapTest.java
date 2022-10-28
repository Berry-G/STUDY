package kr.co.ezenac.map;

public class MemberHashMapTest
{
	public static void main(String[] args)
	{
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberS = new Member(2021, "신사임당");
		Member memberW = new Member(2023, "원균");
		Member memberN = new Member(2024, "나대용");
		Member memberK = new Member(2025, "권율");

		memberHashMap.addMember(memberS);
		memberHashMap.addMember(memberW);
		memberHashMap.addMember(memberN);
		memberHashMap.addMember(memberK);
		
		memberHashMap.showAllmember();
		
		memberHashMap.removeMember(0);
		memberHashMap.showAllmember();

	}

}
