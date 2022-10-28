package kr.co.ezenac.set02;

import java.util.TreeSet;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("이순신");
		treeSet.add("류성룡");
		treeSet.add("신사임당");
		//String, Interger 등 JDK의 많은 클래스들이 이미 Comparable을 구현되어 있으므로 정렬되어 출력됨.
		
		for(String str : treeSet)
		{
			System.out.println(str);
			
		}
	}

}
