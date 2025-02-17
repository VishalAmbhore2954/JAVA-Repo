
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class AreaOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        float len = sc.nextFloat();
        System.out.println("Enter width : ");
        float width = sc.nextFloat();
        float area = len*width;
        System.out.println("Area of rectangle is "+area);
    }
}
