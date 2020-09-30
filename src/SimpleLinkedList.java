import java.lang.Exception;
import java.util.List;

public class SimpleArrayList {
	
	public SimpleArrayList() {
		ArrayList = new String[20];
	}
	
	public SimpleArrayList(int initialCapacity) {
		if (initialCapacity <= -1) {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		} else {
			try {
				ArrayList = new String[initialCapacity];
			} catch (Exception e) {
				
			}
		}
	}
	
	public SimpleArrayList(List<String> list) {
		ArrayList = new String[list.size()];
		for (int i = 0; i < ArrayList.length; i++) {
			ArrayList[i] = list.get(i);
		}
	}
	
	String[] ArrayList;
	
	public void add(int index, String s) {
		if (index < 0 || index >= ArrayList.length) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
		} else {
			try {
				if (ArrayList[index] != null) {
					for (int i = ArrayList.length - 1; i >= index; i--) {
						ArrayList[i] = ArrayList[i-1];
					}
				}
				ArrayList[index] = s;
			} catch (Exception e) {
			}
		}
	}
	//good
	public void add(String s) {
		boolean complete = false;
		for (int i = 0; !complete; i++) {
			if (ArrayList[i] == null) {
				ArrayList[i] = s;
				complete = true;
			} else if (i + 1 == ArrayList.length) {
				complete = true;
			}
		}
	}
	//good
	public void clear() {
		for (int i = 0; i < ArrayList.length; i++) {
			ArrayList[i] = null;
		}
	}
	//good
	public boolean contains(String s) {
		for (int i = 0; i < ArrayList.length; i++) {
			if (ArrayList[i] == s) {
				return true;
			}
		}
		return false;
	}
	//good
	public String  get(int index) {
		if (index < 0 || index >= ArrayList.length) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
		} else {
			return ArrayList[index];			
		}
	}
	//good
	public int indexOf(String s) {
		for (int i = 0; i < ArrayList.length; i++) {
			if (ArrayList[i] == s) {
				return i;
			}
		}
			return -1;
	}
	//good 
	public boolean isEmpty() {
		for (int i = 0; i < ArrayList.length; i++) {
			if (ArrayList[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	public String remove(int index) {
		String lastValue = ArrayList[index];
		if (index < 0 || index >= ArrayList.length) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
		} else {
			try {
				ArrayList[index] = null;
				for (int i = index + 1; i < ArrayList.length; i++) {
					ArrayList[i-1] = ArrayList[i];
				}
				ArrayList[ArrayList.length - 1] = null;
				return lastValue;
			} catch (Exception e) {
				
				return e.toString();
			}
		}
	}
	//good

	public boolean remove(String s) {
		  int index = indexOf(s);
	        if(index != -1) {
	            remove(index);
	            return true;
	        }
	        return false;
	}
	// good
	public String set(int index, String s) {
		String set = ArrayList[index];
		if (index < 0 || index >= ArrayList.length) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
		} else {
			try {
				
				
				ArrayList[index] = s;
				return set;
			} catch (Exception e) {
				
				return e.toString();
			}
		}
	}
//
	public int size() {
		int size = 0;
		for (int i = 0; i < ArrayList.length; i++) {
			if (ArrayList[i] != null) {
				size += 1;
			}
		}
		return size;
	}
//good
	public void trimToSize() {
		int newSize = size();
		int newIndex = 0;
		String[] nextArray = new String[newSize];
		for (int i = 0; i < ArrayList.length; i++) {
			if (ArrayList[i] != null) {
				nextArray[newIndex] = ArrayList[i];
				newIndex += 1;
			}
		}
		ArrayList = nextArray;
	}
	//good
	public String toString() {
		int size = size();
		String s = "[";
		for (int i = 0; i < ArrayList.length; i++) {
			if (ArrayList[i] != null) {
				s += ArrayList[i];
				if (i + 1 != size) {
					s += ", ";
				}
			} else {
				size += 1;
			}
		}
		s += "]";
		return s;
	}
}
//good
