package is.ru.stringcalculator;

public class Calculator {
    
    public static int add(String text)
    {
        if (text.contains("\n"))
        {
            text = replaceNewLine(text);
        }
        
        if (text.equals(""))
        {
            return 0;
        }
        else if (text.contains(","))
        {
            String[] numbers = text.split(",");
            
            return sumSplittedString(numbers);
        }
        else
        {
            return toInt(text);
        }
    }

    private static int toInt(String text)
    {
        return Integer.parseInt(text);
    }

    private static int sumSplittedString(String[] numbers)
    {
        int sum = 0;

        for (int i = 0; i < numbers.length; i = i + 1)
        {
            sum += toInt(numbers[i]);
        }

        return sum;
    }

    private static String replaceNewLine(String text)
    {
        text = text.replace("\n", ",");

        return text;
    }
}