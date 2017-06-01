/**
 * 
 */
/**
 * @author Star Blazh
 *
 */
package AdvanceThread;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class People extends Thread{
	private static final int MAX_AGE = 100;
	private static final int MIN_AGE = 80;
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
	private Map<String, Integer> people;
	
	public People() {
		this.people = new ConcurrentHashMap();
	}
	
	private void InsertPerson(String name , Integer age){
		people.put(name, age);
		System.out.println(name+" with "+ age +" age have been added");
	}
	
	public void UpdatePeople(){
		for(Map.Entry<String, Integer> p : people.entrySet()){
			p.setValue(p.getValue()+1);
			System.out.println(p.getKey()+" with "+ p.getValue() +" age have been updated");
		}
	}
	
	public void RemovePeople(){
		for(String key : people.keySet()){
			if (people.get(key) > MAX_AGE){
				people.remove(key);
				System.out.println(key+" have been removed\n"+key);
			}
		}
	}
	
	private String generateName(){
		String name = "";
		for (int a = 0 ; a < 5+(new Random()).nextInt(6); a++ ) {
			name += CHARACTERS.toCharArray()[(new Random()).nextInt(CHARACTERS.toCharArray().length)];
		}
		return name;
	}

	public void Add(){
		
		this.InsertPerson(generateName(), MIN_AGE+(new Random()).nextInt(20));
	}
	
	
}