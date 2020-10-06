package model;


public class Operation {
    private int number1;
    private int number2;
    private int result;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        if("".equals(number1)){
            this.number1 = 0;
        }
        else{
            this.number1 = Integer.parseInt(number1);
        }
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        if("".equals(number2)){
            this.number2 = 0;
        }
        else{
            this.number2 = Integer.parseInt(number2);
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
      
    public int add(){
        this.result = this.number1 + this.number2;
        return this.result;
    }
    
    public int sub(){
        this.result = this.number1 - this.number2;
        return this.result;
    }
    
    public int div(){
        this.result = this.number1 / this.number2;
        return this.result;
    }
    
    public int mult(){
        this.result = this.number1 * this.number2;
        return this.result;
    }
}
