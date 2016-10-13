package is.ru.stringcalculator;

public class Calculator {
    
    public static String add(String text)
    {
        if (text.contains("\n"))
        {
            text = replaceNewLine(text);
        }
        
        if (text.equals(""))
        {
            return "";
        }
        else if (text.contains(","))
        {
            String[] numbers = text.split(",");
            String negativeResult = "Negatives not allowed: ";

            if (text.contains("-"))
            {
                for (int i = 0; i < numbers.length; i = i + 1)
                {
                    if (numbers[i].contains("-"))
                    {
                        negativeResult += numbers[i] + ",";
                    }
                }

                return negativeResult;
            }
            
            return sumSplittedString(numbers);
        }
        else
        {
            return text;
        }
    }

    private static int toInt(String text)
    {
        return Integer.parseInt(text);
    }

    private static String sumSplittedString(String[] numbers)
    {
        int sum = 0;

        for (int i = 0; i < numbers.length; i = i + 1)
        {
            if (toInt(numbers[i]) > 999)
            {

            }
            else
            {
                sum += toInt(numbers[i]);
            }
        }

        return Integer.toString(sum);
    }

    private static String replaceNewLine(String text)
    {
        text = text.replace("\n", ",");

        return text;
    }
}