package calc.ui;

import calc.logic.Calc;
import calc.exceptions.EmptyNumberException;
import calc.exceptions.NullDividerException;
import calc.exceptions.NumberWrongFormatException;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Класс Controller
 */
public class Controller {
    /**
     * @param dividend - текстовое поле делимого
     * @param divider - текстовое поле делителя
     * @param result - текстовое поле результата
     * @param labelError - текстовая переменная для вывода ошибки
     */
    public TextField dividend = new TextField();
    public TextField divider = new TextField();
    public TextField result = new TextField();
    public Label labelError = new Label();

    /**
     * Метод вывода ошибки в окно приложения
     * @param errorDescription - описание ошибки
     * @param erroeMessage - сообщение исключения
     */
    private void showError(String errorDescription, String erroeMessage){
        result.setText("");
        labelError.setText(erroeMessage);
        labelError.setVisible(true);
        System.out.println(errorDescription + erroeMessage);
    }

    /**
     * Метод обработки события нажатия на кнопку "=" в приложении
     * @param actionEvent
     */
    public void toCalculate(ActionEvent actionEvent) {
        labelError.setVisible(false);
        try {
            Calc calc = new Calc();
            result.setText(calc.division(dividend.getText(), divider.getText()));
        } catch (EmptyNumberException e){
            showError("The exception says that: ", e.getMessage());
            return;
        } catch (NullDividerException e){
            showError("The exception says that: ", e.getMessage());
            return;
        } catch (NumberWrongFormatException e){
            showError("The exception says that: ", e.getMessage());
            return;
        } catch (Exception e){
            showError("Oh! Something went wrong!\r\nThe exception says that: ", e.getMessage());
            return;
        }

    }

    public Label getLabelError() {
        return labelError;
    }

    public TextField getDividend() {
        return dividend;
    }

    public TextField getDivider() {
        return divider;
    }

    public TextField getResult() {
        return result;
    }

    public void setDividend(TextField dividend) {
        this.dividend = dividend;
    }

    public void setDivider(TextField divider) {
        this.divider = divider;
    }

    public void setResult(TextField result) {
        this.result = result;
    }

    public void setLabelError(Label labelError) {
        this.labelError = labelError;
    }
}
