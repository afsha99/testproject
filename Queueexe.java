package java_project;

import java.util.LinkedList;
import java.util.Queue;

public class Queueexe {
	public static void main(String[] args) {
		Queue <String>locationsQueue = new LinkedList<>();
		locationsQueue.add("Afshan");
		locationsQueue.add("Neha");
		locationsQueue.add("Rekha");
		locationsQueue.add("Jasweer");
		locationsQueue.add("Anup");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}

}

