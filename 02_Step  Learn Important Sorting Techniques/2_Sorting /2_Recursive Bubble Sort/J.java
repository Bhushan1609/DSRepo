import java.util.*;
public class J{
    static void bubbleSort(Vector<Integer>v,int i){
        if(i>=v.size())return ;
        int maxiIndex=0;
        for(int j=0;j<(v.size()-i);j++){
            if(v.get(j) >v.get(maxiIndex))maxiIndex=j;
        }
        int temp=v.get(maxiIndex);
        v.set(maxiIndex,v.get(v.size()-i-1));
        v.set(v.size()-i-1,temp);
        bubbleSort(v,i+1);
    }
    public static void main(String args[]){
        Vector<Integer>v=new Vector<>();
        v.add(43);
        v.add(12);
        v.add(4);
        v.add(566);
        v.add(2);
        v.add(33);
        v.add(78);
        bubbleSort(v,0);
        System.out.println(v);
    }
}

