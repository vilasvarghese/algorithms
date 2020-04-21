package common;

/*
 *          * 
    	   * * 
    	  * * * 
    	 * * * * 
    	* * * * * 
 */
public class PrintPyramid {

	public static void main(String[] args) {
		printPyramid(10);
		printPyramid1(8);
	}
	
	public static void printPyramid(int count){
		StringBuilder sb = new StringBuilder();
		String sep = "";
		for (int i=0; i< count; i++) {
			System.out.println( sb.append(sep).append("*") );
			sep = " ";
		}
	}
	
	public static void printPyramid1(int count){
		StringBuilder sb = new StringBuilder();
		String sep = "";
		String initSpace = "";
		for (int i=0; i<count;i++) {
			initSpace += " ";
		}
		for (int i=0; i< count; i++) {
			System.out.print(initSpace);
			System.out.println( sb.append(sep).append("*") );
			sep = " ";
			initSpace = initSpace.substring(1);
		}
	}
}
