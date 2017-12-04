package Utils;

public class ArrayUtils{

	public static int[] reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++)
        {
            int a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
        }
        return arr;
    }
	
	public static String stringifyArray(int[] arr){
		
		String result = "";
		for(int i =0;i<arr.length;i++){
			if(i == arr.length - 1){
				result += arr[i];
			} else {
				result += arr[i] + ",";
			}
		}
		return result;
		
	}
}
