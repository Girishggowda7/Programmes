package strings;

public class PrintPositionOfEachwordWithDuplicates
{
public static void main(String[] args) {
	
	String st="i am am from a SDET44 batch";
	String[] s = st.split(" ");
	
	for (int i = 0; i < s.length; i++) {
		
		System.out.println("The Position of "+s[i]+" is "+i);
	}
	
	
	
	
}
	
}
