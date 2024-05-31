package practice;

public class a {

	public static void main(String[] args) {
		int a[]= {1,-2,3,-4,-7,-7,1,9};
		int b[]=new int[8];
		int j=0,t=0,tc=0;
		for(int i=0;i<a.length;) {
				if(a[i]<0) {
					b[t++]=a[i];
				i++;
				tc++;
				}
				else {
					
					a[j++]=a[i++];
				
			}}
			while(j<8) {
				b[t++]=a[j++];
		}
for(int i=0;i<tc;i++) {
	System.out.print(a[i]);
}
for(int i=0;i<8-tc;i++) {
	System.out.print(b[i]);
}
	}

}
