public class MySimpleStrObject implements SimpleObj<String> {
	private String myString;

	public void setObj(String str) {
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
		MySimpleStrObject temp = new MySimpleStrObject();
		temp.setObj(this.myString);

		return temp;
	}
}