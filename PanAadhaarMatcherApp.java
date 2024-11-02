package Aadhaar_PAN_Link;

import java.util.Scanner;

public class PanAadhaarMatcherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        System.out.println("Enter the aadhaar number: ");
        String aadhaarNumber=sc.nextLine();

        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);
        if(aadhaar!=null && pan!=null){
            System.out.println("aadhaar Details ="+aadhaar);
            System.out.println("pan Details ="+pan);
        }else{
            System.out.println("no match found..!!");
        }
    }
}
