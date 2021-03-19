package com.company;

public class Main {

    public static void main(String[] args) {
    Person Adam = new Person("Adam", "+375", "dada");
    Person Smit = new Student("Smit", "+375", "sobaka", 123,0.7 );
    Person Kika = new Prof("Kika", "+345","jika",7699);
    Adam.asus();
    Smit.asus();
    Kika.asus();
    }
}

class Person{
    private String Name;
    private String PhoneNumber;
    private String Email;
    //private final Object Adres;

    public Person(String Name,
                  String Number,
                  String Email)//Adres("Gomel", "Ptu"))
    {
        this.Name = Name;
        this.PhoneNumber = Number;
        this.Email = Email;
        //this.Adres = Adres;
        //Adres Smit = new Adres("Skorina","Gomel");
        //Adres Adam = new Adres("Ptu","Gomel");
        //Adres Kika = new Adres("bgu","Minsk");

    }

    /*class Adres
    {
        private String street;
        private String City;

        public Adres(String street, String City)
        {
            this.City = City;
            this.street = street;
        }

        public void pokaz()
        {System.out.println("City"+City);
            System.out.println("street"+street);

        }

    }*/


    public void asus()
    { System.out.println("Name "+Name);
        System.out.println("Number "+PhoneNumber);
        System.out.println("Email "+Email);



    }

}
class Student extends Person{
    private int Id;
    private double avmark;

    public Student(String Name, String Number, String Email, int Id, double avmark)
    {super(Name,Number,Email);
      this.Id = Id;
      this.avmark = avmark;
    }

    public void asus()
    { super.asus();
        System.out.println("Id "+Id);
        System.out.println("avmark "+avmark);



    }

}
class Prof extends Person{
    private int Salary;

    public Prof(String Name, String Number, String Email, int Salary)
    { super(Name,Number,Email);
      this.Salary = Salary;

    }

    public void asus()
    { super.asus();
        System.out.println("Salary "+Salary);
    }
}
