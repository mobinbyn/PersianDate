import Date.ChangeDate;
import Date.FDate;
 
 
/**
 * Created by Hamed on 06/03/2015.
 */
 
public class Home {
    public static void main(String[] args) {
        System.out.println("Current Date :   "+ ChangeDate.getCurrentDate());
        System.out.println("Shamsi To Miladi :   "+ ChangeDate.changeFarsiToMiladi("1393/12/15"));
        System.out.println("Mildai To Shamsi :   "+ ChangeDate.changeMiladiToFarsi("2015/03/07"));
        System.out.println("kam kardane tedadi saal az tarikhe fe'li :   "+ ChangeDate.decreaseCurrentYear(3));
        System.out.println("kam kardane tedadi saal az tarikhe Morede Nazar :   "+ ChangeDate.decreaseYear("1390/12/15", 3));
        System.out.println("Afzayesh e saal :   "+ ChangeDate.increaseCurrentYear(2));
        System.out.println("Afzayesh e saal (tarikhe entekhabi) :   "+ ChangeDate.increaseYear("1390/12/15",2));
        System.out.println("Date and Time :   "+ ChangeDate.getCurrentDateTimeString());
        System.out.println("Time :   "+ ChangeDate.getCurrentTime());
        System.out.println("Rooze Jaari :   "+ ChangeDate.getCurrentDay());
        System.out.println("Maahe Jaari :   "+ ChangeDate.getCurrentMonth());
        System.out.println("Saale Jaari :   "+ ChangeDate.getCurrentYear());
        System.out.println("tarikhe shamsi be horoof :   "+ ChangeDate.getDayMounthYear());  // Ba vorood be getDayMounthYear mitavanid dastoorate daryaafte naam rooz o maah ra moshahede konid
        System.out.println("Invert :   "+ ChangeDate.invertDate("1393/12/15"));
        FDate fdate = new FDate(System.currentTimeMillis());
        fdate.minusDay(5);
        System.out.println("Minus5 day :   "+ fdate);
        fdate.plusDay(8);
        System.out.println("Plus 8 day :   "+ fdate);
 
 
    }
}
/*
    Current Date :   1393/12/15
    Shamsi To Miladi :   2015/03/06
    Mildai To Shamsi :   1393/12/16
    kam kardane tedadi saal az tarikhe fe'li :   1390/12/15
    kam kardane tedadi saal az tarikhe Morede Nazar :   1387/12/15
    Afzayesh e saal :   1395/12/15
    Afzayesh e saal (tarikhe entekhabi) :   1392/12/15
    Date and Time :   1393/12/15 19:59:17
    Time :   19:59:17
    Rooze Jaari :   15
    Maahe Jaari :   12
    Saale Jaari :   1393
    tarikhe shamsi be horoof :   جمعه پانزدهم اسفند ماه 1393
    Invert :   15/12/1393
    Minus5 day :   1393/12/10
    Plus 8 day :   1393/12/18
*/