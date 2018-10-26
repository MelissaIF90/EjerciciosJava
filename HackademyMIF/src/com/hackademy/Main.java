package com.hackademy;

public class Main
{
    public static void main(String[] args)
    {
        ExerciseOne myExerciseOne = new ExerciseOne();
        StringBuilder sb = new StringBuilder("The sum of all the multiples of 3 or 5 below 1000 is ");
        System.out.println(sb.append(myExerciseOne.sumMultiples()));

        sb.delete(0,sb.length());

        ExerciseTwo myExerciseTwo = new ExerciseTwo();
        sb.append("The 10,001st prime number is ");
        System.out.println(sb.append(myExerciseTwo.findPrime()));


    }
}
