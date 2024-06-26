package com.assignment;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int priority;

    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class EmergencyRoom {
    private PriorityQueue<Patient> queue = new PriorityQueue<>();

    public void addPatient(String name, int priority) {
        queue.offer(new Patient(name, priority));
        System.out.println("Added: " + name);
    }

    public void treatNextPatient() {
        Patient patient = queue.poll();
        if (patient != null) {
            System.out.println("Treating: " + patient);
        } else {
            System.out.println("No patients in queue.");
        }
    }

    public void displayQueue() {
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        EmergencyRoom emr = new EmergencyRoom();

        emr.addPatient("Rushi", 3);
        emr.addPatient("DK", 1);
        emr.addPatient("AK", 2);

        emr.displayQueue();
        emr.treatNextPatient();
        emr.displayQueue();
    }
}