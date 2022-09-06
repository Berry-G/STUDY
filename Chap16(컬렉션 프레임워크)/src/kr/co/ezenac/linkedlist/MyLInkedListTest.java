package kr.co.ezenac.linkedlist;

public class MyLInkedListTest
{
	public static void main(String[] args)
	{
		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.addElement("D");
		list.printAll();
		
		list.insertElement(4, "F");
		list.printAll();

		list.removeElement(0);
		list.printAll();
		list.removeElement(1);
		list.printAll();
		
		list.removeAll();
		list.printAll();
		
		list.addElement("a");
		list.addElement("b");
		list.printAll();
		
	}

}
