package gr.aueb.cf.cf9.ch17._12_enums;


public class MainWeek {

//    public static void main(String[] args) {
//        for (WeekDay weekDay : WeekDay.values()) {
//            System.out.println(weekDay.getDay());
//        }
//    }

    public static void main(String[] args) {
        for (WeekDay x : WeekDay.values()){
            System.out.println(x.name());
            System.out.println(x.getDay());
        }
    }
}
