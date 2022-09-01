package kr.co.ezenac.abstractclass;

public class ComputerTEst
{
	public static void main(String[] args)
	{
		Computer computer = new Computer();
		computer.display();
		computer.turnoff();
		
		NoteBook myNote = new MyNoteBook();
		myNote.typing();
	}

}
