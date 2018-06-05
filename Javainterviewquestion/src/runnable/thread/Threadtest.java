package runnable.thread;

public class Threadtest extends Thread{
	public static int count=10;
	public int id;
	private class person{}
	public Threadtest(int id)
	{
		this.id=id;
	}
	public void run()
	{
		while(true)
		{
			synchronized(this)
			{
			if(count>0)
			{
				try {
					wait(15);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count--;
				System.out.println(id+"     "+count);
			}
			else
				break;
			}
		}
	}
	public static void main(String args[])
	{
		Runtime r=Runtime.getRuntime();
		long maxMemory = r.freeMemory();
		System.out.println(maxMemory);
		Threadtest t1=new Threadtest(1);
		new Thread(t1).start();
		new Thread(t1).start();
	}
}
