package com.company.day048;

class G2<K,V>{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "G2 [key=" + key + ", value=" + value + "]";
	}
	
	
}



public class Generic002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G2<Integer,Integer> test1 = new G2<>();
		test1.setKey(1);
		test1.setValue(10);
		System.out.println(test1);
		
		G2<Integer,String> test2 = new G2<>();
		test2.setKey(1);
		test2.setValue("ten");
		System.out.println(test2);
		
		
		
	}

}
