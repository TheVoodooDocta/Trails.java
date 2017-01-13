import java.util.Scanner;
public class Trails {

	public static void main(String[] args) {
		int eleToSearch;
		int [] markers = new int [] {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		
		for (int i : markers){
			System.out.print(i+" ");
		}
		Scanner console = new Scanner(System.in);
		System.out.println("\n Please enter an elevation to search for...");
		
		eleToSearch = console.nextInt();
		
		System.out.println("The maximum elevation on this trail is: "+findMax(markers));
		System.out.println("The average elevation of this trail is: "+findAve(markers));
		System.out.println("The index at which elevation "+eleToSearch+" appears in this trail is: "+findMarkerIndex(markers, eleToSearch));
	}
	
	public static int findMax(int [] inputArray){
		int x = inputArray[0];
		for (int i = 1; i < inputArray.length; i++)
			if (inputArray [i] > x )
				x = inputArray [i]; 
		return x;
		}
	
	public static double findAve(int [] inputArray){
		double x = 0;
		for (int i = 0; i < inputArray.length; i++){
			x += inputArray[i];
		}
		return x / inputArray.length;
	}
	public static int findMarkerIndex (int [] inputArray, int eleToSearch){
		for (int i = 0; i < inputArray.length; i++){
			if (inputArray [i] == eleToSearch)
				return i;
		}
		return -1;
	}
	
}
