package com.sjcl.zrsy_demo.domain;

import java.util.Optional;

public class BigchaindbData<T> {
    private T data;
    private String type;

    public BigchaindbData(T data) {
        this.data = data;
        this.type = data.getClass().getCanonicalName();
    }

    public String getType() {
        return data == null ? null : data.getClass().getCanonicalName();
    }


    public T getData() {
        return data;
    }

    public void setData(T object) {
        this.data = object;
    }

    public Optional optional() {
        return Optional.ofNullable(data);
    }
}
