package com.zahra.astro.data;

public class Topic_Item {
    private int topic_image;
    private String topic_name;

    public Topic_Item(int topic_image, String topic_name) {
        this.topic_image = topic_image;
        this.topic_name = topic_name;
    }

    public int getTopic_image() {
        return topic_image;
    }

    public void setTopic_image(int topic_image) {
        this.topic_image = topic_image;
    }

    public String getTopic_name() {
        return topic_name;
    }

    public void setTopic_name(String topic_name) {
        this.topic_name = topic_name;
    }
}
