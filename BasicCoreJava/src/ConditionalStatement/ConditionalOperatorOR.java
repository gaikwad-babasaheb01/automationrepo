package ConditionalStatement;

public class ConditionalOperatorOR {
	public static void main(String[] args) {

	int pcm=65;
	int jre=35;
	int cet=60;
	
	if(pcm>=60)
	{
		if(jre>30 || cet>60)
		{
			System.out.println("you are eligible");
		}
		else {
			System.out.println("you are not eligible");
		}
	}
	else {
		System.out.println("you are not eligible");
	}
	}
}
