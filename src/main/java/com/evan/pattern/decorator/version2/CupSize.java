package com.evan.pattern.decorator.version2;

/**
 * Created by wangzhen318 on 2017/5/17.
 */
public enum CupSize {
    LITTLE(1, "小杯"),
    MIDDLE(2, "中杯"),
    BIG(3, "大杯");

    private int size;
    private String desc;

    CupSize(int size, String desc) {
        this.size = size;
        this.desc = desc;
    }

    public int getSize() {
        return size;
    }

    public String getDesc() {
        return desc;
    }

    public static CupSize getBySize(int size) {
        for (CupSize cupSize : CupSize.values()) {
            if (cupSize.getSize() == size) {
                return cupSize;
            }
        }
        return null;
    }
}
