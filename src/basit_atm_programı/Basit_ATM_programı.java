/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basit_atm_programı;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author SAVAS
 */
public class Basit_ATM_programı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        int bakiye = 1000;
        
        String islemler="1.işlem:bakiye sorgulama\n"+"2.işlem:para cekme\n"+"3.işlem:para yatırma\n"+"4.işlem:cıkış işlemi için q ya basınız";
        
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        
        while (true) {   
             System.out.print("işleminizi seçiniz:");
             String islem=scanner.nextLine();
             
             if(islem.equals("q")){
                 
                 System.out.println("çıkış yapılıyor");
                 break;
                 
             }else if (islem.equals("1")) {
                 
                 System.out.println("bakiyeniz:"+bakiye);
                
            }else if (islem.equals("2")) {
                System.out.print("çekmek istediğiniz tutar:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                
                 if (bakiye-tutar<0) {
                     
                     System.out.println("bakiyeniz yetersiz:"+bakiye);
                     
                 }else{
                     bakiye-=tutar;
                     System.out.println("yeni bakiyeniz:"+bakiye);
                 }
                
            }else if (islem.equals("3")) {
                 System.out.print("yatırmak istediğiz tutar giriniz:");
                 int tutar2=scanner.nextInt();
                 scanner.nextLine();
                 bakiye+=tutar2;
                 System.out.println("yeni bakiyeniz:"+bakiye);
            }
            else{
                 System.out.println("geçersiz işlem");
            }
     
           
            
        }
        
    }
    
}
