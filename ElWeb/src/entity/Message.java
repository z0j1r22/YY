package entity;

import java.io.Serializable;

public class Message implements Serializable {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息的内容
     */
    private String content;

    public Message() {
    }

    public Message(Integer code, String content) {
        this.code = code;
        this.content = content;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
