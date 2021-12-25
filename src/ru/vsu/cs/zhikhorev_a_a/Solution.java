package ru.vsu.cs.zhikhorev_a_a;

public class Solution {

    public static int findMaxSumOfConsecutiveElements(int[] arr) {
        int sumBeforeNegativeNumber = 0;
        int sumAfterNegativeNumber = 0;
        int sumWithNegativeNumber = 0;
        int sumResult = 0;
        int counterOfNegativeNumbers = 0;
        int biggestNegativeNumber = 0;
        boolean didYouHaveNegativeNumberInRowBefore = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0 && didYouHaveNegativeNumberInRowBefore == false) {
                sumBeforeNegativeNumber += arr[i];
            }

            if (arr[i] < 0 && didYouHaveNegativeNumberInRowBefore == true) {
                if (sumBeforeNegativeNumber >= sumAfterNegativeNumber && sumBeforeNegativeNumber >= sumWithNegativeNumber && sumBeforeNegativeNumber >= sumResult) {
                    sumResult = sumBeforeNegativeNumber;
                    sumBeforeNegativeNumber = arr[i - 1];
                }
                if (sumWithNegativeNumber >= sumBeforeNegativeNumber && sumWithNegativeNumber >= sumAfterNegativeNumber && sumWithNegativeNumber >= sumResult) {
                    sumResult = sumWithNegativeNumber;
                    sumBeforeNegativeNumber = sumResult;
                }

                if (sumAfterNegativeNumber >= sumBeforeNegativeNumber && sumAfterNegativeNumber >= sumWithNegativeNumber && sumAfterNegativeNumber >= sumResult) {
                    sumResult = sumAfterNegativeNumber;
                    sumBeforeNegativeNumber = sumResult;
                }
                didYouHaveNegativeNumberInRowBefore = false;
                sumAfterNegativeNumber = 0;

            }

            if (arr[i] < 0 && didYouHaveNegativeNumberInRowBefore == false) {
                sumWithNegativeNumber = sumBeforeNegativeNumber + arr[i];
                didYouHaveNegativeNumberInRowBefore = true;
            }

            if (arr[i] >= 0 && didYouHaveNegativeNumberInRowBefore == true) {
                sumAfterNegativeNumber += arr[i];
                sumWithNegativeNumber += arr[i];
            }

            if (arr.length - i == 1) {
                if (sumBeforeNegativeNumber >= sumAfterNegativeNumber && sumBeforeNegativeNumber >= sumWithNegativeNumber && sumBeforeNegativeNumber >= sumResult) {
                    sumResult = sumBeforeNegativeNumber;

                }
                if (sumWithNegativeNumber >= sumBeforeNegativeNumber && sumWithNegativeNumber >= sumAfterNegativeNumber && sumWithNegativeNumber >= sumResult) {
                    sumResult = sumWithNegativeNumber;

                }

                if (sumAfterNegativeNumber >= sumBeforeNegativeNumber && sumAfterNegativeNumber >= sumWithNegativeNumber && sumAfterNegativeNumber >= sumResult) {
                    sumResult = sumAfterNegativeNumber;
                }

            }

            if (arr[i] < 0) {
                counterOfNegativeNumbers++;
                if (counterOfNegativeNumbers == 1) {
                    biggestNegativeNumber = arr[i];
                }
                if (counterOfNegativeNumbers > 1) {
                    if (arr[i] > biggestNegativeNumber) {
                        biggestNegativeNumber = arr[i];
                    }
                }
            }
        }

        if (counterOfNegativeNumbers == arr.length) {
            return biggestNegativeNumber;
        } else {
            return sumResult;
        }
    }
}



