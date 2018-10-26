package com.hackademy;

public class ExerciseOne
{
    public ExerciseOne()
    {
        result = 0;
    }

    public int sumMultiples()
    {
        for (int i = 1; i<1000;i++)
        {
            if(i%3 == 0 || i%5 == 0)
            {
                result += i;
            }
        }
        return result;
    }

    private int result;
}
