package de.telran.HWSeptember.Sep12.Praktika;

import de.telran.HWSeptember.Sep12.Praktika.CheckNumbers;

public class CheckString {

    public boolean checkString (String userText){
        int stringLength = userText.length();

        CheckNumbers checkNumbers = new CheckNumbers();
        boolean checkResult = checkNumbers.isEven(stringLength);
        return checkResult;
    }
}
