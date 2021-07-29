/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodconstructer;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.util.Scanner;
public class MethodConstructer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner obj=new Scanner (System.in);
    int cur=obj.nextInt();
    int vol=obj.nextInt();
    
    PowerLaw pwl=new PowerLaw();
    pwl.CP(cur, vol);
    pwl.setmeth();
    }
}
