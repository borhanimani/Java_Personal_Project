
import java.io.Serializable;

public class MyDate implements Cloneable, Comparable<MyDate>, Serializable {

    private int year;
    private int month;
    private int day;

    MyDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDateYear() {
        return this.year;
    }

    public int getDateMonth() {
        return this.month;
    }

    public int getDateDay() {
        return this.day;
    }

    public void print() {
        System.out.print(this.month + "/" + this.day + "/" + this.year);
    }

    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    // Lab3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public Boolean isNotExpired(MyDate expiryDate) {
        if (this.year < expiryDate.year) {
            return true;
        } else if (this.year > expiryDate.year) {
            return false;
        } else {
            if (this.month < expiryDate.month) {
                return true;
            } else if (this.month > expiryDate.month) {
                return false;
            } else {
                if (this.day <= expiryDate.day) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    // Lab4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public MyDate(MyDate date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    @Override
    public MyDate clone() throws CloneNotSupportedException {
        return (MyDate) super.clone();
    }

    public int compareTo(MyDate date) {
        if (this.year > date.year) {
            return 1;
        } else if (this.year < date.year) {
            return -1;
        } else {
            if (this.month > date.month) {
                return 1;
            } else if (this.month < date.month) {
                return -1;
            } else {
                if (this.day > date.day) {
                    return 1;
                } else if (this.day < date.day) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public void changeDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String toDilimtedString() {
        return this.day + "," + this.month + "," + this.year;
    }

    //lab 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
