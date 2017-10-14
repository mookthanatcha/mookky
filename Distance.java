
package preparetestifelse;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.##") ;
        
        System.out.print("Select type of warning (A,B): ");
        String type = sc.next();
        
        System.out.print("Enter reference position (x,y): ");
        double rpX = sc.nextDouble();
        double rpY = sc.nextDouble();
        
        System.out.print("Enter patient position (x,y): ");
        double ppX = sc.nextDouble();
        double ppY = sc.nextDouble();
        
        double answer = comopute(rpX,rpY,ppX,ppY);
        String answer2 = check(answer);
        System.out.println("Distance is "+ dc.format(answer)+ " unit");
        System.out.println(answer2);
        
    }
    public static double comopute(double rpX,double rpY,double ppX,double ppY){
        double ans;
        ans = Math.sqrt(Math.pow(ppX-rpX,2)+Math.pow(ppY-rpY,2));
        return ans;        
    }
    
    public static String check(double answer){
        String ans = "";
        if(answer < 10 || answer < 50){
            ans = "ไม่มีข้อความแจ้งเตือน";
        }
        else if((answer>=10 && answer<15) || (answer >=50 && answer < 100)){
            ans = "Warning! Yellow zone";
        }
        else if((answer>=15 && answer<20)||(answer>=100 && answer<150)){
            ans = "Warning! Red zone";
        }
        else if(answer >= 20 || answer >= 150){
            ans = "Out of the safe zone!";
        }
        return ans;
    }
}
