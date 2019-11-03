import java.util.*;
public class Test{
    public static void main(String [] args){
        Distance d =new Distance();
        Time t = new Time();
        double speedms, speedkms;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter distance in km and m");
        d.setKm(sc.nextInt());
        d.setM(sc.nextInt());
        System.out.println("enter time in h, m and s");
        t.setH(sc.nextInt());
        t.setM(sc.nextInt());
        t.setS(sc.nextInt());
        
        int totaldm = d.getKm() * 1000 + d.getM();
        int totalts = t.getH()*3600 + t.getM()*60 + t.getS();
        
        speedms = (double)totaldm / totalts;
        speedkms = speedms*3.6;
        //System.out.print("Speed in meters per second " + speedkmh);
        
        System.out.println("Speed:\n" +speedms + " m/s");
        System.out.println("or\n" + speedkms + " km/hr");
    }
}