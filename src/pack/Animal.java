package pack;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String toString ()
 {
     return ("Имя:" + name + "возраст:" + age + "хвост:" + tail) ;
 }


    public boolean equals(Object obj) {

        if (obj != null && obj.getClass() == this.getClass()) {
            Animal animal = (Animal) obj;
            boolean tail = this.tail == animal.tail;
            boolean name = this.name == animal.name;
            boolean age = this.age == animal.age;
            return tail & name & age;
        }

        return false;
    }

    @Override
    public int hashCode() {
     int result=37;
     result = 37 * result + name.hashCode();
     result= 37 * result + age;
     result= 37 * result + (tail ? 1: 0);
        return result;
    }
}
