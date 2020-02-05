module JavaFXChallenge {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    exports sample.datamodel;

    opens sample;
}