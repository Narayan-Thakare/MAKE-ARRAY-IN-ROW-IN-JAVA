import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner s = new Scanner(System.in);

		int n=s.nextInt();
		
	int 	a[]=new int [n];
		
	for (int i=0;i<a.length;i++){
		
		a[i]=s.nextInt();
		
	}

		
	for(int i=0;i<a.length-1;i++){
		
		
		System.out.println(a[i]+" "+a[i+1]+" "+(a[i]>a[i+1]));



		for (int j=0; j<a.length-i-1 ; j++){

if(a[j]>a[j+1]){
			
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;


	// by bitwise operator

//	a[j]=a[j]^a[j+1];
//	a[i]=a[j]^a[j+1];
  //       a[j]=a[j]^a[j+1];

	
	
}

		}
		
		
		
	}
	
		for (int i=0;i<a.length;i++){
			
			System.out.println(a[i]);
		}
		
		
	
		
	}
}
