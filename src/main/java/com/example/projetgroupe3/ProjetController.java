package com.example.projetgroupe3;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class ProjetController {

    @FXML
    private AnchorPane apAdmin;
    @FXML
    private AnchorPane apEtudiant;
    @FXML
    private Button btnValider;
    @FXML
    private Button btnDem;
    @FXML
    private Button btnComp;
    @FXML
    private Button btnAide;
    @FXML
    private AnchorPane apComp;
    @FXML
    private AnchorPane apDem;
    @FXML
    private AnchorPane apAide;
    @FXML
    private TextField txtId;
    @FXML
    private Button btnCreerComp;
    @FXML
    private Button btnModifComp;
    @FXML
    private TableView tvMat;
    @FXML
    private TableColumn tcMat;
    @FXML
    private TableView tvSousMat;
    @FXML
    private TableColumn tcSousMat;
    @FXML
    private TextField txtMdp;
    @FXML
    private Button btnCreerDem;
    @FXML
    private Button btnModifDem;
    @FXML
    private TableView tvMatDem;
    @FXML
    private TableColumn tcMatDem;
    @FXML
    private TableView tvSousMatDem;
    @FXML
    private TableColumn tcSousMatDem;
    @FXML
    private TreeView tvAides;

    @FXML
    public void btnValiderClicked(Event event) {
    }

    @FXML
    public void btnDemClicked(Event event) {
    }

    @FXML
    public void btnCompClicked(Event event) {
    }

    @FXML
    public void btnAideClicked(Event event) {
    }

    @FXML
    public void btnCreerDemClicked(Event event) {
    }

    @FXML
    public void btnModifDemClicked(Event event) {
    }

    @FXML
    public void btnCreerComp(Event event) {
    }

    @FXML
    public void btnModifComp(Event event) {
    }
}