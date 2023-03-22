package presenter;

import model.Model;
import view.View;

public class Presenter {
    private Model model;
    private View view;

    public Presenter() {
        this.model = new Model();
        this.view = new View();
    }

    public void program() {
        boolean condition = true;
        while (condition) {
            switch (view.showMenu()) {
                case ("1"):
                    model.setNote(view.scanPoint());
                    break;
                case ("2"):
                    if (view.scanSubPoint().equals("1"))
                        view.show(model.getNote(view.scan1SubPoint()));
                    else view.show(model.getNote(view.scan2SubPoint()));
                    break;
                case ("3"):
                    view.show(model.getNotes());
                    break;
                case ("4"):
                    if (view.scanSubPoint().equals("1"))
                        model.removeNoteAt(view.scan1SubPoint());
                    else model.removeNote(view.scan2SubPoint());
                    break;
                case ("5"):
                    view.showBye();
                    condition = false;
                    break;
            }
        }
    }
}
