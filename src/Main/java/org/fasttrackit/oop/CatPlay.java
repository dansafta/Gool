package org.fasttrackit.oop;

public class CatPlay {

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        System.out.println( genericAnimal.getName() );
        System.out.println( genericAnimal.favFood );
        Cat fluffy = new Cat( "Fluffy", "Tuna", "Rubber Mouse" );
        System.out.println( fluffy.getName() );
        System.out.println( fluffy.favFood );
        System.out.println( fluffy.favToy );
        Animal fuffi = new Cat( "Fuffi", "Salmon", "Rubber Fish" );
        acceptAnimal( fuffi );
    }
    public static void acceptAnimal(Animal randAnimal){
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);

        randAnimal.walkAround();
        Cat tempCat = (Cat) randAnimal;
        System.out.println(tempCat.favToy);
        System.out.println(((Cat) randAnimal).favToy);
        if (randAnimal instanceof Cat)
        {
            System.out.println(randAnimal.getName() + " is a Cat");

        }

    }

    }


