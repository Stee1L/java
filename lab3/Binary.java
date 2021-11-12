public class Binary {
    private String Number;
    public Binary(String number)
    {
        try {
            if(isBinary(number)) Number = number;
        }
        catch (IllegalArgumentException error)
        {
            System.out.println("Input problem!");
            System.out.println(error);
        }
    }

    public boolean isBinary(String number)
    {
        for(int i = 0; i < number.length(); i++)
            if(number.charAt(i) != '0' && number.charAt(i) != '1') throw new IllegalArgumentException("Invalid number!");
        return true;
    }

    public String getNumber() { return Number; }
    public void setNumber(String number)
    {
        try {
            if(isBinary(number)) Number = number;
        }
        catch (IllegalArgumentException error)
        {
            System.out.println("Input problem!");
            System.out.println(error);
        }
    }

    public String Addition(String number)
    {
        try {
            isBinary(number);
        }
        catch (IllegalArgumentException error)
        {
            System.out.println("Input problem!");
            System.out.println(error);
        }
        return getBinary(getDecimal(Number) + getDecimal(number));
    }

    public String Division(String number)
    {
        try {
            isBinary(number);
        }
        catch (IllegalArgumentException error)
        {
            System.out.println("Input problem!");
            System.out.println(error);
        }
        return getBinary(getDecimal(Number) - getDecimal(number));
    }

    public int getDecimal(String number)
    {
        try {
            isBinary(number);
        }
        catch (IllegalArgumentException error)
        {
            System.out.println("Input problem!");
            System.out.println(error);
        }
        int decNumber = 0;
        for(int i = number.length() - 1; i >= 0; i--)
            if(number.charAt(i) == '1') decNumber += Math.pow(2, (number.length() - i - 1));
        return decNumber;
    }

    public String getBinary(int number)
    {
        int decNumber = number;
        StringBuilder binNumber = new StringBuilder();
        while (decNumber != 0)
        {
            binNumber.append(decNumber % 2);
            decNumber /= 2;
        }
        return binNumber.reverse().toString();
    }
}
