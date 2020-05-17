public class MySimpleIntObject implements SimpleObj<Integer> {

	public int myObj = 0;

	public String toString() {
		return String.valueOf(this.myObj);
	}

	public void setObj(Integer obj) {
		try {
			this.myObj = (int)obj;
		} catch (ClassCastException e) {
			throw new IllegalArgumentException("Invalid argument type");
		}
	}

	public Integer getObj() {
		return this.myObj;
	}

	public boolean equals(SimpleObj lhs) {
		try { 
			return (this.getObj() == lhs.getObj());
		} catch (Exception e) { e.printStackTrace(); }

		return false;
	}

	public SimpleObj clone() {
		MySimpleIntObject temp = new MySimpleIntObject();
		temp.setObj(this.myObj);

		return temp;
	}
}