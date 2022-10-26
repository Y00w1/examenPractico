package com.example.examenpractico.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtAgeClient;
    @FXML
    private TextField txtNameClient;
    @FXML
    private TextArea fieldClients;
    @FXML
    void initialize() {
        assert txtAgeClient != null : "fx:id=\"txtAgeClient\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtNameClient != null : "fx:id=\"txtNameClient\" was not injected: check your FXML file 'hello-view.fxml'.";
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    void onListClient(ActionEvent event) {

    }

    @FXML
    void onSaveClient(ActionEvent event) {

    }
}
