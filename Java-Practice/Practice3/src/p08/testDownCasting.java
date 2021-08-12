package p08;
import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직인다!");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 움직인다!");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽는다!");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 움직인다!");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다!");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아간다!");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아간다!");
	}
}

public class testDownCasting {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("Error");
			}
		}
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
