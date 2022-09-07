

import java.io.*;

public class Enumeration {
    public enum DayOfWeek{
        MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
        public int val;
        DayOfWeek(int val)
        {
            this.val=val;
        }
            boolean isWorkDay(){
                if(val<6)
                return true;
                else
                return false;
            }
        }
        public static void main(String[] args) {
            DayOfWeek Day;
            System.out.println("Verified of SUNDAY(isWorkDay())");
            System.out.println(DayOfWeek.SUNDAY.isWorkDay());
            System.out.println("Verified of WEDNESDAY(isWorkDay())");
            System.out.println(DayOfWeek.WEDNESDAY.isWorkDay());
        }

     }
 
    