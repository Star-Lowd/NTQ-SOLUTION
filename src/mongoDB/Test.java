package mongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Test {
	Mongo mongo ;
	public Test() {
		mongo = new Mongo("localhost", 27017);
	}
	
	public void getCollections(){
		DB db = mongo.getDB("test");
		DBCollection collection = db.getCollection("Products");
		DBCursor data = collection.find();
		while (data.hasNext()){
			System.out.println(data.next());
		}
	}
	
	public void insertCollections(String name , int age){
		DB db = mongo.getDB("test");
		DBCollection collection = db.getCollection("Products");
		DBObject newProduct = new BasicDBObject();
		newProduct.put("name", name);
		newProduct.put("age", age);
		collection.insert(newProduct);
	}
	
	
	public void updateCollection(String name, int age){
		DB db = mongo.getDB("test");
		DBCollection collections = db.getCollection("Products");
		DBObject query = new BasicDBObject();
		query.put("name", name);
		
		DBObject update = new BasicDBObject();
		DBObject values = new BasicDBObject();
		values.put("age", age);
		update.put("$set", values);
		
		collections.update(query, update);
		
	}
	
	public void remove (int age){
		DB db = mongo.getDB("test");
		DBCollection collections = db.getCollection("Products");
		DBObject query = new BasicDBObject();
		query.put("age", age);
		collections.remove(query);
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.getCollections();
//		System.out.println("Atfer insert \n\n");
//		test.insertCollections("Jeremy K Sam", 18);
//		test.getCollections();
//		
		System.out.println("Atfer remove \n\n");
		test.updateCollection("Olasehinde Ezekiel", 21);
		test.getCollections();
	}
}
