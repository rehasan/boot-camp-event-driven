package com.tw.backend.dto;

public class Costume {
    protected final String costumeId;
    protected final Condition condition;

    public Costume(final String costumeId, final Condition condition) {
        this.costumeId = costumeId;
        this.condition = condition;
    }

    public String getCostumeId() {
        return this.costumeId;
    }

    public Condition getCondition() {
        return this.condition;
    }
}