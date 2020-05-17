public class MySimpleStrObject implements SimpleObj {
	private String myString;

	public void setObj(Object str) {
		try {
			this.myString = (String)str;
		} catch (ClassCastException e) {
			throw new IllegalArgumentException("Invalid argument type");
		}

	}

	public String getObj() {
		return this.myString;
	}

	public String toString() {
		return this.getObj();
	}

	public boolean equals(SimpleObj lhs) {
		try {
			return (this.getObj().equals(lhs.getObj()));
		} catch (Exception e) { e.printStackTrace(); }

		return false;
	}

	public SimpleObj clone() {
		MySimpleIntObject temp = new MySimpleIntObject();
		temp.setObj(this.myString);

		return temp;
	}
}