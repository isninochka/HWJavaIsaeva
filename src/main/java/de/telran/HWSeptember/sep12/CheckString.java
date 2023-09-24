package de.telran.HWSeptember.sep12;

public class CheckString {

    public boolean checkString (String userText){
        int stringLength = userText.length();

        CheckNumbers checkNumbers = new CheckNumbers();
        boolean checkResult = checkNumbers.isEven(stringLength);
        return checkResult;
    }
}
