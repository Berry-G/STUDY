package kr.co.Ezenac.incapsulation;

public class DisplayAddress
{
	StringBuffer buffer = new StringBuffer();
	private String line = "=========================\n";
	private String title = "이름\t주소\t\t전화번호\n";
	
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void makeBody()
	{
		buffer.append("이순신 \t");
		buffer.append("서울 강남구 \t");
		buffer.append("010-3232-1577 \t");
		

		buffer.append("이순신 \t");
		buffer.append("서울 서초구 \t");
		buffer.append("010-3212-1127 \t");
		
	}
	
	private void makeFooter()
	{
		buffer.append(line);
	}
//	
//	public String getAddress()
//	{
//		makeHeader();
//		makeBody();
//		makeFooter();
//		return buffer.);
//	}
}
