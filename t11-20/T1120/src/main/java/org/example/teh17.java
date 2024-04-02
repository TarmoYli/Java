package org.example;

public class teh17
{
    static String Stringverter(String ogString)
    {
        int ogLen = ogString.length();
        char[] invert = new char[ogLen];
        for (int i = 0; i < ogString.length(); i++)
        {
            invert[i] = ogString.charAt(ogLen-i-1);
        }
        return new String(invert);
    }
}