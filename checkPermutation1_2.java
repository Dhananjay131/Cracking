public class checkPermutation1_2{
	public static void main(String[] args){
		System.out.println("permutation result: " + permutation("OW. L", "LWO"));
	}


	public static boolean permutation(String s, String t){
		if(s.length() !=t.length()) return false;

		int[] letters = new int[128];

		char[] s_array = s.toCharArray();
		for (char ch: s_array){
			letters[ch]++;
		}

		for (int i=0; i<t.length(); i++){
			int val = t.charAt(i);
			letters[val]--;

			if(letters[val]<0) return false;
		}
		return true;
	}
}