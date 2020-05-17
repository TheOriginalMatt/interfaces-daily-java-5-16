public interface SimpleObj {


	/**
	* Returns a string version of the class
	*
	*@return String value of the object
	*/
	public String toString();

	/**
	* Returns whether or not the given object is equal to this object
	*
	*@param lhs the left hand side of the == operator 
	*@return True if the given object and this object are equal
	*@return False if the given object and this object aren't equal 
	*
	*/
	public boolean equals(SimpleObj lhs);

	/**
	* Returns a clone of this object
	*
	*@return clone of this object
	*/
	public SimpleObj clone();

	/**
	* Setter function for the object stored in the implementation
	*
	*@param obj polymorphic parameter for the object stored in the implementation
	*
	*/
	public void setObj(Object obj);

	/**
	* Getter function for the object stored in the implementation
	*
	*@return polymorphic return for the object stored in the implementation
	*/
	public Object getObj();
}