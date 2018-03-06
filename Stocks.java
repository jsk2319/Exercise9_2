import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Stocks extends Application{

    public void start(Stage primaryStage) {
        Stock oracleCorp = new Stock("ORCL", "Oracle Corporation");

        oracleCorp.previousClosingPrice = 34.5;
        oracleCorp.currentPrice = 34.35;

        Alert stockWindow = new Alert(Alert.AlertType.INFORMATION);
        stockWindow.setTitle("Stocks");
        stockWindow.setContentText("The Stock's name is " + oracleCorp.name + ".\nIt's symbol is " + oracleCorp.symbol + ".\nThe stock's price change is " +  oracleCorp.getChangePercent());
        stockWindow.showAndWait();

    }
}

class Stock{
    String symbol;
    String name;

    Double previousClosingPrice;
    Double currentPrice;

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    Double getChangePercent(){
        return (currentPrice - previousClosingPrice)/previousClosingPrice;
    }
}
