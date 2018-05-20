package com.css.headfirstshejimoshi.K;

import java.util.Iterator;

/**
 * Created by 46597 on 2018/5/20.
 */
public class NullIterator implements Iterator{


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

}
