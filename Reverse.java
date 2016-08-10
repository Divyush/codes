import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(st);
		sb.reverse();
		sb.toString();
		System.out.println(sb);
	}

}
