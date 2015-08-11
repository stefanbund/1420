import java.math.BigInteger;
/**
 * take two significant arrays of type String and BigInteger, and 
 * sort each array
 * @author stefanbund
 */
public class SortComparableObjects {

	public static void main(String[] args) 
	{
		String[] cities = {"Cleveland", "Boston", "Atlanta", "Detroit"}; 
								//an array must contain its data at the time of initialization,
		java.util.Arrays.sort(cities); //sort the content of the cities array
		
		for(String city: cities) //iterate the array, using an enhanced for loop
			System.out.println(city  + " ");
		System.out.println();
		
		BigInteger[] hugeNumbers = {new BigInteger("98798798798798798798798798789"), 
				new BigInteger("987987987987987987"), 
				new BigInteger("09809")};
		
		java.util.Arrays.sort(hugeNumbers); //sort the hugeNumbers array, as it stands
		
		for(BigInteger number : hugeNumbers)
				System.out.println(number  + " ");
	}
}
