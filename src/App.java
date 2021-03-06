import controller.Controller;
import controller.Message;
import model.dashboardControl;
import view.View;
import model.LoginModel;
import view.dashboard;
import view.dashboardModel;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
    public static void main(String[] args) {
        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

        LoginModel model = new LoginModel();
        View view = new View(queue);

        Controller controller = new Controller(queue, model, view);
        controller.mainLoop();
    }
}
