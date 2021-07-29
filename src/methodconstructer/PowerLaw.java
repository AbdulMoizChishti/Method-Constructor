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

public class PowerLaw {
  int cur;int vol;int pw;
    public void CP(int cur,int vol){
        this.cur=cur;
        this.vol=vol;

    
    }  

    public void setmeth(){
    pw=vol*cur;
        System.out.println(pw);
    }


}


