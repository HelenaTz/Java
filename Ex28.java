
public class Ex28 {
	public static void main(String[] args) {
		int[]a = new int[5];
		int[]b = new int[5];
		
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 5;
		a[4] = 10;
		
		for(int i = 0; i < a.length; i++) {
			b[a.length - i - 1] = a[i];
		}
		
		System.out.print("Vetor B = ");
        for (int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
	}
}

