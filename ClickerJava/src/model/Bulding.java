
package model;

public class Bulding {
    double value;
    double profit;
    String name;
    int timeToProfit;

    public Bulding(double value, double profit, String name, int timeToProfit) {
        this.value = value;
        this.profit = profit;
        this.name = name;
        this.timeToProfit = timeToProfit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeToProfit() {
        return timeToProfit;
    }

    public void setTimeToProfit(int timeToProfit) {
        this.timeToProfit = timeToProfit;
    }
    
}
