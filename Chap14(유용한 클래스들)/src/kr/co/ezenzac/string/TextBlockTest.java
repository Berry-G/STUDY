package kr.co.ezenzac.string;

public class TextBlockTest
{
	public static void main(String[] args)
	{
		String textBlock = """"
				This is a typhoon
				비가 계속 온다고 합니다.
						""";
				System.out.println(textBlock);
		System.out.println(getTextBlockofHtml);
	}
	
	public static String getTextBlockofHtml()
	{
		return """
				<html>
					<body>
						<span>Good Bye typhoon!</span>
					</body>
				</html>
				""";
	}

}
