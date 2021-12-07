interface Animal
{
	public void eat();

	public abstract void bath(); //protected/default/private abstract void bath();  //not allowed


	default public void walk()
	{
		System.out.println("Walking");
	}
}