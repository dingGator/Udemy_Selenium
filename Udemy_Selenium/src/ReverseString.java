
public class ReverseString {

	public static void main(String[] args) {
		String tstr ="this is a test string";
		
		
		System.out.println("before parsing tstr:  " + tstr);
		String[] parsedTstr = tstr.split(" ");
		String revTstr =""; 
		int numWord =0;
		
		
		for(int i=0; i<parsedTstr.length; i++) {
					
			System.out.println("after parsed:  " + parsedTstr[i]);
			numWord =i;
			System.out.println("i:  " + i);
			
		}
		
		System.out.println("numWord:  " + numWord);
		
		while(numWord > -1) {
			revTstr = revTstr.concat(parsedTstr[numWord]+" ");
			System.out.println("revTstr being build:  " + revTstr);
			
			numWord--;
		}
		
		System.out.println("revTstr final:  " + revTstr);
		
		
		
		
		
		

	}

}
