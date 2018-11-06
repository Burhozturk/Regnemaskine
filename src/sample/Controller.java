package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.util.ArrayList;

public class Controller
{
    ArrayList<String> arrayList=new ArrayList<String>();

    public TextField textDisplay;



    public void plusKnap(ActionEvent actionEvent) 
    {
        String s=textDisplay.getText();
        System.out.println("Plusknappen er klikket"+s);



        
    }

    public void minusKnap(ActionEvent actionEvent) {
    }

    public void gangeKnap(ActionEvent actionEvent) {
    }

    public void dividereKnap(ActionEvent actionEvent) {
    }

    public void sumKnap(ActionEvent actionEvent)
    {

    }
}
