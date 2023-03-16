import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Deque<Person> list = new ArrayDeque<>(generateClients());

        while (!list.isEmpty()){
            Person person = list.pollFirst();
            if (person.ticket > 0){
                person.ticket = person.ticket - 1;
                System.out.println(person.name + " " + person.surname + " прокатился на аттракционе! У него осталось " + person.ticket);
                list.offerLast(person);
                Thread.sleep(1000);
            }
        }
    }

    static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Илья", "Слуцкий", 1));
        personList.add(new Person("София", "Иванова", 2));
        personList.add(new Person("Иван", "Сапсай", 2));
        personList.add(new Person("Елена", "Химич", 2));
        personList.add(new Person("Алина", "Мощева", 3));
        return (personList);
    }


}