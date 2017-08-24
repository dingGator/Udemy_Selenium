
public class RevChar {

	public static void main(String[] args) {
		String inStra ="It is a test string";
		System.out.println("input : " + inStra);
			char reverseChara[] = null; 
			int numChar = 0;
			if(inStra.isEmpty()|| inStra == null) {
				System.out.println("Empty and null string are not accepted");
			}
			if(inStra.length() <=1) {
				reverseChara = inStra.toCharArray();
			}else {
				reverseChara =inStra.toCharArray();
				numChar = reverseChara.length-1;
				
				
				while(numChar >-1) {
					System.out.print(reverseChara[numChar]);
					
					numChar--;
				}
			}
			
		}

	}

