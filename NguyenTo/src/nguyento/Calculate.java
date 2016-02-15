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
    
    public void displayNumber(int[] a, int n)
    {
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    
    boolean isNguyenTo(int x)
    {
      if(x<2)  //cac so nho hon 2 khong phai la so nguyen to
          return false; 
      
      for(int i=2; i<=Math.sqrt((float)x); i++)
          if(x%i==0)
              return false;
      
      return true;
    }
    
    public void displayNguyenTo(int[] a, int n)
    {
        System.out.print("\nDay so nguyen to: ");
        for(int i=0; i< n; i++)
            if(isNguyenTo(a[i])==true)
                System.out.print(a[i] + " ");
        
        System.out.println();
    }
}
