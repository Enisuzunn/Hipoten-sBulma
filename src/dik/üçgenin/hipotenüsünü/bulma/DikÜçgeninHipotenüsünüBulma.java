
package dik.üçgenin.hipotenüsünü.bulma;

import java.util.Scanner;

public class DikÜçgeninHipotenüsünüBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin boy kısmı:");
        int a = scanner.nextInt();
        System.out.println("Üçgenin alt kısmı:");
        int b = scanner.nextInt();
        
        double hip = Math.sqrt(a*a+b*b);
        System.out.println("Üçgenin hipotenüsü:" + hip);
    }
    
}
