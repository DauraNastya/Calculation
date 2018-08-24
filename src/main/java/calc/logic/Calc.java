package calc.logic;

import calc.exceptions.EmptyNumberException;
import calc.exceptions.NullDividerException;
import calc.exceptions.NumberWrongFormatException;

/**
 * Класс Calc - содержит в себе логику приложения Calculation. Принимает из графичческого интерфейса значения
 * делимого и делителя и реализует функцию деления
 */
public class Calc {
    float dividend, divider;
    int flagComma;

    /**
     * Calc - конструктор без параметров
     */
    public Calc(){
        this.dividend = 0;
        this.divider = 0;
        this.flagComma = 0;
    }

    /**
     * Проверяет строку на корректность для конвертации в число
     * @param str - строка содержит значение из текстового поля приложения.
     * @return - возвращает флаг результата проверки, true – корректная, false - нет.
     */
    public boolean isNumber(String str)  {
        if (str.matches("^[-]?[0-9]*[.|,]?[0-9]+$")){
            if (str.indexOf(",") == -1){
                return true;
            } else {
                this.flagComma = 1;
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Выполняет деление одного числа на другое
     * @param a - строка содержит значение из текстового поля dividend приложения.
     * @param b - строка содержит значение из текстового поля divider приложения.
     * @return - метод возвращает результат деленя параметра a на параметр b в виде строки.
     * @throws NumberWrongFormatException -  выбброс исключения при неверном формате числа.
     * @throws NullDividerException - выброс исключения при делителе равном нулю.
     * @throws EmptyNumberException - выброс исключения при не заданных делимом и делителе.
     */
    public String division(String a, String b) throws NumberWrongFormatException, NullDividerException, EmptyNumberException {
        if (a.isEmpty() || b.isEmpty()) {
            throw new EmptyNumberException(" You didn't enter dividend or divider! ");
        } else if (!isNumber(a) || !isNumber(b)){
            if (this.flagComma == 0) {
                throw new NumberWrongFormatException(" Wrong format of dividend or divider!\r\n Maybe it is not a number! ");
            } else {
                throw new NumberWrongFormatException(" Wrong format of dividend or divider!\r\n The number must be written through a point! ");
            }
        } else {
                this.dividend = new Float(a);
                this.divider = new Float(b);
            if (this.divider == 0) {
                throw new NullDividerException(" Divider is NULL! ");
            } else {
                return Float.toString(this.dividend/this.divider);
            }
        }
    }
}
