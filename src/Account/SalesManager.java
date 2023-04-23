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

    public long trimAverage () {
        long maxInAv = 0;
        long minInAv = 0;
        long sum = 0;

        for (long sale : sales) {
            if (sale < maxInAv) {
                maxInAv = sale;
            }
            if (sale > minInAv) {
                minInAv = sale;
            }
            sum += sale;
        }

        long result = (sum - maxInAv - minInAv) / (sales.length - 2);
        return result;
        }

    }
