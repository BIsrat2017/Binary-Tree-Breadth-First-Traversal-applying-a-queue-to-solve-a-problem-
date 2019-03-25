import java.util.*;
/**
 * Write a description of class BubbleUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HeapInsert{
    static int[] a=new int[15];
    static int[] b={20,15,14,10,3,8,12,5,9};
    static int counter;
    public static void main(){
        //int[] a=new int[15];
        //int[] b={20,15,14,10,3,8,12,5,9};
        //System.out.println(Arrays.toString(b));
        for(int i=0;i<a.length;i++){
            if(i<b.length){
            a[i]=b[i];
         }
        }
        hipInsert(4);
        hipInsert(25);
        hipInsert(30);        
        System.out.println(Arrays.toString(a));
    }
    public static  void hipInsert(int o){
      //insureCapacity;
      
      int child=b.length+counter;
      counter++;
      a[child]=o;
      int parent=(child-1)/2;
      while(child>=0&&a[parent]<a[child]){
          int temp=a[parent];
          a[parent]=a[child];
          a[child]=temp;
          child=parent;
          parent=(parent-1)/2;
          
        }
      
    }
    
}
