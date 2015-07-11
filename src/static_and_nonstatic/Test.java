package static_and_nonstatic;


class Demo
{
	static int var=9;
	public static void func()
	{
		System.out.println("learning static keyword");
	}
}

class Maine
{

	public static void main(String s[])
	{
		Demo ob = new Demo();
		ob.var=9;
		ob.func();

	}
}

