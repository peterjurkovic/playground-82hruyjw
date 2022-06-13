package com.yourself;

public class Greeting {

    public Greeting() {
    }

    public void setId(long id) {
        this.id = id;
    }

    private  long id;
    private  String content;






    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
       this.content=content;
    }
}
