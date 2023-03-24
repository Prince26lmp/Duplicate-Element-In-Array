package JavaDSA;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		String arr[]= {"Java","C","C++","Java","Python"};
		
		// First Logic
		
		 boolean flag=false;
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=i+1;j<arr.length;j++)
        	 {
        		 if(arr[i]==arr[j])
        		 {
        			 System.out.println("Duplicate Element Found At Index "+j+ " i.e " +arr[j]);
        			 flag=true;
        		 }
        	 }
         }
         if(flag==false)
         {
        	 System.out.println("No Duplicate Element Found In The Array");
         }
	}

}
