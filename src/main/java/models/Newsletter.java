package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "newsletters")
public class Newsletter {
    @Id
    private String id;
    private String title = "";
   

    private String header = "";
    private String[] blocks = null;
    private String footer = "";

    // Constructors, getters, and setters

    //getter and setter for Id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    //getter and setter for Title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //getter and setter for Header
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }

    //getter and setter for Blocks
    public String[] getBlocks() {
        return blocks;
    }
    public void setBlocks(String[] blocks) {
        this.blocks = blocks;
    }

    //getter and setter for Footer
    public String getFooter() {
        return footer;
    }
    public void setFooter(String footer) {
        this.footer = footer;
    }
}
