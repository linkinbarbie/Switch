package com.company;

//Using Switch to derive a month calculator. The methods check for leap years and how many days are in a month
public class NumberOfDays {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 1601));
       //System.out.println(isLeapYear(10000));
    }

    public static boolean isLeapYear(int Year) {
        if (Year < 1 || Year > 9999) {
            return false;
        } else if (Year % 400 == 0 || (Year % 4 == 0 && Year % 100 != 0)) {
            return true;
        } else {
            return false;
        }


    }

    public static int getDaysInMonth(int Month, int Years) {
        if ((Month == 1 ||Month >= 3 && Month <= 12) && ((isLeapYear(Years)  && Years >=1 && Years <= 9999)
                || (!isLeapYear(Years) && Years >=1 && Years <= 9999))) {
            int Answer;
            switch (Month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    Answer = 31 ;
                    break;


                case 2:
                     Answer = 28;
                    break;


                case 4:
                case 6:
                case 9:
                case 11:
                    Answer = 30;
                    break;

                default:
                     Answer = -1;
                break;

            }
            return Answer;
        }
        else if (Month == 2 &&  isLeapYear(Years) && Years >=1 && Years <= 9999) {
            return 29;
        }
        else if (Month == 2 &&  !isLeapYear(Years) && Years >=1 && Years <= 9999)
        {return 28;}
        else {
            return -1;
        }
    }
}
