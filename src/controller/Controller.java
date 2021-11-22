package controller;

import controller.Message;
import controller.LoginMessage;
import model.LoginModel;
import view.View;

import java.util.concurrent.BlockingQueue;

/**
 * Overall controller class. Login controller for now.
 */
public class Controller {
    BlockingQueue<Message> queue;
    LoginModel loginModel;
    View view;

    public Controller(BlockingQueue<Message> queue, LoginModel loginModel, View view) {
        this.queue = queue;
        this.loginModel = loginModel;
        this.view = view;
    }

    public void mainLoop() {
        while (view.isDisplayable()) {
            Message message = null;
            try {
                message = queue.take();
            } catch (InterruptedException exception) {
                //Do nothing
            }

            if(message.getClass() == LoginMessage.class) {
                //Login Button gets clicked.
                LoginMessage loginMessage = (LoginMessage) message;
                loginModel.setUsername(loginMessage.getUsername()); //update model
                loginModel.setPassword(loginMessage.getPassword()); //update model
                view.updateLoginInfo(loginModel.getUsername(), loginModel.getPassword()); //update view
            }
        }
    }
}
