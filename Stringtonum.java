import java.io.*;
public class Stringtonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
		int n= Integer.parseInt(br.readLine());
		System.out.println(n);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
