package kr.co.ezenac.ploymorphism;

import java.util.ArrayList;

class Animal
{
	public void move()
	{
	System.out.println("동물이 움직입니다");
	}
	
	public void eat()
	{
		System.out.println("동물이 먹습니다.");
	}
}

class Dog extends Animal
{
	@Override
	public void move()
	{
		System.out.println("개가 네발로 걷습니다.");
	}
	
	public void playBall()
	{
		System.out.println("개가 견주가 던진 공을 물어옵니다.");
	}
}

class Tiger extends Animal
{
	@Override
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunt()
	{
		System.out.println("호랑이가 사냥합니다.");
	}
}

class Eagle extends Animal
{
	public void move()
	{
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void pickup()
	{
		System.out.println("독수리가 물고기를 채갑니다.");
	}
}
public class AnimalTest
{
	public void moveAnimal(Animal animal)
	{
		animal.move();		
	}
	
	public void checkDownCast(ArrayList<Animal> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			Animal animal = list.get(i);
			
			if(animal instanceof Dog)
			{
				Dog danimal = (Dog)animal;	//다운 캐스팅
				danimal.playBall();
			}
			else if(animal instanceof Tiger)
			{
				Tiger tanimal = (Tiger)animal;
				tanimal.hunt();
			}
			else if(animal instanceof Eagle)
			{
				Eagle eanimal = (Eagle)animal;
				eanimal.pickup();
			}
			else
			{
				animal.eat();
			}
		}
	}
	public static void main(String[] args)
	{
		Dog danimal = new Dog();
		Tiger tanimal = new Tiger();
		Eagle eanimal = new Eagle();
		
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(danimal);
		test.moveAnimal(tanimal);
		test.moveAnimal(eanimal);
		
		System.out.println();
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(danimal);
		animalList.add(tanimal);
		animalList.add(eanimal);
		for(Animal animal: animalList)
		{
			animal.move();
		}
		
		System.out.println();
		
		test.checkDownCast(animalList);
	}

}
