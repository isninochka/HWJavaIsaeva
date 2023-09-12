package de.telran.HWSeptember.Sep12.Praktika;

import lesson12.CheckNumbers;

public class CheckString {

    public boolean checkText (String userText){
        int stringLength = userText.length();

        CheckNumbers checkNumbers = new CheckNumbers();
        boolean checkResult = checkNumbers.isEven(stringLength);
        return checkResult;
    }
}
