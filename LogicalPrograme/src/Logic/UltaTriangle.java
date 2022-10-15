package Logic;

public class UltaTriangle {
public static void main(String[] args) {
	for(int i=1;i<=8;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=8;k>=i;k--) {
			System.out.print(" &");
		}
		System.out.println();
	}
	
}
}
