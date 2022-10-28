package kr.co.ezenac.list;

public class MemberArrayListTest
{
	public static void main(String[] args)
	{
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberL = new Member(2022, "리순신");
		Member memberS = new Member(2021, "신사임당");
		Member memberW = new Member(2023, "원균");
		Member memberN = new Member(2024, "나대용");
		Member memberK = new Member(2025, "권율");
		
		memberArrayList.addMember(memberL);
		memberArrayList.addMember(memberS);
		memberArrayList.addMember(memberW);
		memberArrayList.addMember(memberN);
		memberArrayList.addMember(memberK);
		
		memberArrayList.showAllMembers();
		
		System.out.println();
		
		memberArrayList.removeMember(memberW.getMemberId());
		System.out.println("삭제 후");


		memberArrayList.showAllMembers();
		
	}

}
