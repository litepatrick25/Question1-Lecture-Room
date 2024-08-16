package oop_exam;
public class LectureRoom {
    private int numberOfStudents;
    private boolean[] lights; // Array to represent the state of 3 lights

    public LectureRoom() {
        this.numberOfStudents = 0;
        this.lights = new boolean[3]; // Lights are initially off
    }

    public void addStudents(int count) {
        if (count > 0) {
            this.numberOfStudents += count;
            System.out.println(count + " students added. Total students: " + this.numberOfStudents);
        } else {
            System.out.println("Invalid number of students.");
        }
    }

    public void removeStudents(int count) {
        if (count > 0) {
            this.numberOfStudents = Math.max(0, this.numberOfStudents - count);
            System.out.println(count + " students removed. Total students: " + this.numberOfStudents);
        } else {
            System.out.println("Invalid number of students.");
        }
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            if (!lights[lightNumber - 1]) {
                lights[lightNumber - 1] = true;
                System.out.println("Light " + lightNumber + " is now ON.");
            } else {
                System.out.println("Light " + lightNumber + " is already ON.");
            }
        } else {
            System.out.println("Invalid light number.");
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            if (lights[lightNumber - 1]) {
                lights[lightNumber - 1] = false;
                System.out.println("Light " + lightNumber + " is now OFF.");
            } else {
                System.out.println("Light " + lightNumber + " is already OFF.");
            }
        } else {
            System.out.println("Invalid light number.");
        }
    }

    public void printStatus() {
        System.out.println("Number of students: " + numberOfStudents);
        System.out.println("Lights status:");
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "ON" : "OFF"));
        }
    }
}
