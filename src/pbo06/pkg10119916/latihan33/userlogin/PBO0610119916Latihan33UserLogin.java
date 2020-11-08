/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan33.userlogin;

import java.util.Scanner;
/**
 *
 * @author Thinkpad
 */
public class PBO0610119916Latihan33UserLogin {
    
    private static String usName, passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Masukan Username : ");
         usName = scanner.nextLine();
         System.out.print("Masukan Password : ");
         passWord = scanner.nextLine();
         User user1 = new User();
         user1.checkLogin(usName, passWord);
    }
    
}
