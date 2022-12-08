package kunsan.kim.bagchecker;

public class Data_Book
{
	String name;	//책의 이름
	String id;		//태그의 아이디

	public Data_Book(String name, String id)
	{
		this.name = name;
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
}
