
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		int key=0,j=0;
		for(int i=1;i<n;i++){
		   key=arr[i];
		    j=i-1;
		    while(j>=0 && arr[j]>key){
		        arr[j+1]=arr[j];
		        j=j-1;
		    }
		     arr[j + 1] = key;
		}
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]);
		}
		
	}
}
