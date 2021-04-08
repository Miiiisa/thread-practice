import java.util.Random;

public class ZTMain {
    public static void main (String[] args){
        //int n = Integer.parseInt(args[0]);
        int nums[] = new int[5000];
        Random r = new Random();
        for(int i=0;i<nums.length;i++) {
            nums[i]= r.nextInt(1000);
            //System.out.println(nums[i]);
        }

        //ZTResult rSum = new ZTResult();
        ZTSum rSum=new ZTSum(nums);
        ZTMax rMax=new ZTMax(nums);
        ZTAverage rAve=new ZTAverage(nums);
        //Thread th0 = new Thread(new ZTSum(rSum, nums));
        Thread th0 = new Thread(rSum);
        Thread th1 = new Thread(rMax);
        Thread th2 = new Thread(rAve);
        th0.start();
        th1.start();
        th2.start();
        try{
            th0.join();
            th1.join();
            th2.join();
            System.out.println("The Sum, Max and Average  is: "+rSum.sum+" "+rMax.max+" "+rAve.ave);
        }catch(InterruptedException e){}
    }
}
