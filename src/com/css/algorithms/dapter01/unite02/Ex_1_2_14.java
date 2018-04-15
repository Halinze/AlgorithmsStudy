package com.css.algorithms.dapter01.unite02;

/**
 * Created by 46597 on 2018/4/13.
 */
public class Ex_1_2_14 {

    /**
     * 用我们对Date中的equals()方法的实现（请见1.2.5.8节中的Date类代码框）作为模板，
     * 实现Transaction中的equals方法；
     *
     * Transaction(Stirng who ,SmartDate when ,double amount) 创建一笔交易
     * String who()                                           客户名
     * Date when()                                             交易日期
     * Double amount()                                         交易金额
     * String  toString()                                      对象的字符串表示
     * boolean equals（Object that）
     *
     *
     */



}


class Transaction extends Object{

    private String  who ;
    private SmartDate when ;
    private Double amount;

    public Transaction( String who , SmartDate when , double amount ){
        this.who = who;
        this.when = when ;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "who='" + who + '\'' +
                ", when=" + when +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;
        //两个三元运算符
        if (who != null ? !who.equals(that.who) : that.who != null) return false;
        if (when != null ? !when.equals(that.when) : that.when != null) return false;
        return amount != null ? amount.equals(that.amount) : that.amount == null;
    }

    //根据api , 在复写equals（）方法是，要维护协定：  不同的对象 hascode 不相等！
    @Override
    public int hashCode() {
        int result = who != null ? who.hashCode() : 0;
        result = 31 * result + (when != null ? when.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    public String getWho() {
        return who;
    }

    public void Who(String who) {
        this.who = who;
    }

    public SmartDate When() {
        return when;
    }

    public void setWhen(SmartDate when) {
        this.when = when;
    }

    public Double Amount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}