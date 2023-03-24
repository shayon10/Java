import java.util.Vector;

public class Train {
    public static void main(String args[]){

        int i1=0,even=0;

        Vector<Integer> v = new Vector<>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        for (int i=0; i<v.size();i++){
            if ((v.get(i)& 1)==1){ i1++;}
            else even++;
        }
        System.out.println(even);
    }}