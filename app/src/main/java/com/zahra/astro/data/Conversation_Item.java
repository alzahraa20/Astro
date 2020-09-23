package com.zahra.astro.data;

public class Conversation_Item {
    private String text1;
    private String Text2;

    public Conversation_Item(String text1, String text2) {
        this.text1 = text1;
        this.Text2 = text2;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return Text2;
    }

    public void setText2(String text2) {
        Text2 = text2;
    }
}
