package org.example.ifelseif;

import java.util.Scanner;

public class ElseIfCan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dogum tarixinizi qeyd edin: ");
        int dogumTarixi = input.nextInt();
        int sizinYasiniz = 2025 - dogumTarixi;

        if (sizinYasiniz > 18) {
            System.out.println("Sizin yasiniz: " + sizinYasiniz);
        } else if (sizinYasiniz == 18) {
            System.out.println(sizinYasiniz + "Sizin yasiniz :" + "18 oldugu ucun " + sizinYasiniz);
        } else {
            System.out.println("Giris qadagandir:"  + sizinYasiniz);
        }
    }
}
