package JDBC_MySql;

public abstract class AbstractEntity {
	int _id;
	public AbstractEntity() {
		_id = 0;
	}
	
	public AbstractEntity(int _id){
		this._id = _id;
	}
	/**
	 * @return the _id
	 */
	public int get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(int _id) {
		this._id = _id;
	}
	
	

}
