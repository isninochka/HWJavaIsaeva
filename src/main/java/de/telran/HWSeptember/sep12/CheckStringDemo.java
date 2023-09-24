package de.telran.HWSeptember.sep12;

public class CheckStringDemo {
    public static void main(String[] args) {

        TextInput textInput = new TextInput();
        String userText = textInput.inputStringLine();

        CheckString checkString = new CheckString();
        boolean checkResult = checkString.checkString(userText);

        TextOutput textOutput = new TextOutput();
        textOutput.printInfo(userText, checkResult);
    }

}
