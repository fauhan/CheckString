/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstring;

/**
 *
 * @author fauhan.pugar
 */
public class CheckStringEmptyNull {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        String str3 = "abc123";
        String str4 = "   ";
        if(isNullOrEmpty(str1)){
            System.out.println("First string is null or empty.");
        } else {
            System.out.println("First string is not null or empty.");
        }
        if(isNullOrEmpty(str2)){
            System.out.println("Second string is null or empty.");
        } else {
            System.out.println("Second string is not null or empty.");
        }
        if(isNullOrEmpty(str3)){
            System.out.println("Third string is null or empty.");
        } else {
            System.out.println("Third string is not null or empty.");
        }
        if(isNullOrEmptyWithTrim(str4)){
            System.out.println("Fourth string is null or empty.");
        } else {
            System.out.println("Fourth string is not null or empty.");
        }
    }
    
    public static boolean isNullOrEmpty(String str) {
        return !(str != null && !str.isEmpty());
    }
    
    public static boolean isNullOrEmptyWithTrim(String str) {
        return !(str != null && !str.trim().isEmpty());
    }
}
