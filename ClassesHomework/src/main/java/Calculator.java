public class Calculator {
    private long num1;
    private long num2;

    public Calculator (long num1, long num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public long willAdd(){
        return this.num1 + this.num2;
    }

    public long willSubtract(){
        return this.num1 - this.num2;
    }

    public long willMultiply(){
        return this.num1 * this.num2;
    }

    public long willDivide(){
        return this.num1 / this.num2;
    }
}
