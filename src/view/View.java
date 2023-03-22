package view;

import presenter.Presenter;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private Presenter presenter;
    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public String showMenu() {
        System.out.println("\nВыберете пункт:");
        System.out.println("\t1 - добавить заметку,\n\t2 - показать заметку,\n\t3 - показать все заметки,\n\t4 - удалить заметку,\n\t5 - закрыть программу.\n");
        String point = sc.nextLine();
        return point;
    }

    public String scanPoint() {
        System.out.println("\nВведите заметку:");
        String note = sc.nextLine();
        return note;
    }

    public String scanSubPoint() {
        System.out.println("\nВыберете пункт:");
        System.out.println("\t1 - выбрать заметку по индексу,\n\t2 - выбрать заметку по совпадению строки.\n");
        String point = sc.nextLine();

        return point;
    }

    public int scan1SubPoint() {
        System.out.println("\nВведите индекс:");
        int index = sc.nextInt();
        return index;
    }

    public String scan2SubPoint() {
        System.out.println("\nВведите строку:");
        String str = sc.nextLine();
        return str;
    }

    public void show(String note) {
        System.out.println(note);
    }

    public void show(ArrayList<String> notes) {
        System.out.println(notes);
    }

    public void showBye() {
        System.out.println("\nПока!\n");
        System.out.println("p.s. программа закрыта");
        sc.close();
    }
}