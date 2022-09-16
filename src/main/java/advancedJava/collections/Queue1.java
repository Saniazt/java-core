package advancedJava.collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue1 {
  public static void main(String[] args) {
    PersonForQueue personForQueue1 = new PersonForQueue(1);
    PersonForQueue personForQueue2 = new PersonForQueue(2);
    PersonForQueue personForQueue3 = new PersonForQueue(3);
    PersonForQueue personForQueue4 = new PersonForQueue(4);

    /*  Queue<PersonForQueue> queueLinkedList = new LinkedList<>(); //Это реализация Queue для LL
    queueLinkedList.add(personForQueue3);
    queueLinkedList.add(personForQueue2);
    queueLinkedList.add(personForQueue4);
    queueLinkedList.add(personForQueue1);*/
    /*  for (PersonForQueue persons : queueLinkedList) { //Цикл for each для вывода на экран
      System.out.println(persons);
    } */

    Queue<PersonForQueue> queueBlockingArray =
        new ArrayBlockingQueue<>(3); // указываем макс кол-во число нашего списка
    queueBlockingArray.offer(personForQueue2);
    queueBlockingArray.offer(personForQueue1);
    queueBlockingArray.offer(personForQueue4);
    queueBlockingArray.offer(personForQueue3); // этот уже не влезет

   /* for (PersonForQueue persons123 : queueBlockingArray) {
      System.out.println(persons123);
    }*/

    /*   System.out.println(queueBlockingArray.remove());
    System.out.println(queueBlockingArray.peek());*/
  }
}

class PersonForQueue {
  private int id;

  public PersonForQueue(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "PersonsForQueue{" + "id=" + id + '}';
  }
}
