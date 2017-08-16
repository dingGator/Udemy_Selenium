
public class StringRT {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = str1;
		str1= "Welcome";
		System.out.println("Newly initialized string: " + str1);
		System.out.println("Newly initialized string: " + str2);
		int len1 =str1.length();
		int len2 =str2.length();
		System.out.println("Length of string: "+len1);
		System.out.println("Length of string: "+len2);
		
		String concat = str1+" "+ str2;
		System.out.println("Concat output: "+concat);
		String concat1 =str1.concat(str2);
		System.out.println("concat output: "+concat1);
		String sub =str1.substring(0, 3);
		System.out.println("Substring: "+sub);
	}

}
