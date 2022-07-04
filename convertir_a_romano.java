import java.util.Scanner;
public class convertir_a_romano{

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n;
        String romano="";
        int u, d, c, m;
        int nx;
        System.out.print("Ingrese el entero: ");
        n=teclado.nextInt();
        nx=n;
        
        m=nx/1000; 
        nx=nx%1000;  
        c=nx/100; 
        nx=nx%100; 
        d=nx/10; 
        nx=nx%10; 
        u=nx;

        for (int i = 1; i <= m; i++) {
            romano += "M";
        }
        switch (c) {
            case 1:
                romano += "C";
                break;
            case 2:
                romano += "CC";
                break;
            case 3:
                romano += "CCC";
                break;
            case 4:
                romano += "CD";
                break;
            case 5:
                romano += "D";
                break;
            case 6:
                romano += "DC";
                break;
            case 7:
                romano += "DCC";
                break;
            case 8:
                romano += "DCCC";
                break;
            case 9:
                romano += "CM";
                break;
        }
        switch (d) {
            case 1:
                romano += "X";
                break;
            case 2:
                romano += "XX";
                break;
            case 3:
                romano += "XXX";
                break;
            case 4:
                romano += "XL";
                break;
            case 5:
                romano += "L";
                break;
            case 6:
                romano += "LX";
                break;
            case 7:
                romano += "LXX";
                break;
            case 8:
                romano += "LXXX";
                break;
            case 9:
                romano += "XC";
                break;
        }
        switch (u) {
            case 1:
                romano += "I";
                break;
            case 2:
                romano += "II";
                break;
            case 3:
                romano += "III";
                break;
            case 4:
                romano += "IV";
                break;
            case 5:
                romano += "V";
                break;
            case 6:
                romano += "VI";
                break;
            case 7:
                romano += "VII";
                break;
            case 8:
                romano += "VIII";
                break;
            case 9:
                romano += "IX";
                break;
        }
        System.out.println("La conversion a Romano es: " + romano);







        
    }
}