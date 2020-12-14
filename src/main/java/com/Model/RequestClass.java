package com.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RequestClass {
    private String language;
    private String content;
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RequestClass () {}

    public RequestClass (String content, String language) {
        this.content = content;
        this.language = language;
        if (this.language.equals("C#")) {
            this.link = "./com/File/C#/main.cs";
        } else {
            this.link = "./com/File/Java/main.java";
        }
        File f = new File(this.link);
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(this.content);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
