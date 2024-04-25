
public class ResultCalcualtion {
    private int qi[] = new int[4], rate1[] = new int[4], rate2[] = new int[4], sum1, sum2;
    private String st;

    public void resultOfSum(Choice2 valueOf) {
        setqi(valueOf);
        setrate1(valueOf);
        setrate2(valueOf);
        CalculateandCompareSum();
    }

    public void setqi(Choice2 valueOf) {
        qi[0] = valueOf.i1;
        qi[1] = valueOf.i2;
        qi[2] = valueOf.i3;
        qi[3] = valueOf.i4;
    }

    public void setrate1(Choice2 valueOf) {
        rate1[0] = valueOf.v1q1;
        rate1[1] = valueOf.v1q2;
        rate1[2] = valueOf.v1q3;
        rate1[3] = valueOf.v1q4;
    }

    public void setrate2(Choice2 valueOf) {
        rate2[0] = valueOf.v2q1;
        rate2[1] = valueOf.v2q2;
        rate2[2] = valueOf.v2q3;
        rate2[3] = valueOf.v2q4;
    }

    public void CalculateandCompareSum() {
        for (int i = 0; i < 4; i++) {
            sum1 += (qi[i] * rate1[i]);
            sum2 += (qi[i] * rate2[i]);
        }
        if (sum1 > sum2)
            st = "\"Choice 1\"";
        else if (sum2 > sum1)
            st = "\"Choice 2\"";
        else
            st = "(Error)";
    }

    public String getSt() {
        return st;
    }

    public int getSum1() {
        return sum1;
    }

    public int getSum2() {
        return sum2;
    }
}
