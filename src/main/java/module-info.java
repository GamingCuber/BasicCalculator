module me.gamingcuber.basiccalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.gamingcuber.basiccalculator to javafx.fxml;
    exports me.gamingcuber.basiccalculator;
}