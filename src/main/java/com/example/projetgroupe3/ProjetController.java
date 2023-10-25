package com.example.projetgroupe3;

import com.example.projetgroupe3.Entities.Demande;
import com.example.projetgroupe3.Tools.ConnexionBDD;
import com.example.projetgroupe3.Tools.ServiceDemandes;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ProjetController implements Initializable {

    ConnexionBDD maCnx;
    ServiceDemandes serviceDemandes = new ServiceDemandes();

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
    private TreeMap<String, TreeMap<String, Demande>> mesAides;
    TreeItem root;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }




    @FXML
    public void btnValiderClicked(Event event) {
    }

    @FXML
    public void btnDemClicked(Event event) {
        apDem.toFront();
    }

    @FXML
    public void btnCompClicked(Event event) {
        apComp.toFront();
    }

    @FXML
    public void btnAideClicked(Event event) {
        apAide.toFront();
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

    public void btnEtudiantClicked(Event Event) {
        apEtudiant.toFront();
    }

    public void btnAdminClicked(Event Event) {
        apAdmin.toFront();
    }


}