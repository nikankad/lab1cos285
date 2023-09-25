

public class myArrayList<E> {
// made by nikan
 private static final int INITIAL_CAPACITY = 50;
 private static final double GROWTH_POLICY = 0.2;
 private Object[] array;
 private int size;

 // Constructor made by nikan
 public myArrayList() {
     array = new Object[INITIAL_CAPACITY];
     size = 0;
 }
 
 public int getSize() 
 {
	 return size;
 }
 
 public Object[] getArray() 
 {
	 return array;
 }

 // IndexOf Method
 // Written by Colby
 int indexOf(Fraction input)
 {
	 for(int i = 0; i < array.length; i++)
	 {
		 if(input.compare((Fraction) array[i]) == 0)
		 {
			 return i;
		 }
	 }
	 
	 return -1;
 }
 
 
}
