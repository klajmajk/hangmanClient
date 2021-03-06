/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.id2212.hw1.client;

import se.kth.id2212.common.Request;
import se.kth.id2212.common.RequestStatus;
import se.kth.id2212.common.Response;
import se.kth.id2212.common.ResponseStatus;
import se.kth.id2212.hw1.client.view.View;

/**
 *
 * @author Lucas
 */
public class Controller {

    private ConnectionHandler connectionHandler;
    private View view;

    public Controller() {

    }

    public void setView(View view) {
        this.view = view;
    }

    public void connect(String address, int port) {
        this.connectionHandler = new ConnectionHandler(address, port);
        this.view.notifyConnected(connectionHandler.getStatus());
    }

    public void connect() {
        this.connectionHandler = new ConnectionHandler();
        this.view.notifyConnected(connectionHandler.getStatus());
    }

    public void guessLetter(char letter) {
        Request req = new Request(RequestStatus.GUESS_LETTER, letter);
        Response resp = connectionHandler.sendRequest(req);

        handleResponse(resp);
    }

    public void startNewGame() {
        Request req = new Request(RequestStatus.START_NEW_GAME);
        Response resp = connectionHandler.sendRequest(req);

        handleResponse(resp);
    }

    public void guessWord(String word) {
        Request req = new Request(RequestStatus.GUESS_WORD, word);
        Response resp = connectionHandler.sendRequest(req);

        handleResponse(resp);
    }

    public void handleResponse(Response resp) {
        ResponseStatus s = resp.getStatus();
        int score = resp.getScore();
        int leftTries = resp.getLeftTries();
        String currentWord = resp.getHiddenWord();
        
        view.notifyScore(score);
        view.notifyMessage(s);
        view.notifyLeftTries(leftTries);
        view.notifyCurrentWord(currentWord);

        System.out.println(resp);
    }
}
