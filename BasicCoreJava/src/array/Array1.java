package array;

public class Array1 {
	public static void main(String[] args) {
		String[] str = new String[5];
		str[0] = "jay";
		str[1] = "Anand";
		str[2] = "Madan";
		str[3] = "kamal";
		str[4] = "Suraj";
		
		System.out.println(str.length);
		/*for (int i = 0;  i<str.length ; i++) {
			System.out.println(str[i]);
		}*/
		
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
