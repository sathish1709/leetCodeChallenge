package leetCodeChallenge;

public class HashMapImplementation {

	static int range = 1000000;
	//boolean[] arr;

	boolean[] arr = new boolean[range+1];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HashMapImplementation hm = new HashMapImplementation();
		hm.add(5);
		hm.add(6);
		hm.remove(6);
		System.out.print(hm.containsKey(5));
	}

	public void add(int key) {
		arr[key]= true;
	}
	
	void remove(int key) {
		arr[key]= false;
	}
	
	boolean containsKey(int key) {
		return arr[key];
	}
}
