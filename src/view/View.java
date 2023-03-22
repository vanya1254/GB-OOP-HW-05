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
        System.out.println("Выберете пункт:");
        System.out.println("1 - добавить заметку,\n2 - показать заметку,\n3 - показать все заметки,\n4 - удалить заметку,\n5 - закрыть программу.");
        String point = sc.nextLine();
        return point;
    }

    public String scanPoint() {
        System.out.println("Введите заметку:");
        String note = sc.nextLine();
        return note;
    }

    public String scanSubPoint() {
        System.out.println("Выберете пункт:");
        System.out.println("1 - выбрать заметку по индексу,\n2 - выбрать заметку по совпадению строки.");
        String point = sc.nextLine();

        return point;
    }

    public int scan1SubPoint() {
        System.out.println("Введите индекс:");
        int index = sc.nextInt();
        return index;
    }

    public String scan2SubPoint() {
        System.out.println("Введите строку:");
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
        System.out.println("Пока!");
        System.out.println();
        System.out.println("p.s. программа закрыта");
        sc.close();
    }
}