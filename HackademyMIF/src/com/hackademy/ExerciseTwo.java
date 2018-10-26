package com.hackademy;

import java.util.ArrayList;

public class ExerciseTwo
{
    public ExerciseTwo()
    {
        maxPrime = 0;
        arrPrimes = new ArrayList();
        isPrime = false;
    }

    public int findPrime()
    {
        int numToEvaluate = 2;

        arrPrimes.add(numToEvaluate);

        while (arrPrimes.size() < 10001)
        {
            isPrime = evaluateNumber(numToEvaluate);

            if (isPrime == true)
            {
                if(numToEvaluate != 2)
                {
                    arrPrimes.add(numToEvaluate);
                    numToEvaluate++;
                }
                else
                {
                    numToEvaluate++;
                }

            } else
                {
                    numToEvaluate++;
            }
        }

        maxPrime = arrPrimes.get(arrPrimes.size()-1);
        return (int) maxPrime;
    }


    public boolean evaluateNumber(int prime)
    {
        int contInt = 0;

        for (int i = 1; i <= prime; i++)
        {
            if(contInt > 2)
            {
                break;
            }
            else
            {
                if (prime % i == 0)
                {
                    contInt++;
                }
            }
        }

        if (contInt <= 2 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    boolean isPrime;
    private Object maxPrime;
    private ArrayList arrPrimes;
}