package Home_Work_OOP_5;

import Home_Work_OOP_5.models.Table;
import Home_Work_OOP_5.models.TableModel;
import Home_Work_OOP_5.presenters.BookingPresenter;
import Home_Work_OOP_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 5, "Станислав");
        bookingView.reservationTable(new Date(), 3, "Иван");

        bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");
        bookingView.changeReservationTable(1002, new Date(), 2, "Иван");
    }

}
