/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyento;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author TrungNT
 */
public class NguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[100];
        int n;  
        
        try{
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nn=");
            n = Integer.parseInt(oBufferedReader.readLine());
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
}
