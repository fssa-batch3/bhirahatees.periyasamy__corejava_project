package day01.practice;

public class Cat {
   private int age;
   private String color;
   
   public Cat(int age, String color) {
	   this.age = age;
	   this.color = color;
   }
   
   private int getAge() {
	return age;
}



private void setAge(int age) {
	this.age = age;
}



private String getColor() {
	return color;
}



private void setColor(String color) {
	this.color = color;
}

   
   public void speaks() {
	   System.out.println("Meow !");
   }
   
   public static void main(String[] args) {
	   Cat jack = new Cat(4 , "White");
	   Cat tom = new Cat(2 , "Black");
	   
	   System.out.println("Cat 1:");
       System.out.println("Age: " + jack.getAge());
       System.out.println("Color: " + jack.getColor());
       jack.speaks();

       System.out.println("Cat 2:");
       System.out.println("Age: " + tom.getAge());
       System.out.println("Color: " + tom.getColor());
       tom.speaks();
   }
	
	
}
