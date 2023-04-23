package Account;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int trimAverage () {
        int maxInAv = 0;
        int minInAv = 0;
        int sum = 0;

        for (int sale : sales) {
            if (sale < maxInAv) {
                maxInAv = sale;
            }
            if (sale > minInAv) {
                minInAv = sale;
            }
            sum += sale;
        }

        int result = (sum - maxInAv - minInAv) / (sales.length - 2);
        return result;
        }

    }
