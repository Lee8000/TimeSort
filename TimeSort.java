public class TimeSort {
	public static void main(String[] args) {
		int[] numAry = {9,2,6,4,3,7,8,5};
		for(int num:numAry) {
			new SleepThread(num).start();
		}
	}
}

class SleepThread extends Thread{
	private int num;
	public SleepThread(int num) {
		this.num=num;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(num*1000);
			System.out.println(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}