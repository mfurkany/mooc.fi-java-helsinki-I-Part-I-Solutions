
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    public int getYear(){
        return this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate){
        if(!(this.earlier(comparedDate))){
            if(this.month<comparedDate.month)
                    return this.year-comparedDate.year-1;     
            if (this.month==comparedDate.month){
                if(this.day<comparedDate.day)
                    return this.year-comparedDate.year-1;   
                else return this.year-comparedDate.year;
            }
            else return this.year-comparedDate.year;
        }
        else{
            if(this.month>comparedDate.month)
                    return comparedDate.year-this.year-1;     
            if (this.month==comparedDate.month){
                if(this.day>comparedDate.day)
                    return comparedDate.year-this.year-1;     
                else return comparedDate.year-this.year;     
            }
            else return comparedDate.year-this.year;
        }                        
    }

  
}
