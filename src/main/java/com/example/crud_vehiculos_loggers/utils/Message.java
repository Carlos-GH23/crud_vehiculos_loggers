package com.example.crud_vehiculos_loggers.utils;

public class Message {
    private String text;
    private TypesReponse type;
    private Object result;

    public Message(String text, TypesReponse type) {
        this.text = text;
        this.type = type;
    }

    public Message(Object result,String text, TypesReponse type) {
        this.text = text;
        this.type = type;
        this.result = result;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TypesReponse getType() {
        return type;
    }

    public void setType(TypesReponse type) {
        this.type = type;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
