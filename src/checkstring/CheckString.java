/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstring;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fauhan.pugar
 */
public class CheckString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> myList = new ArrayList<>();
        myList.add("ID TRANS BPJS :B7329F77E100B87B");
        myList.add("NO VA : 8888801260838899");
        myList.add("JML PESERTA :04 ORANG");
        myList.add("SISA SBLMNYA :RP 0");
        
        for(String str: myList) {
            if(str.trim().contains("ID TRANS BPJS"))
               System.out.println(str.trim());
            if(str.trim().substring(0,13).equals("ID TRANS BPJS"))
               System.out.println(str.trim());
        }
    }
    
}
