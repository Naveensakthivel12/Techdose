
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		HashMap<Integer,Integer>m=new HashMap<>();
		for(int i=0;i<n;i++){
		    m.put(arr[i],m.getOrDefault(arr[i],0)+1);
		}
        
		int x=n/k;
		for(Map.Entry<Integer,Integer> m1:m.entrySet()){
		    if(m1.getValue()>x){
		       System.out.println(m1.getKey());
		    }
		}
		
	}
}
