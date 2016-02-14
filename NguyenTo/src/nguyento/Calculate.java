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
public class Calculate {
    public void inputNumber(int[] a, int n)
    {
        try{
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));            
            
            for(int i=0; i<n; i++)
            {
                System.out.print("a[" + i + "]=");
                a[i] = Integer.parseInt(oBufferedReader.readLine());                
            }
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
