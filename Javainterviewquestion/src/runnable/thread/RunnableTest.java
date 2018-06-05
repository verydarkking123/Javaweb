package runnable.thread;

public class RunnableTest implements Runnable{
	private int count=10;
	private int name;
	public RunnableTest(int se)
	{
		name=se;
		System.out.println(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			synchronized(this)
			{
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(count>0)
					count--;
				else
					break;
				System.out.println(name+"   "+count);
			}
			
		}
	}
	public static void main(String args[])
	{
		RunnableTest r1=new RunnableTest(5);
		new Thread(r1).start();
		new Thread(r1).start();
	}

}
